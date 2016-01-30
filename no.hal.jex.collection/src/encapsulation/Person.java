package encapsulation;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Person {

	private String name;
	private String email;
	private Date birthday;
	private char gender;
	private String ssn;
	private List<String> validCTLDs = Arrays.asList("ad", "ae", "af", "ag", "ai", "al", "am", "ao", "aq", "ar", "as", "at", "au", "aw", "ax", "az", "ba", "bb", "bd", "be", "bf", "bg", "bh", "bi", "bj", "bl", "bm", "bn", "bo", "bq", "br", "bs", "bt", "bv", "bw", "by", "bz", "ca", "cc", "cd", "cf", "cg", "ch", "ci", "ck", "cl", "cm", "cn", "co", "cr", "cu", "cv", "cw", "cx", "cy", "cz", "de", "dj", "dk", "dm", "do", "dz", "ec", "ee", "eg", "eh", "er", "es", "et", "fi", "fj", "fk", "fm", "fo", "fr", "ga", "gb", "gd", "ge", "gf", "gg", "gh", "gi", "gl", "gm", "gn", "gp", "gq", "gr", "gs", "gt", "gu", "gw", "gy", "hk", "hm", "hn", "hr", "ht", "hu", "id", "ie", "il", "im", "in", "io", "iq", "ir", "is", "it", "je", "jm", "jo", "jp", "ke", "kg", "kh", "ki", "km", "kn", "kp", "kr", "kw", "ky", "kz", "la", "lb", "lc", "li", "lk", "lr", "ls", "lt", "lu", "lv", "ly", "ma", "mc", "md", "me", "mf", "mg", "mh", "mk", "ml", "mm", "mn", "mo", "mp", "mq", "mr", "ms", "mt", "mu", "mv", "mw", "mx", "my", "mz", "na", "nc", "ne", "nf", "ng", "ni", "nl", "no", "np", "nr", "nu", "nz", "om", "pa", "pe", "pf", "pg", "ph", "pk", "pl", "pm", "pn", "pr", "ps", "pt", "pw", "py", "qa", "re", "ro", "rs", "ru", "rw", "sa", "sb", "sc", "sd", "se", "sg", "sh", "si", "sj", "sk", "sl", "sm", "sn", "so", "sr", "ss", "st", "sv", "sx", "sy", "sz", "tc", "td", "tf", "tg", "th", "tj", "tk", "tl", "tm", "tn", "to", "tr", "tt", "tv", "tw", "tz", "ua", "ug", "um", "us", "uy", "uz", "va", "vc", "ve", "vg", "vi", "vn", "vu", "wf", "ws", "ye", "yt", "za", "zm", "zw");

	// birthday methods
	
	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		if (! birthday.before(new Date())) {
			throw new IllegalArgumentException(birthday + " is in the future");
		}
		this.birthday = birthday;						
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		if (! (gender == 'F' || gender == 'M' || gender == '\0')) {
			throw new IllegalArgumentException(gender + " is not a valid gender");
		}
		this.gender = gender;
	}

	// name methods
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		String error = checkValidName(name);
		if (error != null) {
			throw new IllegalArgumentException("Illegal name syntax: " + error);
		}
		this.name = name;
	}

	private boolean isLettersOnly(String s, int pos, int end) {
		if (end < 0) {
			end = s.length() + end + 1;
		}
		while (pos < end) {
			if (! Character.isLetter(s.charAt(pos))) {
				return false;
			}
			pos++;
		}
		return true;
	}
	
	private boolean isLettersOrDigitsOnly(String s, int pos, int end) {
		if (end < 0) {
			end = s.length() + end + 1;
		}
		while (pos < end) {
			if (! Character.isLetterOrDigit(s.charAt(pos))) {
				return false;
			}
			pos++;
		}
		return true;
	}
	
	private String checkValidName(String name) {
		int pos = name.indexOf(' ');
		if (pos < 0) {
			return "\"" + name + "\" does not contain a space";
		}
		if (pos < 2) {
			return "The first part of " + name + " is shorter than 2 characters";
		}
		if (! isLettersOnly(name, 0, pos)) {
			return "The first part of " + name + " contains a non-letter character";
		}
		if (name.length() - pos < 3) {
			return "The second part of " + name + " is shorter than 2 characters";
		}
		if (! isLettersOnly(name, pos + 1, -1)) {
			return "The second part of " + name + " contains a non-letter character";
		}
		return null;
	}
	
	// email methods
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		checkValidEmail(email);
		this.email = email;
	}
	
	private void checkValidEmail(String email) {
		String[] parts = email.split("@");
		if (parts.length != 2) {
			throw new IllegalArgumentException(email + " contained more than one @");
		}
		String[] nameParts = parts[0].split("\\.");
		if (nameParts.length != 2) {
			throw new IllegalArgumentException("The name part should include two names separated with .");
		}
		int pos = this.name.indexOf(' ');
		String givenName = this.name.substring(0, pos);
		if (! nameParts[0].equalsIgnoreCase(givenName)) {
			throw new IllegalArgumentException("The first name of email (" + nameParts[0] + ") does not match given name (" + givenName + ")");
		}
		String familyName = this.name.substring(pos + 1);
		if (! nameParts[1].equalsIgnoreCase(familyName)) {
			throw new IllegalArgumentException("The second name of email (" + nameParts[1] + ") does not match family name (" + familyName + ")");
		}
		String[] domainParts = parts[1].split("\\.");
		if (domainParts.length != 2) {
			throw new IllegalArgumentException("The domain part should include two words separated with .");
		}
		if (! isLettersOrDigitsOnly(domainParts[0], 0, -1)) { 
			throw new IllegalArgumentException("The first part of " + parts[1] + " contains a non-letter character");
		}
		int countryCodeLength = domainParts[1].length();
		if (! (countryCodeLength == 2 || countryCodeLength == 3)) {
			throw new IllegalArgumentException("The country code part of " + domainParts[1] + " must be 2 or 3 characters");
		}
		if (! isLettersOnly(domainParts[1], 0, -1)) {
			throw new IllegalArgumentException("The country code part of " + domainParts[1] + " contains a non-letter character");
		}
		if (! validCTLDs.contains(domainParts[1])){
			throw new IllegalArgumentException("The country code " + domainParts[1] + " is not a valid top level domain");
		}
	}
	
	// Social security number: http://no.wikipedia.org/wiki/Fødselsnummer
	
	private static int[]
			factors1 = {3, 7, 6, 1, 8, 9, 4, 5, 2},
			factors2 = {5, 4, 3, 2, 7, 6, 5, 4, 3, 2}; 
	 
	private static int computeControlDigit(String digits, int[] factors) { 
		int sum = 0; 
		for (int i = 0; i < factors.length; i++) { 
			sum += (digits.charAt(i) - '0') * factors[i]; 
		} 
		sum = 11 - (sum % 11);
		return sum == 11 ? 0 : sum; 
	} 
	 
	private static boolean checkDigits(String digits, int pos, int num) { 
		return (num / 10 == digits.charAt(pos) - '0' && num % 10 == digits.charAt(pos + 1) - '0'); 
	} 
	 
	@SuppressWarnings("deprecation")
	private boolean validateSSN(String pid) { 
		if (pid.length() != 11) { 
			return false; 
		} 
		for (int i = 0; i < pid.length(); i++) { 
			if (! Character.isDigit(pid.charAt(i))) { 
				return false; 
			} 
		}
		int day = birthday.getDate();
		int month = birthday.getMonth()+1;
		int year = birthday.getYear() + 1900;
		
		if (! (checkDigits(pid, 0, day) && checkDigits(pid, 2, month)) && checkDigits(pid, 4, year)) { 
			return false; 
		} 
		boolean isOdd = ((pid.charAt(8) - '0') % 2) == 1; 
		if ((gender == 'M') != isOdd) { 
			return false; 
		} 
		int k1 = computeControlDigit(pid, factors1), k2 = computeControlDigit(pid, factors2); 
		if (k1 != pid.charAt(9) - '0' || k2 != pid.charAt(10) - '0') { 
			return false; 
		} 
		return true; 
	} 
	 
	public String getSSN() { 
		 return ssn;
	} 
	 
	public void setSSN(String ssn) { 
		if (! validateSSN(ssn)) { 
			throw new IllegalArgumentException(ssn + " is not a valid PID for " + gender + " and " + birthday); 
		} 
		this.ssn = ssn; 
	}	
}
