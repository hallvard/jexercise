package encapsulation;

import java.util.Date;

import no.hal.jex.runtime.JExercise;
import no.hal.jex.standalone.JexStandalone;

@JExercise(
	description="A Person must contain a name, an email, a birthday, gender and social security number. These attributes should be properly encapsulated and have getters and setters that ensure valid attributes"
)
public class PersonTest2 extends PersonTest {

	private Person person;
	private static int[]
			factors1 = {3, 7, 6, 1, 8, 9, 4, 5, 2},
			factors2 = {5, 4, 3, 2, 7, 6, 5, 4, 3, 2}; 
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		person = new Person();
	}
	
	@SuppressWarnings("deprecation")
	@JExercise(
			tests="void setSSN(String)",
			description="The setSSN(String) should set social security number to input argument, given that the SSN is valid"
	)	
	public void testSetSSN() {
		person.setBirthday(new Date(94, 0, 1));
		person.setGender('M');
		try {
			person.setSSN("010194111" + generateValid(1, 1, 1, "010194"));
			assertEquals("01019411156", person.getSSN());			
		} catch (Exception e ) {
			fail();
		}
		try {
			person.setSSN("010194112" + generateValid(1, 1, 2, "010194"));	
			fail();
		} catch (Exception e) {
			assertEquals("01019411156", person.getSSN());
		}
		try {
			person.setSSN("01019411122");
			fail();
		} catch (Exception e) {
			assertEquals("01019411156", person.getSSN());
		}
	}
	
	private static String generateValid(int n1, int n2, int n3, String birthday) {
		birthday = birthday + n1 + n2 + n3;
		int k1 = 0, k2 = 0;
		for(int i = 0; i < birthday.length(); i++) {
			int num = Character.getNumericValue(birthday.charAt(i));
			k1 += factors1[i] * num;
			k2 += factors2[i] * num;
		}
		k1 = 11 - (k1 % 11);
		if (k1 == 11) {
			k1 = 0;
		}
		k2 += k1 * factors2[9];
		k2 = 11 - (k2 % 11);
		if (k2 == 11) {
			k2 = 0;
		}
		return k1 + "" + k2;
	}
	
	public static void main(String[] args) {
		JexStandalone.main(PersonTest2.class);
	}
}