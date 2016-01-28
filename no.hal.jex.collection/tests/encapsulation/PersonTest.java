package encapsulation;

import no.hal.jex.runtime.JExercise;

import java.util.Date;

import no.hal.jex.standalone.JexStandalone;
import junit.framework.TestCase;

@JExercise(
	description="A Person must contain a name, an email, a birthday and gender. These attributes should be properly encapsulated and have getters and setters that ensure valid attributes"
)
public class PersonTest extends TestCase {

	private Person person;
	private Date birthday;

	@SuppressWarnings("deprecation")
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		person = new Person();
	}
	
	private void testExceptionAndValue(Exception e, Class<? extends Exception> c, Object expected, Object actual) {
		assertTrue(e + " should be assignable to " + c, c.isAssignableFrom(e.getClass()));
		assertEquals(expected, actual);
	}
	
	@JExercise(
			tests="setName(String)",
			description="The setName(String) sets the name to the argument string, given that the name is within a valid format"
	)
	public void testSetName() {
		String name = person.getName();
		testInvalidName("Ola", name);
		testInvalidName("O N", name);
		testInvalidName("O. Nordmann", name);
		try {
			person.setName("Espen Askeladd");
			assertEquals("Espen Askeladd", person.getName());
		} catch (Exception e) {
			fail("Espen Askeladd is a valid name");
		}
	}

	private void testInvalidName(String invalidName, String existingName) {
		try {
			person.setName(invalidName);
			fail(invalidName + " is an invalid name");
		} catch (Exception e) {
			testExceptionAndValue(e, IllegalArgumentException.class, existingName, person.getName());			
		}
	}

	@JExercise(
		tests="void setBirthday(Date)",
		description="The setBirthday(Date) should set birthday to input argument, given that the birthday is on a valid format."
	)
	public void testSetBirthday() {
		long today = new Date().getTime();
		long offset = 1000L * 60L * 60L * 24L * 100L; // About 100 days
		try {
			Date theFuture = new Date(today + offset);
			person.setBirthday(theFuture);
			fail("The birthday cannot be in the future");
		} catch (Exception e) {
			testExceptionAndValue(e, IllegalArgumentException.class, birthday, person.getBirthday());
		}
		Date thePast = new Date(today - offset);
		try {
			person.setBirthday(thePast);
			assertEquals(thePast, person.getBirthday());
		} catch (Exception e) {
			fail(thePast + " is a valid birthday");
		}
	}
	
	@JExercise(
			tests="void setEmail(String)",
			description="The setEmail(String) should set email to input argument, given that the email is on a valid format"
	)
	public void testSetEmail() {
		person.setName("Ola Nordmann");
		String email = person.getEmail();
		testInvalidEmail("ola.nordmann@ntnu", email, IllegalArgumentException.class);
		testInvalidEmail("ola.nordmann(at)ntnu.no", email, IllegalArgumentException.class);
		testInvalidEmail("espen.askeladd@eventyr.no", email, IllegalArgumentException.class);
		testInvalidEmail("ola.nordmann@asd,-;:_*@¨+´`\\(){}[]=/&%$#¡!.?|®¥¢‰¶.no", email, IllegalArgumentException.class);
        	testValidEmail("ola.nordmann@ntnu.no");

        	for (String cTLD : invalidCTLDs) {
            		testInvalidEmail("ola.nordmann@ntnu." + cTLD, "ola.nordmann@ntnu.no", IllegalArgumentException.class);
        	}

        	for (String cTLD : cTLDs) {
        	    	testValidEmail("ola.nordmann@" + generateValidDomain() + "." + cTLD);
        	}

    	}

    	private String generateValidDomain() {
        	int length = random.nextInt(63) + 1;
        	String validCharacters = "abcdefghijklmnopqrstuvwxyz0123456789";
        	String domain = "";
        	for (int currentChar = 0; currentChar < length; currentChar++) {
            		int character = random.nextInt(36);
            		domain += validCharacters.substring(character, character + 1);
        	}
        	return domain;
    	}

    	private void testValidEmail(String email) {
        	try {
        	 	person.setEmail(email);
        	 	assertEquals(email, person.getEmail());
        	} catch (Exception e) {
            		fail(email + " is a valid email");
        	}
    	}

	private void testInvalidEmail(String invalidEmail, String existingEmail, Class<? extends Exception> ex) {
		try {
			person.setEmail(invalidEmail);
			fail(invalidEmail + " is an invalid email");
		} catch (Exception e) {
			testExceptionAndValue(e, ex, existingEmail, person.getEmail());
		}
	}

	@JExercise(
			tests="void setGender(char)",
			description="The setGender(char) should set gender to input argument, given that the gender is on a valid format"
	)	
	public void testSetGender() {
		String validGenders = "FM\0";
		char gender = person.getGender();
		for (char c = '\0'; c < '\uFFFF'; c++) {
			try {
				person.setGender(c);
				if (validGenders.indexOf(c) < 0) {
					fail(c + " is an invalid gender");
				}
				gender = person.getGender();
			} catch(Exception e) {
				if (validGenders.indexOf(c) >= 0) {
					fail("F, M and \\0 are valid genders");
				} else {
					testExceptionAndValue(e, IllegalArgumentException.class, gender, person.getGender());
				}
			}
		}
	}
	
	public static void main(String[] args) {
		JexStandalone.main(PersonTest.class);
	}
}
