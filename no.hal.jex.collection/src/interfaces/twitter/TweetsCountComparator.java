package interfaces.twitter;

import java.util.Comparator;

public class TweetsCountComparator implements Comparator<TwitterAccount>{
	
	//Sorterer twitteraccountene basert på antall tweets. 
	//Accounten med flest tweets vil havne først i listen.
	public int compare(TwitterAccount a1, TwitterAccount a2) {
		return a2.getTweetCount()-a1.getTweetCount();
	}
}
