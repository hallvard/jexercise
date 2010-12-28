package oving5.person;

import oving5.person.Person;
import jexutil.JExercise;
import junit.framework.TestCase;

/**
 * 
 * @author Alexander Høst, Indøk, Undass TDT4100/TDT4102, Spring 2009
 * 
 */

@JExercise(
		tests="",
		description="The Person class encapsulates information about name, gender and parent/child association." +
				"\nThe Person class propertly implements and encapsulates a bi-directional parent/children association." +
				" The parent/child association relates a Person to a father and a mother (both Persons), in one direction, and" +
				" a Person to zero, one or more children (also Persons), in the other direction." +
				" The mother and father must be encapsulated with getFather()/setFather(Person) and getMother()/setMother(Person) methods, respectively," +
				" while the children must be encapsulated getChildCount(), getChild(int), addChild(Person) and removeChild(Person) methods." +
				" Note that it is illegal to set the father of a Person to a female or the mother to a male." +
				"\nSpecial care must be taken to make sure that the parent/child association is kept consistent:" +
				"<ul> " +
				"<li> If a child has a parent, either the mother or father, the parent must also have that child as one of its children, and vica versa.</li>" +
				"<li> A child cannot have a parent, unless that parent also has that child as one of its children.</li>" +
				"</ul>" +
				" Hence, setParent, addChild and removeChild must all take care to call each other (or helper methods that you introduce), as appropriate." +
				" <p/>Making sure the parent/child association is consistent is more tricky than you may think." +
				" It may be helpful to draw an object diagram for the various cases you must handle, before coding."
)
public class PersonTest extends TestCase {

	private Person[] testPersonReturningPersons() {
		Person person1 = new Person('m');
		Person person2 = new Person('f');
		Person person3 = new Person('a');
		assertTrue(person1.isMale());
		assertFalse(person1.isFemale());
		assertTrue(person2.isFemale());
		assertFalse(person2.isMale());
		assertFalse(person3.isMale());
		assertFalse(person3.isFemale());
		return new Person[]{person1, person2, person3};
	}

	@JExercise(
			tests="Person()",
			description="Create a constructor that takes one argument; the gender, represented as 'm' for male and 'f' for female. The constructor should initialize the new Person appropriately." +
					" If other values than 'm' or 'f' are given, the gender should not be set." +
					" Also, the number of children for this Person should initially be 0."
	)
	public void testPerson() {
		testPersonReturningPersons();
	}
	
	@JExercise(
			tests="String getName(); void setName(String)",
			description="getName() returns the name of this Person, as set by setName." +
				"setName(String) sets the name of this Person to the provided argument." +
				" The name should only be set if the argument is null or a valid name." +
				" A name is valid if it contains only letters and whitespaces."
	)
	public void testGetSetName() {
		getNameTester();
		setNameTester();
	}

	private void getNameTester() {
		Person person1 = new Person('m');
		person1.setName("John Doe");

		Person person2 = new Person('f');
		person2.setName("Jane Doe");

		assertEquals("John Doe", person1.getName());
		assertEquals("Jane Doe", person2.getName());
	}

	private void setNameTester() {
		Person person1 = new Person('m');
		Person person2 = new Person('m');

		person1.setName("John Doe");
		assertEquals("John Doe", person1.getName());

		person2.setName("Jane Doe");
		assertEquals("Jane Doe", person2.getName());
		usingNameWithLettersOnlyTester();
		usingNameWithLettersAndWhitespacesTester();
		usingNameWithIllegalCharactersTester();
	}
	
	private void usingNameWithLettersOnlyTester() {
		Person p = new Person('m');
		p.setName("Sylvester");
		assertTrue("Sylvester".equals(p.getName()));
		p.setName("MacGyver");
		assertTrue("MacGyver".equals(p.getName()));
	}

	private void usingNameWithLettersAndWhitespacesTester() {
		Person p = new Person('m');
		p.setName("Sylvester Cat");
		assertTrue("Sylvester Cat".equals(p.getName()));
		p.setName("Angus MacGyver");
		assertTrue("Angus MacGyver".equals(p.getName()));
	}

	private void usingNameWithIllegalCharactersTester() {
		Person p = new Person('m');
		p.setName("John$ Doe");
		assertTrue(p.getName() == null);
		p.setName("$Jane Doe$");
		assertTrue(p.getName()== null);
	}

	@JExercise(
			tests="boolean isMale(); boolean isFemale()",
			description="isMale() returns true if the this Person is male, false otherwise. isFemale() returns true if the this Person is female, false otherwise."
	)
	public void testGenderPredicates() {
		Person p = new Person('m');
		assertTrue("Was not male", p.isMale());
		p = new Person('f');
		assertFalse("Was male", p.isMale());

		p = new Person('m');
		assertFalse("Was female", p.isFemale());
		p = new Person('f');
		assertTrue("Was not female", p.isFemale());
	}

	//
	
	@JExercise(
			tests="int getChildCount()",
			description="Returns the number of children that this Person has."
	)
	public void testPersonWithChildCount() {
		Person[] persons = testPersonReturningPersons();
		for (int i = 0; i < persons.length; i++) {
			assertEquals(persons[i].getChildCount(), 0);
		}
	}

	private void addChildToFatherMotherTester() {
		Person father = new Person('m');
		Person mother = new Person('f');
		Person child1 = new Person('m');
		Person child2 = new Person('m');
		Person child3 = new Person('f');

		// add once
		father.addChild(child1);
		mother.addChild(child1);
		assertEquals(1, father.getChildCount());
		assertEquals(1, mother.getChildCount());
		assertEquals(father, child1.getFather());
		assertEquals(mother, child1.getMother());
		assertEquals(child1, father.getChild(0));
		assertEquals(child1, mother.getChild(0));

		// add same child should not affect the children
		father.addChild(child1);
		mother.addChild(child1);
		assertEquals(1, father.getChildCount());
		assertEquals(1, mother.getChildCount());
		
		// adding multiple children
		father.addChild(child2);
		father.addChild(child3);
		assertEquals(3, father.getChildCount());
		assertEquals(father, child1.getFather());
		assertEquals(father, child2.getFather());	
		assertEquals(father, child3.getFather());
		assertEquals(child1, father.getChild(0));
		assertEquals(child2, father.getChild(1));
		assertEquals(child3, father.getChild(2));
	}
	
	private void addChildToOtherFatherMotherTester() {
		Person father = new Person('m');
		Person mother = new Person('f');
		Person child1 = new Person('m');
		Person otherFather = new Person('m');
		Person otherMother = new Person('f');
		
		// add once
		father.addChild(child1);
		mother.addChild(child1);
		assertEquals(1, father.getChildCount());
		assertEquals(1, mother.getChildCount());
		assertEquals(father, child1.getFather());
		assertEquals(mother, child1.getMother());
		assertEquals(child1, father.getChild(0));
		assertEquals(child1, mother.getChild(0));
		
		// add same child to other father and mother
		otherFather.addChild(child1);
		otherMother.addChild(child1);		
		assertEquals(1, otherFather.getChildCount());
		assertEquals(1, otherMother.getChildCount());
		assertEquals(otherFather, child1.getFather());
		assertEquals(otherMother, child1.getMother());
		assertEquals(child1, otherFather.getChild(0));
		assertEquals(child1, otherMother.getChild(0));

		assertEquals(0, father.getChildCount());		
		assertEquals(0, mother.getChildCount());		
	}

	@JExercise(
			tests="void addChild(Person)",
			description="Adds a child to this Person." +
					" If the child is already present, it should not be added." +
					" Note that the child's mother or father property must be set accordingly, depending on the gender of this Person."
	)
	public void testAddChild() {
		addChildToFatherMotherTester();
		addChildToOtherFatherMotherTester();
	}

	@JExercise(
			tests="",
			description="Setting the mother/father should result in appropriate add/removeChild calls."
	)
	public void testSetAsAddChild() {
		Person father = new Person('m');
		Person mother = new Person('f');
		Person child1 = new Person('m');
		Person child2 = new Person('m');
		Person child3 = new Person('f');
		
		// add once
		child1.setFather(father);
		child1.setMother(mother);
		assertEquals(1, father.getChildCount());
		assertEquals(1, mother.getChildCount());
		assertEquals(father, child1.getFather());
		assertEquals(mother, child1.getMother());
		assertEquals(child1, father.getChild(0));
		assertEquals(child1, mother.getChild(0));
		
		// add same child should not affect the children
		child1.setFather(father);
		child1.setMother(mother);
		assertEquals(1, father.getChildCount());
		assertEquals(1, mother.getChildCount());
		
		// adding multiple children
		child2.setFather(father);
		child3.setFather(father);
		assertEquals(3, father.getChildCount());
		assertEquals(father, child1.getFather());
		assertEquals(father, child2.getFather());	
		assertEquals(father, child3.getFather());
		assertEquals(child1, father.getChild(0));
		assertEquals(child2, father.getChild(1));
		assertEquals(child3, father.getChild(2));
	}
	
	@JExercise(
			tests="void removeChild(Person)",
			description="Removes the given child from this Person." +
					" Note that the child's mother or father property must be set accordingly, depending on the gender of this Person."
	)
	public void testRemoveChild() {
		Person father = new Person('m');
		Person child1 = new Person('m');
		Person child2 = new Person('m');
		Person child3 = new Person('f');

		// adding/removing multiple children
		father.addChild(child1);
		father.addChild(child2);
		father.addChild(child3);
		
		father.removeChild(child1);
		assertEquals(2, father.getChildCount());
		assertNotSame(father, child1.getFather());
		assertNull(child1.getFather());
		assertEquals(father, child2.getFather());	
		assertEquals(father, child3.getFather());

		father.removeChild(child1);
		assertEquals(2, father.getChildCount());
		assertNotSame(father, child1.getFather());
		assertNull(child1.getFather());
		assertEquals(father, child2.getFather());	
		assertEquals(father, child3.getFather());

		father.removeChild(child3);
		assertEquals(1, father.getChildCount());
		assertNotSame(father, child3.getFather());
		assertNull(child3.getFather());
		assertEquals(father, child2.getFather());	

		father.removeChild(child2);
		assertEquals(0, father.getChildCount());
		assertNotSame(father, child2.getFather());
		assertNull(child2.getFather());
	}
	
	@JExercise(
			tests="",
			description="Setting the mother/father to null should result in appropriate removeChild call."
	)
	public void testSetAsRemoveChild() {
		Person father = new Person('m');
		Person child1 = new Person('m');
		Person child2 = new Person('m');
		Person child3 = new Person('f');
		
		// adding/removing multiple children
		father.addChild(child1);
		father.addChild(child2);
		father.addChild(child3);
		
		child1.setFather(null);
		assertEquals(2, father.getChildCount());
		assertNotSame(father, child1.getFather());
		assertNull(child1.getFather());
		assertEquals(father, child2.getFather());	
		assertEquals(father, child3.getFather());
		
		child1.setFather(null);
		assertEquals(2, father.getChildCount());
		assertNotSame(father, child1.getFather());
		assertNull(child1.getFather());
		assertEquals(father, child2.getFather());	
		assertEquals(father, child3.getFather());
		
		child3.setFather(null);
		assertEquals(1, father.getChildCount());
		assertNotSame(father, child3.getFather());
		assertNull(child3.getFather());
		assertEquals(father, child2.getFather());	
		
		child2.setFather(null);
		assertEquals(0, father.getChildCount());
		assertNotSame(father, child2.getFather());
		assertNull(child2.getFather());
	}
	
	@JExercise(
			tests="Person getMother(); Person getFather()",
			description="getMother() returns the mother of this Person." +
					" getFather() returns the father of this Person."
	)
	public void testGetParent(){
		Person son = new Person('m');
		Person father = new Person('m');
		Person mother = new Person('f');
		son.setMother(mother);		
		son.setFather(father);
		assertEquals(father, son.getFather());
		assertEquals(mother, son.getMother());
	}

	private void testInternalContainsChild(Person parent, Person child, boolean logic) {
		boolean found = false;
		int size = parent.getChildCount();
		for (int i = 0; i < size; i++) {
			found |= (parent.getChild(i) == child);
		}
		assertEquals(logic, found);
	}
	
	@JExercise(
			tests="void setMother(Person); void setFather(Person)",
			description="setMother takes a Person as argument and sets it as the mother of this Person." +
					" You must also make sure that the mother has this Person as one of its children." +
					" Note that if the argument is null, this Person must be removed as a child from its mother." +
					"\nTakes a Person as a parameter and sets it as the father of this Person." +
					" You must also make sure that the father has this Person as one of its children." +
					" Note that if the argument is null, this Person must be removed as a child from its father"
	)
	public void testSetParent() {
		Person son = new Person('m');
		Person father = new Person('m');
		Person mother = new Person('f');
		Person otherfather = new Person('m');
		Person othermother = new Person('f');
		son.setMother(father);		
		son.setFather(mother);
		assertNull("Tried to set a female as a person's father.", son.getMother());
		assertNull("Tried to set a male as a person's mother.", son.getFather());
		testInternalContainsChild(father, son, false);
		testInternalContainsChild(mother, son, false);
		son.setMother(mother);
		son.setFather(father);
		assertEquals("Was not the right parent!", mother, son.getMother());
		assertEquals("Was not the right parent!", father, son.getFather());
		testInternalContainsChild(father, son, true);
		testInternalContainsChild(mother, son, true);
		son.setMother(othermother);
		son.setFather(otherfather);
		testInternalContainsChild(father, son, false);
		testInternalContainsChild(mother, son, false);
		testInternalContainsChild(otherfather, son, true);
		testInternalContainsChild(othermother, son, true);
		assertTrue(son.getMother() == othermother);
		assertTrue(son.getFather() == otherfather);	
	}
	
	@JExercise(
			tests="int indexOfChild(Person)",
			description="This method that takes a Person as argument and returns the index of that Person among the children of this Person." +
					" If the Person argument is not a child of this Person, the method should return -1."
	)
	public void testIndexOfChild() {
		Person parent = new Person('m');
		Person child1 = new Person('f');
		Person child2 = new Person('f');		
		parent.addChild(child1);
		parent.addChild(child2);
		assertEquals(0, parent.indexOfChild(child1));
		assertEquals(1, parent.indexOfChild(child2));
		assertEquals(-1, parent.indexOfChild(new Person('f')));
	}
	
	@JExercise(
			tests="boolean containsChild(Person)",
			description="Method that returns true if the Person argument is a child of this Person, and false otherwise."
	)
	public void testContainsChild(){
		Person parent = new Person('m');
		Person child1 = new Person('f');
		Person child2 = new Person('f');		
		parent.addChild(child1);
		assertTrue(parent.containsChild(child1));
		assertFalse(parent.containsChild(child2));
	}

	private void testIsAncestorOf(Person parent, Person child) {
		assertTrue(parent.isAncestorOf(child));
		assertFalse(child.isAncestorOf(parent));
		assertFalse(parent.isAncestorOf(parent));
		assertFalse(child.isAncestorOf(child));
	}
	
	@JExercise(
			tests="boolean isAncestorOf(Person)",
			description="Returns true if this Person is an ancestor of the provided Person argument, and false otherwise." +
					" A Person is an ancestor of another Person, if" +
					"\n * this Person is the father or mother of the other Person or" +
					"\n * this Person is the ancestor of the other Person's father or mother."
	)
	public void testIsAncestorOf() {
		Person mormor = new Person('f');
		Person farmor = new Person('f');
		Person morfar = new Person('m');
		Person farfar = new Person('m');
		Person mor = new Person('f');
		Person far = new Person('m');
		Person child1 = new Person('m');
		Person child2 = new Person('f');

		mor.setMother(mormor);
		mor.setFather(morfar);
		far.setMother(farmor);
		far.setFather(farfar);
		
		child1.setMother(mor);
		child2.setMother(mor);
		child1.setFather(far);
		child2.setFather(far);

		testIsAncestorOf(mormor, mor);
		testIsAncestorOf(morfar, mor);
		testIsAncestorOf(mormor, child1);
		testIsAncestorOf(morfar, child1);
		testIsAncestorOf(mormor, child2);
		testIsAncestorOf(morfar, child2);

		testIsAncestorOf(farmor, far);
		testIsAncestorOf(farfar, far);
		testIsAncestorOf(farmor, child1);
		testIsAncestorOf(farfar, child1);
		testIsAncestorOf(farmor, child2);
		testIsAncestorOf(farfar, child2);

		testIsAncestorOf(mor, child1);
		testIsAncestorOf(far, child1);
		testIsAncestorOf(mor, child2);
		testIsAncestorOf(far, child2);

		assertFalse(mormor.isAncestorOf(mormor));
		assertFalse(mormor.isAncestorOf(morfar));
		assertFalse(mormor.isAncestorOf(farmor));
		assertFalse(mormor.isAncestorOf(farfar));

		assertFalse(mor.isAncestorOf(mormor));
		assertFalse(mor.isAncestorOf(morfar));
		assertFalse(mor.isAncestorOf(farmor));
		assertFalse(mor.isAncestorOf(farfar));
		
		assertFalse(child1.isAncestorOf(mor));
		assertFalse(child1.isAncestorOf(far));
		assertFalse(child1.isAncestorOf(child2));

		assertFalse(child2.isAncestorOf(mor));
		assertFalse(child2.isAncestorOf(far));
		assertFalse(child2.isAncestorOf(child1));
		
		Person[] persons = new Person[10];
		for (int i = 0; i < persons.length; i++) {
			persons[i] = new Person('m');
			if (i > 0) {
				persons[i].setFather(persons[i - 1]);
			}
		}
		for (int i = 1; i < persons.length; i++) {
			testIsAncestorOf(persons[0], persons[i]);
		}
	}
}
