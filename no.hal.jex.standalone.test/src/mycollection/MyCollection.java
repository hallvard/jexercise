package mycollection;

public interface MyCollection {
	int size();
	boolean contains(Object o);
	boolean containsAll(MyCollection col);
	void add(Object o);
	void addAll(MyCollection col);
	void remove(Object o);
	void removeAll(MyCollection col);
	void retainAll(MyCollection col);
	MyIterator iterator();
}
