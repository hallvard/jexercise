package stateandbehavior;

import java.util.Random;

public class RandomStringGenerator {
	
	private Random random = new Random();
	
	private String konsonanter = "bcdfghjklmnpqrstvwxz";
	private String vokaler = "aeiouyæøå";
	
	private char getRandomChar(String chars) {
		return chars.charAt(random.nextInt(chars.length()));
	}
	
	public String getRandomString() {
		int length = 3 + random.nextInt(8);
		String result = "";
		while (result.length() < length) {
			char c = getRandomChar(result.length() % 2 == 0 ? konsonanter : vokaler);
			result = result + c;
		}
		return result;
	}

	public static void main(String[] args) {
		RandomStringGenerator rsg = new RandomStringGenerator();
		for (int i = 0; i < 10; i++) {
			System.out.println(rsg.getRandomString());
		}
	}
}
