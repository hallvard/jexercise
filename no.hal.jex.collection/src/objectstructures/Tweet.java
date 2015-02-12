package objectstructures;

public class Tweet {
	
	private TwitterAccount owner;
	private String text;
	private Tweet originalTweet = null;
	private int retweetCount = 0;
	
	public Tweet(TwitterAccount owner, String text) {
		this.owner = owner;
		this.text = text;
	}
	
	public Tweet(TwitterAccount owner, Tweet originalTweet) {
		Tweet originalOriginalTweet = originalTweet.getOriginalTweet();
		if (originalTweet.getOwner() == owner || (originalOriginalTweet != null && originalOriginalTweet.getOwner() == owner)) {
			throw new IllegalArgumentException("A tweet cannot be a retweet from the same author");
		}
		this.owner = owner;
		this.originalTweet = (originalOriginalTweet != null ? originalOriginalTweet : originalTweet);
		this.originalTweet.retweetCount++;
		this.text = this.originalTweet.getText();
	}
	
	@Override
	public String toString() {
		return "[" + owner.getUserName() + ": " + getText() + (originalTweet == null ? "" : " - retweet of " + originalTweet.getOwner().getUserName()) + "]";
	}	
	
	public String getText() {
		return text;
	}
	
	public TwitterAccount getOwner() {
		return owner;
	}
	
	public Tweet getOriginalTweet() {
		return originalTweet;
	}
	
	public int getRetweetCount() {
		return retweetCount;
	}
}
