package no.hal.emfs.git;

import java.io.File;
import java.io.IOException;

import org.eclipse.jgit.api.CreateBranchCommand.SetupUpstreamMode;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.GitCommand;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.storage.file.FileRepositoryBuilder;

public class GitExportSupport {

	private static String defaultGitDirectory = "git";

	private String gitDirectory = defaultGitDirectory;

	public void setGitDirectory(String gitDirectory) {
		this.gitDirectory = gitDirectory;
	}
	
	protected File getLocalGitDirectory() {
		String dir = gitDirectory;
		return (dir.startsWith(File.separator) ? new File(dir) : new File(System.getProperty("user.home"), dir));
	}

	protected String getRepoPath(GitRepoRef repo) {
		return getLocalGitDirectory() + "/" + repo.repo;
	}

    protected String getDotGit(GitRepoRef repo) {
    	return getRepoPath(repo) + "/.git";
    }
    
    private Repository getRepo(GitRepoRef repo) {
    	FileRepositoryBuilder builder = new FileRepositoryBuilder();
    	try {
    		return builder
	    		.setGitDir(getLocalGitDirectory())
	    		.readEnvironment() // scan environment GIT_* variables
	    		.findGitDir() // scan up the file system tree
	    		.build();
    	} catch (IOException e) {
    		throw new RuntimeException("Couldn't get .git file", e);
    	}
    }

    private Git getGit(GitRepoRef repo) {
		return new Git(getRepo(repo));
    }
    
    void cloneRepo(GitRepoRef repo) {
        String remoteString = repo.getRemoteString("https");
		File dir = new File(getRepoPath(repo));
		callCommand(
        	Git.cloneRepository()
        	.setURI(remoteString)
            .setDirectory(dir)
		);
    }
    void trackMaster(GitRepoRef repo) {
    	callCommand(
    		getGit(repo)
        	.branchCreate().setName("master")
            .setUpstreamMode(SetupUpstreamMode.SET_UPSTREAM)
            .setStartPoint("origin/master")
            .setForce(true)
        );
    }

    void addFile(GitRepoRef repo, String fileName, String message) {
    	callCommand(
    		getGit(repo).add()
        	.addFilepattern(fileName)
    	);
    	if (message != null) {
    		commit(repo, message);
    	}
    }

    void commit(GitRepoRef repo, String message) {
    	callCommand(
    		getGit(repo).commit()
    		.setMessage(message)
		);
    }

    void push(GitRepoRef repo) {
    	callCommand(
    		getGit(repo)
        	.push()
        );
    }

    void pull(GitRepoRef repo) {
    	callCommand(
    		getGit(repo)
        	.pull()
    	);
    }

	protected <T> T callCommand(GitCommand<T> command) {
		System.out.println("Calling " + command);
		try {
			return command.call();
		} catch (Exception e) {
			throw new RuntimeException("Exception calling Git " + command + ": " + e, e);
		}
	}

	public File getFile(GitRepoRef repo, String fileName, boolean pull) {
		File gitDir = getLocalGitDirectory();
		if (! gitDir.exists()) {
			gitDir.mkdir();
			cloneRepo(repo);
		}
		String repoPath = getRepoPath(repo);
		File repoDir = new File(repoPath);
		if (! repoDir.exists()) {
			cloneRepo(repo);
		} else if (pull) {
//			pull(repo);
		}
		return new File(repoPath, fileName);
	}
	
	// from ImportSupport
	
	public File provideExport(String spec) {
		String fragment = "/";
		int fragmentPos = spec.lastIndexOf("#");
		if (fragmentPos >= 0) {
			fragment = spec.substring(fragmentPos + 1);
			spec = spec.substring(0, fragmentPos);
		}
		GitRepoRef repoRef = GitRepoRef.valueOf(spec);
		return (repoRef != null ? getFile(repoRef, fragment, true) : null);
	}
}
