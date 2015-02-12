package objectstructures;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class TwitterAccount {
	
	private final String userName;
	
	private Collection<TwitterAccount> follows = new ArrayList<TwitterAccount>();
	private Collection<TwitterAccount> followers = new ArrayList<TwitterAccount>();

	private List<Tweet> tweets = new ArrayList<Tweet>();
	
	public TwitterAccount(String username) {
		this.userName = username;
	}
		
	public String toString() {
		return "[Username: " + getUserName() + " - " + getTweetCount() + " tweets]";
	}

	public String getUserName() {
		return userName;
	}
	
	public void follow(TwitterAccount otherUser) {
		if (this == otherUser) {
			throw new IllegalStateException("You cannot follow yourself.");
		}
		if (! follows.contains(otherUser)) {
			follows.add(otherUser);
			otherUser.followers.add(this);
		}
	}
	
	public void unfollow(TwitterAccount otherUser) {
		if (follows.contains(otherUser)) {
			follows.remove(otherUser);
			otherUser.followers.remove(this);
		}
	}

	public boolean isFollowing(TwitterAccount otherUser) {
		return follows.contains(otherUser);
	}
	
	public boolean isFollowedBy(TwitterAccount otherUser) {
		return followers.contains(otherUser);
	}
	
	public void tweet(String text) {
		tweets.add(new Tweet(this, text));
	}
	
	public void retweet(Tweet tweet) {
		tweets.add(new Tweet(this, tweet));
	}
	
	public Tweet getTweet(int i) {
		return tweets.get(tweets.size() - i);
	}
	
	public int getTweetCount() {
		return tweets.size();
	}

	public int getRetweetCount() {
		int count = 0;
		for (Tweet tweet : tweets) {
			count += tweet.getRetweetCount();
		}
		return count;
	}
}