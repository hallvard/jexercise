package oving5.person;

public class Person {

	public final static char MALE_GENDER = 'm';
	public final static char FEMALE_GENDER = 'f';
	
	private char gender;
	private String name;
	private Person mother, father, children[] = {};
	
	private static boolean isValidGender(char gender){
		return gender == MALE_GENDER || gender == FEMALE_GENDER;
	}
	
	public Person(char gender){
		if (isValidGender(gender)) {
			this.gender = gender;
		}			
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (isValidName(name)) {
			this.name = name;
		}
	}
	
	private static boolean isValidName(String name) {
		if (name == null) {
			return true;
		}
		for (int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);
			// only letters and space are valid
			if (! (Character.isLetter(c) || c == ' ')) {
				return false;
			}
		}
		return true;
	}

	public boolean isMale() {
		return gender == MALE_GENDER;
	}
	
	public boolean isFemale() {
		return gender == FEMALE_GENDER;
	}

	/*
	 * Below is a complete encapsulation of the mother, father and children fields,
	 * that ensures consistent values
	 */
	
	public int indexOfChild(Person child) {
		for (int i = 0; i < children.length; i++) {
			if (children[i] == child) {
				return i;
			}
		}
		return -1;
	}
	
	public boolean containsChild(Person child) {
		return indexOfChild(child) >= 0;
	}
	
	public int getChildCount() {
		return children.length;
	}
	
	public void addChild(Person child) {
		// only add if necessary
		if (child == null || containsChild(child)) {
			return;
		}
		// make a copy of the internal array, with room for one more element
		Person[] newChildren = new Person[children.length + 1];
		// copy elements from old array into new 
		System.arraycopy(children, 0, newChildren, 0, children.length);
		// and put the new child last
		newChildren[newChildren.length - 1] = child;
		// and remember to set the children field to the new array
		children = newChildren;
		// set mother or father of child, depending on this Person's gender
		if (this.isFemale()) {
			child.setMother(this);
		} else if (this.isMale()) {
			child.setFather(this);
		}
	}
	
	public void removeChild(Person child) {
		int indexOfChild = indexOfChild(child);
		// only remove if necessary
		if (indexOfChild < 0) {
			return;
		}
		// make new array with room for one child less 
		Person[] newChildren = new Person[children.length - 1];
		// copy elements before indexOfChild position
		System.arraycopy(children, 0, newChildren, 0, indexOfChild);
		int nextIndex = indexOfChild + 1;
		// copy elements after indexOfChild position, if there are any
		if (nextIndex < children.length) {
			System.arraycopy(children, nextIndex, newChildren, indexOfChild, children.length - nextIndex);
		}
		// and remember to set the children field to the new array
		children = newChildren;
		// clear mother or father of child
		if (this == child.getFather()) {
			child.setFather(null);
		} else if (this == child.getMother()) {
			child.setMother(null);
		}
	}
	
	public Person getChild(int index) {
		return children[index];
	}
	
	public Person getMother() {
		return mother;
	}

	public void setMother(Person mother) {
		if (mother != null && (mother == this || mother == this.mother || (! mother.isFemale()))) {
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
		if (father != null && (father == this || father == this.father || (! father.isMale()))) {
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
