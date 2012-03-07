package mycollection;

public interface MyList extends MyCollection {
	int indexOf(Object o);
	int lastIndexOf(Object o);
	Object get(int pos);
	void set(int pos, Object o);
	void add(int pos, Object o);
	void addAll(int pos, MyCollection col);
	void remove(int pos);
}
