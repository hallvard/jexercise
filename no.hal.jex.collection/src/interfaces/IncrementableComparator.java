package interfaces;

import java.util.Comparator;

public class IncrementableComparator implements Comparator<Incrementable> {

	@Override
	public int compare(Incrementable incrementable1, Incrementable incrementable2) {
		return incrementable1.toInt() - incrementable2.toInt();
	}
}
