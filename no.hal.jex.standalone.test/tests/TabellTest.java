import no.hal.jex.runtime.JExercise;

@JExercise(description="Tabell-klassen har en intern array som det skal beregnes summen av.")
public class TabellTest extends junit.framework.TestCase{
	private Tabell tab; 

	@Override
	protected void setUp( ) {
		tab = new Tabell(10);
	}

	@JExercise(tests="Tabell(int);int[] getArray()",description="Konstrukturen lager en array med ti heltallselementer. Denne arrayen returneres av getArray-metoden.")
	public void testTabell() {
		assertEquals(10, tab.getArray().length);
	}	

	@JExercise(tests="int sum()",description="sum returnerer summen av arrayen")
	public void testSum() {
		assertEquals(0,tab.sum());
	}

	public static void main (String[ ] arum) {
		no.hal.jex.standalone.JexStandalone.main(TabellTest.class);
	}
}	

