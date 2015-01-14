package no.hal.emfs.git;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;

public class GithubRepoRef extends GitRepoRef {

	public GithubRepoRef(String owner, String repo) {
		super("github.com", owner, repo);
	}

	public URI getUri() {
		try {
			return new URI("https", "github.com", File.separator + owner + File.separator + repo + ".git");
		} catch (URISyntaxException e) {
		}
		return null;
	}
}
