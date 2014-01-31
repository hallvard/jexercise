package stateandbehavior;

import no.hal.jex.runtime.JExercise;
import java.util.Random;

@JExercise(
	description="Create a VotingMachine class that can be used for a simple election. The VotingMachine should have methods to clear the machine state ('clear'), to register one vote for a Democrat ('voteDemocrat'), to register one vote for a Republican ('voteRepublican') and to get the tallies for both parties ('getDemocratTally' and 'getRepublicanTally'). (Exercise 8.10 in Cay Horstmanns Big Java Late Objects.)"
)

public class VotingMachineTest extends junit.framework.TestCase {

	private VotingMachine vm;

	@Override
	protected void setUp() {
		vm = new VotingMachine();
	}

	@JExercise(
			tests="VotingMaching(); int getDemocratTally(); int getRepublicanTally()",
			description="Tests that the inital number of votes are 0 for Democrats and Republicans."
			)
	public void testVotingMachine() {
		assertEquals("The democrats should have an initial number of 0 votes.", 0,vm.getDemocratTally());
		assertEquals("The republicans should have an initial number of 0 votes.", 0, vm.getRepublicanTally());
	}

	@JExercise(
			tests="void clear(); int getDemocratTally(); int getRepublicanTally()",
			description="Tests that after clearing, the number of votes are 0 for both Democrats and Republicans."
			)
	public void testClear() {
		randomVotes(true);
		randomVotes(false);
		vm.clear();
		assertEquals("The democrats should have 0 votes after clearing.", 0, vm.getDemocratTally());
		assertEquals("The republicans should have 0 votes after clearing.", 0, vm.getRepublicanTally());
	}

	@JExercise(
			tests="void voteDemocrat(); int getDemocratTally();",
			description="Tests that the number of Democrat votes are registered correctly."
			)
	public void testVoteDemocrat() {
		int number = randomVotes(true);
		int votes = vm.getDemocratTally();
		assertEquals("voteDemocrat has been called " + number + " times, while getDemocratTally returns " + votes, number, votes);
	}

	private int randomVotes(boolean democrat) {
		Random r = new Random();
		int number = 10 + r.nextInt(100000);
		for (int i = 1; i <= number; i++) {
			if (democrat) {
				vm.voteDemocrat();
			} else {
				vm.voteRepublican();
			}
		}
		return number;
	}

	@JExercise(
			tests="void voteRepublican(); int getRepublicanTally();",
			description="Tests that the number of Republican votes are registered correctly."
			)
	public void testVoteRepublican() {
		int number = randomVotes(false);
		int votes = vm.getRepublicanTally();
		assertEquals("voteRepublican has been called " + number + " times, while getRepubllicanTally returns " + votes, number, votes);
	}

	public static void main(String[] args) {
		no.hal.jex.standalone.JexStandalone.main(VotingMachineTest.class);
	}

}