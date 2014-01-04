class Tabell {

	int [] tab;

	public Tabell(int len) {
		tab = new int[len];
	}

	public int[] getArray ( ) {
		return tab;
	}

	public int sum ( ) {
		int sum = 0;
		for (int v: tab) sum += v;
		return sum;
	}
}
	