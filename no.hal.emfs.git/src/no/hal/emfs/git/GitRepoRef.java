package no.hal.emfs.git;

import java.net.URI;

public class GitRepoRef {
	
	public final String host;
	public final String owner;
	public final String repo;
	

	public GitRepoRef(String host, String owner, String repo) {
		this.host = host;
		this.owner = owner;
		if (repo.endsWith(REMOTE_STRING_SUFFIX)) {
			repo = repo.substring(0, repo.length() - REMOTE_STRING_SUFFIX.length());
		}
		this.repo = repo;
	}

	@Override
	public String toString() {
		return getRemoteString("git");
	}

	private static String REMOTE_STRING_PREFIX = "git@";
	private static String REMOTE_STRING_SUFFIX = ".git";
	
	public static GitRepoRef valueOf(String remoteString) {
		GitRepoRef repoRef = null;
		if (remoteString.startsWith(REMOTE_STRING_PREFIX)) {
			// git@github.com:hallvard/jexercise.git
			int pos = remoteString.lastIndexOf('/');
			if (pos > 0) {
				String repo = remoteString.substring(pos + 1);
				remoteString = remoteString.substring(0, pos);
				String owner = null;
				pos = remoteString.lastIndexOf(':');
				if (pos > 0) {
					owner = remoteString.substring(pos + 1);
					remoteString = remoteString.substring(0, pos);
				}
				String host = remoteString.substring(REMOTE_STRING_PREFIX.length());
				repoRef = new GitRepoRef(host, owner, repo);
			}
		} else {
			try {
				URI uri = new URI(remoteString);
				String scheme = uri.getScheme();
				if ("http".equals(scheme) || "https".equals(scheme)) {
					// https://github.com/hallvard/jexercise.git
					String path = uri.getPath();
					if (path.startsWith("/")) {
						path = path.substring(1);
					}
					String[] segments = path.split("/");
					int num = segments.length;
					if (num < 1) {
						return null;
					}
					String owner = (num > 1 ? segments[0] : null);
					repoRef = new GitRepoRef(uri.getHost(), owner, segments[num - 1]);
				} else if ("ssh".equals(scheme)) {
					// ssh://hallvard@github.com/jexercise.git
					String path = uri.getPath();
					if (path.startsWith("/")) {
						path = path.substring(1);
					}
					String host = uri.getHost(), owner = null;
					int pos = host.indexOf('@');
					if (pos >= 0) {
						owner = host.substring(0, pos);
						host = host.substring(pos + 1);
					}
					repoRef = new GitRepoRef(host, owner, path);
				}
			} catch (Exception e) {
			}
		}
		return repoRef;
	}
	
	public String getRemoteString(String protocol) {
		String remote = host;
		if (protocol == null || "git".equals(protocol)) {
			// git@github.com:hallvard/jexercise.git
			remote = REMOTE_STRING_PREFIX + remote;
			if (owner != null) {
				remote += ':' + owner;
			}
		} else if ("http".equals(protocol) || "https".equals(protocol)) {
			// https://github.com/hallvard/jexercise.git
			remote = protocol + "://" + remote;
			if (owner != null) {
				remote += '/' + owner;
			}
		} else if ("ssh".equals(protocol)) {
			// ssh://hallvard@github.com/jexercise.git
			if (owner != null) {
				remote = owner + '@' + remote;
			}
			remote = protocol + "://";
		}
		return remote + "/" + repo + REMOTE_STRING_SUFFIX;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((host == null) ? 0 : host.hashCode());
		result = prime * result + ((owner == null) ? 0 : owner.hashCode());
		result = prime * result + ((repo == null) ? 0 : repo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GitRepoRef other = (GitRepoRef) obj;
		if (host == null) {
			if (other.host != null)
				return false;
		} else if (!host.equals(other.host))
			return false;
		if (owner == null) {
			if (other.owner != null)
				return false;
		} else if (!owner.equals(other.owner))
			return false;
		if (repo == null) {
			if (other.repo != null)
				return false;
		} else if (!repo.equals(other.repo))
			return false;
		return true;
	}
}
