package patterns.observable;

import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;
import patterns.observable.StopWatch;
import patterns.observable.StopWatchListener;

@JExercise(description = "Tests patterns.observable.StopWatch")
@SuppressWarnings("all")
public class StopWatchTest extends TestCase {
  private StopWatch stopWatch;
  
  private StopWatch _init_stopWatch() {
    StopWatch _stopWatch = new StopWatch();
    return _stopWatch;
  }
  
  private int changedCount;
  
  private int _init_changedCount() {
    return 0;
  }
  
  private StopWatch changedStopWatch;
  
  private StopWatch _init_changedStopWatch() {
    return new StopWatch();
    
  }
  
  private int whatChanged;
  
  private int _init_whatChanged() {
    return 0;
  }
  
  private StopWatchListener stopWatchListener;
  
  private StopWatchListener _init_stopWatchListener() {
    final StopWatchListener _function = new StopWatchListener() {
      public void stopWatchChanged(final StopWatch stopWatch, final int what) {
        StopWatchTest.this.changedCount++;
        StopWatchTest.this.changedStopWatch = stopWatch;
        StopWatchTest.this.whatChanged = what;
      }
    };
    return _function;
  }
  
  @Override
  protected void setUp() {
    stopWatch = _init_stopWatch();
    changedCount = _init_changedCount();
    changedStopWatch = _init_changedStopWatch();
    whatChanged = _init_whatChanged();
    stopWatchListener = _init_stopWatchListener();
    
  }
  
  @JExercise(tests = "StopWatch();void addStopWatchListener(patterns.observable.StopWatchListener);void tick(int)", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>stopWatch.addStopWatchListener(stopWatchListener)</li>\n\t\t<li>1 time unit passes: stopWatch.tick(1)</li>\n\t\t</ul>\n")
  public void testTickedListener() {
    _transition_exprAction__tickedListener_transitions0_actions0();
    _test__tickedListener_transitions0_effect_state();
    _transition_exprAction__tickedListener_transitions1_actions0();
    _test__tickedListener_transitions1_effect_state();
    
  }
  
  @JExercise(tests = "StopWatch();void addStopWatchListener(patterns.observable.StopWatchListener);void start();void lap();void stop()", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>stopWatch.addStopWatchListener(stopWatchListener)</li>\n\t\t<li>Start watch: stopWatch.start()</li>\n\t\t<li>Lap watch: changedStopWatch = null, stopWatch.lap()</li>\n\t\t<li>Stop watch: changedStopWatch = null, stopWatch.stop()</li>\n\t\t</ul>\n")
  public void testStartedLappedStoppedListener() {
    _transition_exprAction__startedLappedStoppedListener_transitions0_actions0();
    _test__startedLappedStoppedListener_transitions0_effect_state();
    _transition_exprAction__startedLappedStoppedListener_transitions1_actions0();
    _test__startedLappedStoppedListener_transitions1_effect_state();
    _transition_exprAction__startedLappedStoppedListener_transitions2_actions0();
    _transition_exprAction__startedLappedStoppedListener_transitions2_actions1();
    _test__startedLappedStoppedListener_transitions2_effect_state();
    _transition_exprAction__startedLappedStoppedListener_transitions3_actions0();
    _transition_exprAction__startedLappedStoppedListener_transitions3_actions1();
    _test__startedLappedStoppedListener_transitions3_effect_state();
    
  }
  
  private void _transition_exprAction__tickedListener_transitions0_actions0() {
    try {
      
      this.stopWatch.addStopWatchListener(this.stopWatchListener);
      } catch (junit.framework.AssertionFailedError error) {
      fail("stopWatch.addStopWatchListener(stopWatchListener) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__tickedListener_transitions0_effect_state() {
    _test__tickedListener_transitions0_effect_state_objectTests0_test(stopWatch);
    
  }
  
  private void _test__tickedListener_transitions0_effect_state_objectTests0_test(final StopWatch it) {
    
    int _ticks = it.getTicks();
    assertEquals("ticks == 0 failed after stopWatch.addStopWatchListener(stopWatchListener)", 0, _ticks);
    
  }
  
  private void _transition_exprAction__tickedListener_transitions1_actions0() {
    try {
      
      this.stopWatch.tick(1);
      } catch (junit.framework.AssertionFailedError error) {
      fail("stopWatch.tick(1) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__tickedListener_transitions1_effect_state() {
    _test__tickedListener_transitions1_effect_state_objectTests0_test();
    
  }
  
  private void _test__tickedListener_transitions1_effect_state_objectTests0_test() {
    
    int _ticks = this.stopWatch.getTicks();
    assertEquals("stopWatch.ticks == 1 failed after stopWatch.tick(1)", 1, _ticks);
    
    assertEquals("changedCount == 1 failed after stopWatch.tick(1)", 1, this.changedCount);
    
    assertEquals("changedStopWatch == stopWatch failed after stopWatch.tick(1)", this.stopWatch, this.changedStopWatch);
    
    assertEquals("whatChanged == 1 failed after stopWatch.tick(1)", 1, this.whatChanged);
    
  }
  
  private void _transition_exprAction__startedLappedStoppedListener_transitions0_actions0() {
    try {
      
      this.stopWatch.addStopWatchListener(this.stopWatchListener);
      } catch (junit.framework.AssertionFailedError error) {
      fail("stopWatch.addStopWatchListener(stopWatchListener) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__startedLappedStoppedListener_transitions0_effect_state() {
    _test__startedLappedStoppedListener_transitions0_effect_state_objectTests0_test(stopWatch);
    
  }
  
  private void _test__startedLappedStoppedListener_transitions0_effect_state_objectTests0_test(final StopWatch it) {
    
    int _ticks = it.getTicks();
    assertEquals("ticks == 0 failed after stopWatch.addStopWatchListener(stopWatchListener)", 0, _ticks);
    
    boolean _isStarted = it.isStarted();
    assertTrue("! isStarted failed after stopWatch.addStopWatchListener(stopWatchListener)", (!_isStarted));
    
  }
  
  private void _transition_exprAction__startedLappedStoppedListener_transitions1_actions0() {
    try {
      
      this.stopWatch.start();
      } catch (junit.framework.AssertionFailedError error) {
      fail("stopWatch.start() failed: " + error.getMessage());
    }
    
  }
  
  private void _test__startedLappedStoppedListener_transitions1_effect_state() {
    _test__startedLappedStoppedListener_transitions1_effect_state_objectTests0_test();
    
  }
  
  private void _test__startedLappedStoppedListener_transitions1_effect_state_objectTests0_test() {
    
    int _ticks = this.stopWatch.getTicks();
    assertEquals("stopWatch.ticks == 0 failed after stopWatch.start()", 0, _ticks);
    
    boolean _isStarted = this.stopWatch.isStarted();
    assertTrue("stopWatch.isStarted failed after stopWatch.start()", _isStarted);
    
    assertEquals("changedCount == 1 failed after stopWatch.start()", 1, this.changedCount);
    
    assertEquals("changedStopWatch == stopWatch failed after stopWatch.start()", this.stopWatch, this.changedStopWatch);
    
    assertEquals("whatChanged == 2 failed after stopWatch.start()", 2, this.whatChanged);
    
  }
  
  private void _transition_exprAction__startedLappedStoppedListener_transitions2_actions0() {
    try {
      
      this.changedStopWatch = null;
      } catch (junit.framework.AssertionFailedError error) {
      fail("changedStopWatch = null failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__startedLappedStoppedListener_transitions2_actions1() {
    try {
      
      this.stopWatch.lap();
      } catch (junit.framework.AssertionFailedError error) {
      fail("stopWatch.lap() failed: " + error.getMessage());
    }
    
  }
  
  private void _test__startedLappedStoppedListener_transitions2_effect_state() {
    _test__startedLappedStoppedListener_transitions2_effect_state_objectTests0_test();
    
  }
  
  private void _test__startedLappedStoppedListener_transitions2_effect_state_objectTests0_test() {
    
    int _ticks = this.stopWatch.getTicks();
    assertEquals("stopWatch.ticks == 0 failed after changedStopWatch = null ,stopWatch.lap()", 0, _ticks);
    
    assertEquals("changedCount == 2 failed after changedStopWatch = null ,stopWatch.lap()", 2, this.changedCount);
    
    assertEquals("changedStopWatch == stopWatch failed after changedStopWatch = null ,stopWatch.lap()", this.stopWatch, this.changedStopWatch);
    
    assertEquals("whatChanged == 4 failed after changedStopWatch = null ,stopWatch.lap()", 4, this.whatChanged);
    
  }
  
  private void _transition_exprAction__startedLappedStoppedListener_transitions3_actions0() {
    try {
      
      this.changedStopWatch = null;
      } catch (junit.framework.AssertionFailedError error) {
      fail("changedStopWatch = null failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__startedLappedStoppedListener_transitions3_actions1() {
    try {
      
      this.stopWatch.stop();
      } catch (junit.framework.AssertionFailedError error) {
      fail("stopWatch.stop() failed: " + error.getMessage());
    }
    
  }
  
  private void _test__startedLappedStoppedListener_transitions3_effect_state() {
    _test__startedLappedStoppedListener_transitions3_effect_state_objectTests0_test();
    
  }
  
  private void _test__startedLappedStoppedListener_transitions3_effect_state_objectTests0_test() {
    
    int _ticks = this.stopWatch.getTicks();
    assertEquals("stopWatch.ticks == 0 failed after changedStopWatch = null ,stopWatch.stop()", 0, _ticks);
    
    boolean _isStopped = this.stopWatch.isStopped();
    assertTrue("stopWatch.isStopped failed after changedStopWatch = null ,stopWatch.stop()", _isStopped);
    
    assertEquals("changedCount == 3 failed after changedStopWatch = null ,stopWatch.stop()", 3, this.changedCount);
    
    assertEquals("changedStopWatch == stopWatch failed after changedStopWatch = null ,stopWatch.stop()", this.stopWatch, this.changedStopWatch);
    
    assertEquals("whatChanged == 8 failed after changedStopWatch = null ,stopWatch.stop()", 8, this.whatChanged);
    
  }
  
  public static void main(final String[] args) {
    no.hal.jex.standalone.JexStandalone.main(StopWatchTest.class);
  }
}
