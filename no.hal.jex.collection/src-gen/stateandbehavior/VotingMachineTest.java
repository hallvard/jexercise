package stateandbehavior;

import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;
import stateandbehavior.VotingMachine;

@JExercise(description = "<h3>Stemme-maskin</h3>Tests stateandbehavior.VotingMachine<p>(see <a href=\"https://www.ntnu.no/wiki/display/tdt4100/State+and+behavior+-+Voting+machine+exercise\">https://www.ntnu.no/wiki/display/tdt4100/State+and+behavior+-+Voting+machine+exercise</a>)</p>")
@SuppressWarnings("all")
public class VotingMachineTest extends TestCase {
  private VotingMachine votingMachine;
  
  @Override
  protected void setUp() {
    votingMachine = new VotingMachine();
    
  }
  
  @JExercise(tests = "VotingMachine()", description = "<h3>Konstrukt\u00F8r</h3>Tests \n\t\tinitialization\n")
  public void testConstructor() {
    _test__constructor_transitions0_effect_state(votingMachine);
    
  }
  
  @JExercise(tests = "VotingMachine();void voteDemocrat()", description = "<h3>Demokrat-stemmer</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>2 demokrat-stemmer.: voteDemocrat # votes</li>\n\t\t</ul>\n")
  public void testDomacratVotes() {
    int votes = _init__domacratVotes_votes();
    for (int times = _transition_exprAction_times__domacratVotes_transitions0_actions0(votingMachine, votes); times > 0; times--) {
      _transition_exprAction__domacratVotes_transitions0_actions0(votingMachine, votes);
    }
    _test__domacratVotes_transitions0_effect_state(votingMachine, votes);
    
  }
  
  @JExercise(tests = "VotingMachine();void voteRepublican()", description = "<h3>Replikaner-stemmer</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>3 replikaner-stemmer.: voteRepublican # votes</li>\n\t\t</ul>\n")
  public void testRepublicanVotes() {
    int votes = _init__republicanVotes_votes();
    for (int times = _transition_exprAction_times__republicanVotes_transitions0_actions0(votingMachine, votes); times > 0; times--) {
      _transition_exprAction__republicanVotes_transitions0_actions0(votingMachine, votes);
    }
    _test__republicanVotes_transitions0_effect_state(votingMachine, votes);
    
  }
  
  @JExercise(tests = "VotingMachine();void voteDemocrat();void voteRepublican();void clear()", description = "<h3>Stemmer og nullstill</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>3 demokrat-stemmer.: voteDemocrat # democratVotes</li>\n\t\t<li>2 replikaner-stemmer.: voteRepublican # republicanVotes</li>\n\t\t<li>Nullstill: clear</li>\n\t\t</ul>\n")
  public void testClearVotes() {
    int democratVotes = _init__clearVotes_democratVotes();
    int republicanVotes = _init__clearVotes_republicanVotes();
    for (int times = _transition_exprAction_times__clearVotes_transitions0_actions0(votingMachine, democratVotes, republicanVotes); times > 0; times--) {
      _transition_exprAction__clearVotes_transitions0_actions0(votingMachine, democratVotes, republicanVotes);
    }
    _test__clearVotes_transitions0_effect_state(votingMachine, democratVotes, republicanVotes);
    for (int times_1 = _transition_exprAction_times__clearVotes_transitions1_actions0(votingMachine, democratVotes, republicanVotes); times_1 > 0; times_1--) {
      _transition_exprAction__clearVotes_transitions1_actions0(votingMachine, democratVotes, republicanVotes);
    }
    _test__clearVotes_transitions1_effect_state(votingMachine, democratVotes, republicanVotes);
    _transition_exprAction__clearVotes_transitions2_actions0(votingMachine, democratVotes, republicanVotes);
    _test__clearVotes_transitions2_effect_state(votingMachine, democratVotes, republicanVotes);
    
  }
  
  private void _test__constructor_transitions0_effect_state(final VotingMachine it) {
    _test__constructor_transitions0_effect_state_objectTests0_test(votingMachine);
    
  }
  
  private void _test__constructor_transitions0_effect_state_objectTests0_test(final VotingMachine it) {
    
    int _democratTally = it.getDemocratTally();
    assertEquals("democratTally == 0 failed", 0, _democratTally);
    
    int _republicanTally = it.getRepublicanTally();
    assertEquals("republicanTally == 0 failed", 0, _republicanTally);
    
  }
  
  private int _init__domacratVotes_votes() {
    double _random = Math.random();
    double _multiply = (_random * 100000);
    int _plus = (10 + ((int) _multiply));
    return _plus;
  }
  
  private void _transition_exprAction__domacratVotes_transitions0_actions0(final VotingMachine it, final int votes) {
    try {
      
      it.voteDemocrat();
      } catch (junit.framework.AssertionFailedError error) {
      fail("voteDemocrat failed: " + error.getMessage());
    }
    
  }
  
  private int _transition_exprAction_times__domacratVotes_transitions0_actions0(final VotingMachine it, final int votes) {
    return votes;
  }
  
  private void _test__domacratVotes_transitions0_effect_state(final VotingMachine it, final int votes) {
    _test__domacratVotes_transitions0_effect_state_objectTests0_test(votingMachine, votes);
    
  }
  
  private void _test__domacratVotes_transitions0_effect_state_objectTests0_test(final VotingMachine it, final int votes) {
    
    int _democratTally = it.getDemocratTally();
    assertEquals("democratTally == votes failed after voteDemocrat # votes", votes, _democratTally);
    
    int _republicanTally = it.getRepublicanTally();
    assertEquals("republicanTally == 0 failed after voteDemocrat # votes", 0, _republicanTally);
    
  }
  
  private int _init__republicanVotes_votes() {
    double _random = Math.random();
    double _multiply = (_random * 100000);
    int _plus = (10 + ((int) _multiply));
    return _plus;
  }
  
  private void _transition_exprAction__republicanVotes_transitions0_actions0(final VotingMachine it, final int votes) {
    try {
      
      it.voteRepublican();
      } catch (junit.framework.AssertionFailedError error) {
      fail("voteRepublican failed: " + error.getMessage());
    }
    
  }
  
  private int _transition_exprAction_times__republicanVotes_transitions0_actions0(final VotingMachine it, final int votes) {
    return votes;
  }
  
  private void _test__republicanVotes_transitions0_effect_state(final VotingMachine it, final int votes) {
    _test__republicanVotes_transitions0_effect_state_objectTests0_test(votingMachine, votes);
    
  }
  
  private void _test__republicanVotes_transitions0_effect_state_objectTests0_test(final VotingMachine it, final int votes) {
    
    int _democratTally = it.getDemocratTally();
    assertEquals("democratTally == 0 failed after voteRepublican # votes", 0, _democratTally);
    
    int _republicanTally = it.getRepublicanTally();
    assertEquals("republicanTally == votes failed after voteRepublican # votes", votes, _republicanTally);
    
  }
  
  private int _init__clearVotes_democratVotes() {
    double _random = Math.random();
    double _multiply = (_random * 100000);
    int _plus = (10 + ((int) _multiply));
    return _plus;
  }
  
  private int _init__clearVotes_republicanVotes() {
    double _random = Math.random();
    double _multiply = (_random * 100000);
    int _plus = (10 + ((int) _multiply));
    return _plus;
  }
  
  private void _transition_exprAction__clearVotes_transitions0_actions0(final VotingMachine it, final int democratVotes, final int republicanVotes) {
    try {
      
      it.voteDemocrat();
      } catch (junit.framework.AssertionFailedError error) {
      fail("voteDemocrat failed: " + error.getMessage());
    }
    
  }
  
  private int _transition_exprAction_times__clearVotes_transitions0_actions0(final VotingMachine it, final int democratVotes, final int republicanVotes) {
    return democratVotes;
  }
  
  private void _test__clearVotes_transitions0_effect_state(final VotingMachine it, final int democratVotes, final int republicanVotes) {
    _test__clearVotes_transitions0_effect_state_objectTests0_test(votingMachine, democratVotes, republicanVotes);
    
  }
  
  private void _test__clearVotes_transitions0_effect_state_objectTests0_test(final VotingMachine it, final int democratVotes, final int republicanVotes) {
    
    int _democratTally = it.getDemocratTally();
    assertEquals("democratTally == democratVotes failed after voteDemocrat # democratVotes", democratVotes, _democratTally);
    
    int _republicanTally = it.getRepublicanTally();
    assertEquals("republicanTally == 0 failed after voteDemocrat # democratVotes", 0, _republicanTally);
    
  }
  
  private void _transition_exprAction__clearVotes_transitions1_actions0(final VotingMachine it, final int democratVotes, final int republicanVotes) {
    try {
      
      it.voteRepublican();
      } catch (junit.framework.AssertionFailedError error) {
      fail("voteRepublican failed: " + error.getMessage());
    }
    
  }
  
  private int _transition_exprAction_times__clearVotes_transitions1_actions0(final VotingMachine it, final int democratVotes, final int republicanVotes) {
    return republicanVotes;
  }
  
  private void _test__clearVotes_transitions1_effect_state(final VotingMachine it, final int democratVotes, final int republicanVotes) {
    _test__clearVotes_transitions1_effect_state_objectTests0_test(votingMachine, democratVotes, republicanVotes);
    
  }
  
  private void _test__clearVotes_transitions1_effect_state_objectTests0_test(final VotingMachine it, final int democratVotes, final int republicanVotes) {
    
    int _democratTally = it.getDemocratTally();
    assertEquals("democratTally == democratVotes failed after voteRepublican # republicanVotes", democratVotes, _democratTally);
    
    int _republicanTally = it.getRepublicanTally();
    assertEquals("republicanTally == republicanVotes failed after voteRepublican # republicanVotes", republicanVotes, _republicanTally);
    
  }
  
  private void _transition_exprAction__clearVotes_transitions2_actions0(final VotingMachine it, final int democratVotes, final int republicanVotes) {
    try {
      
      it.clear();
      } catch (junit.framework.AssertionFailedError error) {
      fail("clear failed: " + error.getMessage());
    }
    
  }
  
  private void _test__clearVotes_transitions2_effect_state(final VotingMachine it, final int democratVotes, final int republicanVotes) {
    _test__clearVotes_transitions2_effect_state_objectTests0_test(votingMachine, democratVotes, republicanVotes);
    
  }
  
  private void _test__clearVotes_transitions2_effect_state_objectTests0_test(final VotingMachine it, final int democratVotes, final int republicanVotes) {
    
    int _democratTally = it.getDemocratTally();
    assertEquals("democratTally == 0 failed after clear", 0, _democratTally);
    
    int _republicanTally = it.getRepublicanTally();
    assertEquals("republicanTally == 0 failed after clear", 0, _republicanTally);
    
  }
  
  public static void main(final String[] args) {
    no.hal.jex.standalone.JexStandalone.main(VotingMachineTest.class);
  }
}
