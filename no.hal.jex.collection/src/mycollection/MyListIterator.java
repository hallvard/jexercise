package mycollection;

public class MyListIterator implements MyIterator {

	private MyList list;
	private int pos = 0;

	public MyListIterator(MyList list) {
		this.list = list;
	}
	
	public boolean hasNext() {
		return pos < list.size();
	}

	public Object next() {
		Object o = list.get(pos);
		pos++;
		return o;
	}
}
