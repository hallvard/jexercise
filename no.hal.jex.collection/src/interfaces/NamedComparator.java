package interfaces;

import java.util.Comparator;

public class NamedComparator implements Comparator<Named> {

	@Override
	public int compare(Named named1, Named named2) {
		int diff = named1.getFamilyName().compareTo(named2.getFamilyName());
		if (diff == 0) {
			diff = named1.getGivenName().compareTo(named2.getGivenName());
		}
		return diff;
	}
}
