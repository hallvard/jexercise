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

	@SuppressWarnings("deprecation")
	@JExercise(
		tests="void setBirthday(String)",
		description="The setBirthday(String) should set birthday to input argument, given that the birthday is on a valid format."
	)
	public void testSetBirthday() {
		try {
			Date birth = new Date(115,11,31);
			person.setBirthday(birth);
			fail("The birthday cannot be in the future");
		} catch (Exception e) {
			testExceptionAndValue(e, IllegalArgumentException.class, birthday, person.getBirthday());
		}
		Date birthday2 = new Date(93, 11, 12);
		try {
			person.setBirthday(birthday2);
			assertEquals(birthday2, person.getBirthday());	
		} catch (Exception e) {
			fail(birthday2 + " is a valid birthday");
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
		testInvalidEmail("espen.askeladd@eventyr.no", email, IllegalStateException.class);
		try {
			person.setEmail("ola.nordmann@ntnu.no");
			assertEquals("ola.nordmann@ntnu.no", person.getEmail());
		} catch (Exception e) {
			fail("ola.nordmann@ntnu.no is a valid email");
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
			tests="void setGender(String)",
			description="The setGender(String) should set gender to input argument, given that the gender is on a valid format"
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
