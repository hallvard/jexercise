package objectstructures;

import java.util.ArrayList;

public class Person {

	public final static char MALE_GENDER = 'M';
	public final static char FEMALE_GENDER = 'F';
	
	private final char gender;
	private String name;
	private Person mother, father;
	private ArrayList<Person> children;
	
	private static boolean isValidGender(char gender) {
		return gender == MALE_GENDER || gender == FEMALE_GENDER;
	}
	
	public Person(String name, char gender) {
		this.name = name;
		if (! isValidGender(gender)) {
			throw new IllegalArgumentException(gender + " is not a valid gender");
		}			
		this.gender = gender;
		this.children = new ArrayList<Person>();
	}

	public String getName() {
		return name;
	}

	/*
	 * Below is a complete encapsulation of the mother, father and children fields,
	 * that ensures consistent values
	 */
	
	public int getChildCount() {
		return children.size();
	}
	
	public Person getChild(int index) {
		return children.get(index);
	}
	
	public void addChild(Person child) {
		// only add if necessary
		if (children.contains(child)) {
			return;
		}
		children.add(child);
		if (this.gender == FEMALE_GENDER) {
			child.setMother(this);
		} else if (this.gender == MALE_GENDER) {
			child.setFather(this);
		}
	}

	public void removeChild(Person child) {
		// only remove if necessary
		if (! children.contains(child)) {
			return;
		}
		children.remove(child);
		// clear mother or father of child
		if (this == child.getFather()) {
			child.setFather(null);
		} else if (this == child.getMother()) {
			child.setMother(null);
		}
	}
	
	public Person getMother() {
		return mother;
	}


	private void checkGender(Person person, char gender) {
		if (person != null && person.gender != gender) {
			throw new IllegalArgumentException("The gender is " + person.gender + " but should have been " + gender);
		}
	}
	private void checkOwnParent(Person person, Person parent) {
		if (person == parent) {
			throw new IllegalArgumentException("A person cannot be its own parent");
		}
	}

	public void setMother(Person mother) {
		checkGender(mother, FEMALE_GENDER);
		checkOwnParent(this, mother);
		if (mother == this.mother) {
			return;
		}
		// detach from previous mother, if needed
		if (this.mother != null) {
			this.mother.removeChild(this);
		}
		this.mother = mother;
		// attach to new mother, if needed
		if (this.mother != null) {
			this.mother.addChild(this);
		}
	}

	public Person getFather() {
		return father;
	}

	public void setFather(Person father) {
		checkGender(father, MALE_GENDER);
		checkOwnParent(this, father);
		if (father == this.father) {
			return;
		}
		// detach from previous father, if needed
		if (this.father != null) {
			this.father.removeChild(this);
		}
		this.father = father;
		// attach to new father, if needed
		if (this.father != null) {
			this.father.addChild(this);
		}
	}

	private static boolean isAncestorOf(Person ancestor, Person person) {
		if (person == null) {
			return false;
		} else if (ancestor == person) {
			return true;
		}
		return isAncestorOf(ancestor, person.father) || isAncestorOf(ancestor, person.mother);
	}
	
	public boolean isAncestorOf(Person person) {
		return isAncestorOf(this, person.father) || isAncestorOf(this, person.mother);
	}
}
