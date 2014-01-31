package stateandbehavior;

class VotingMachine {
	
    private int votesD;
    private int votesR;
    
    int getDemocratTally() {
    	return votesD;
    }

    int getRepublicanTally() {
    	return votesR;
    }

    void clear() {
		votesD = 0;
		votesR = 0;
    }

    void voteDemocrat() {
    	votesD++;
    }

    void voteRepublican() {
    	votesR++;
    }
}