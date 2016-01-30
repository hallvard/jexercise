package patterns.observable;

import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;
import patterns.observable.StopWatch;
import patterns.observable.StopWatchListener;
import patterns.observable.StopWatchManager;

@JExercise(description = "Tests patterns.observable.StopWatchManager")
@SuppressWarnings("all")
public class StopWatchManagerTest extends TestCase {
  private StopWatchManager stopWatchManager;
  
  private StopWatchManager _init_stopWatchManager() {
    StopWatchManager _stopWatchManager = new StopWatchManager();
    return _stopWatchManager;
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
        StopWatchManagerTest.this.changedCount++;
        StopWatchManagerTest.this.changedStopWatch = stopWatch;
        StopWatchManagerTest.this.whatChanged = what;
      }
    };
    return _function;
  }
  
  @Override
  protected void setUp() {
    stopWatchManager = _init_stopWatchManager();
    changedCount = _init_changedCount();
    changedStopWatch = _init_changedStopWatch();
    whatChanged = _init_whatChanged();
    stopWatchListener = _init_stopWatchListener();
    
  }
  
  @JExercise(tests = "StopWatchManager();patterns.observable.StopWatch newStopWatch(String);void addStopWatchListener(patterns.observable.StopWatchListener);void tick(int)", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>stopWatchManager.newStopWatch(\"SW 1\"), stopWatchManager.addStopWatchListener(stopWatchListener)</li>\n\t\t<li>1 time unit passes: stopWatchManager.tick(1)</li>\n\t\t</ul>\n")
  public void testTickedListener() {
    _transition_exprAction__tickedListener_transitions0_actions0();
    _transition_exprAction__tickedListener_transitions0_actions1();
    _test__tickedListener_transitions0_effect_state();
    _transition_exprAction__tickedListener_transitions1_actions0();
    _test__tickedListener_transitions1_effect_state();
    
  }
  
  @JExercise(tests = "StopWatchManager();patterns.observable.StopWatch newStopWatch(String);void addStopWatchListener(patterns.observable.StopWatchListener);patterns.observable.StopWatch getStopWatch(String)", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>stopWatchManager.newStopWatch(\"SW 1\"), stopWatchManager.addStopWatchListener(stopWatchListener)</li>\n\t\t<li>Start watch: stopWatchManager.getStopWatch(\"SW 1\").start()</li>\n\t\t<li>Lap watch: changedStopWatch = null, stopWatchManager.getStopWatch(\"SW 1\").lap()</li>\n\t\t<li>Stop watch: changedStopWatch = null, stopWatchManager.getStopWatch(\"SW 1\").stop()</li>\n\t\t</ul>\n")
  public void testStartedLappedStoppedListener() {
    _transition_exprAction__startedLappedStoppedListener_transitions0_actions0();
    _transition_exprAction__startedLappedStoppedListener_transitions0_actions1();
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
      
      this.stopWatchManager.newStopWatch("SW 1");
      } catch (junit.framework.AssertionFailedError error) {
      fail("stopWatchManager.newStopWatch(\"SW 1\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__tickedListener_transitions0_actions1() {
    try {
      
      this.stopWatchManager.addStopWatchListener(this.stopWatchListener);
      } catch (junit.framework.AssertionFailedError error) {
      fail("stopWatchManager.addStopWatchListener(stopWatchListener) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__tickedListener_transitions0_effect_state() {
    _test__tickedListener_transitions0_effect_state_objectTests0_test();
    
  }
  
  private void _test__tickedListener_transitions0_effect_state_objectTests0_test() {
    
  }
  
  private void _transition_exprAction__tickedListener_transitions1_actions0() {
    try {
      
      this.stopWatchManager.tick(1);
      } catch (junit.framework.AssertionFailedError error) {
      fail("stopWatchManager.tick(1) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__tickedListener_transitions1_effect_state() {
    _test__tickedListener_transitions1_effect_state_objectTests0_test();
    
  }
  
  private void _test__tickedListener_transitions1_effect_state_objectTests0_test() {
    
    assertEquals("changedCount == 1 failed after stopWatchManager.tick(1)", 1, this.changedCount);
    
    StopWatch _stopWatch = this.stopWatchManager.getStopWatch("SW 1");
    assertEquals("changedStopWatch == stopWatchManager.getStopWatch(\"SW 1\") failed after stopWatchManager.tick(1)", _stopWatch, this.changedStopWatch);
    
    assertEquals("whatChanged == 1 failed after stopWatchManager.tick(1)", 1, this.whatChanged);
    
  }
  
  private void _transition_exprAction__startedLappedStoppedListener_transitions0_actions0() {
    try {
      
      this.stopWatchManager.newStopWatch("SW 1");
      } catch (junit.framework.AssertionFailedError error) {
      fail("stopWatchManager.newStopWatch(\"SW 1\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__startedLappedStoppedListener_transitions0_actions1() {
    try {
      
      this.stopWatchManager.addStopWatchListener(this.stopWatchListener);
      } catch (junit.framework.AssertionFailedError error) {
      fail("stopWatchManager.addStopWatchListener(stopWatchListener) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__startedLappedStoppedListener_transitions0_effect_state() {
    _test__startedLappedStoppedListener_transitions0_effect_state_objectTests0_test();
    
  }
  
  private void _test__startedLappedStoppedListener_transitions0_effect_state_objectTests0_test() {
    
    StopWatch _stopWatch = this.stopWatchManager.getStopWatch("SW 1");
    boolean _isStarted = _stopWatch.isStarted();
    assertTrue("! stopWatchManager.getStopWatch(\"SW 1\").isStarted failed after stopWatchManager.newStopWatch(\"SW 1\") ,stopWatchManager.addStopWatchListener(stopWatchListener)", (!_isStarted));
    
  }
  
  private void _transition_exprAction__startedLappedStoppedListener_transitions1_actions0() {
    try {
      
      StopWatch _stopWatch = this.stopWatchManager.getStopWatch("SW 1");
      _stopWatch.start();
      } catch (junit.framework.AssertionFailedError error) {
      fail("stopWatchManager.getStopWatch(\"SW 1\").start() failed: " + error.getMessage());
    }
    
  }
  
  private void _test__startedLappedStoppedListener_transitions1_effect_state() {
    _test__startedLappedStoppedListener_transitions1_effect_state_objectTests0_test();
    
  }
  
  private void _test__startedLappedStoppedListener_transitions1_effect_state_objectTests0_test() {
    
    StopWatch _stopWatch = this.stopWatchManager.getStopWatch("SW 1");
    boolean _isStarted = _stopWatch.isStarted();
    assertTrue("stopWatchManager.getStopWatch(\"SW 1\").isStarted failed after stopWatchManager.getStopWatch(\"SW 1\").start()", _isStarted);
    
    assertEquals("changedCount == 1 failed after stopWatchManager.getStopWatch(\"SW 1\").start()", 1, this.changedCount);
    
    StopWatch _stopWatch_1 = this.stopWatchManager.getStopWatch("SW 1");
    assertEquals("changedStopWatch == stopWatchManager.getStopWatch(\"SW 1\") failed after stopWatchManager.getStopWatch(\"SW 1\").start()", _stopWatch_1, this.changedStopWatch);
    
    assertEquals("whatChanged == 2 failed after stopWatchManager.getStopWatch(\"SW 1\").start()", 2, this.whatChanged);
    
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
      
      StopWatch _stopWatch = this.stopWatchManager.getStopWatch("SW 1");
      _stopWatch.lap();
      } catch (junit.framework.AssertionFailedError error) {
      fail("stopWatchManager.getStopWatch(\"SW 1\").lap() failed: " + error.getMessage());
    }
    
  }
  
  private void _test__startedLappedStoppedListener_transitions2_effect_state() {
    _test__startedLappedStoppedListener_transitions2_effect_state_objectTests0_test();
    
  }
  
  private void _test__startedLappedStoppedListener_transitions2_effect_state_objectTests0_test() {
    
    assertEquals("changedCount == 2 failed after changedStopWatch = null ,stopWatchManager.getStopWatch(\"SW 1\").lap()", 2, this.changedCount);
    
    StopWatch _stopWatch = this.stopWatchManager.getStopWatch("SW 1");
    assertEquals("changedStopWatch == stopWatchManager.getStopWatch(\"SW 1\") failed after changedStopWatch = null ,stopWatchManager.getStopWatch(\"SW 1\").lap()", _stopWatch, this.changedStopWatch);
    
    assertEquals("whatChanged == 4 failed after changedStopWatch = null ,stopWatchManager.getStopWatch(\"SW 1\").lap()", 4, this.whatChanged);
    
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
      
      StopWatch _stopWatch = this.stopWatchManager.getStopWatch("SW 1");
      _stopWatch.stop();
      } catch (junit.framework.AssertionFailedError error) {
      fail("stopWatchManager.getStopWatch(\"SW 1\").stop() failed: " + error.getMessage());
    }
    
  }
  
  private void _test__startedLappedStoppedListener_transitions3_effect_state() {
    _test__startedLappedStoppedListener_transitions3_effect_state_objectTests0_test();
    
  }
  
  private void _test__startedLappedStoppedListener_transitions3_effect_state_objectTests0_test() {
    
    StopWatch _stopWatch = this.stopWatchManager.getStopWatch("SW 1");
    boolean _isStopped = _stopWatch.isStopped();
    assertTrue("stopWatchManager.getStopWatch(\"SW 1\").isStopped failed after changedStopWatch = null ,stopWatchManager.getStopWatch(\"SW 1\").stop()", _isStopped);
    
    assertEquals("changedCount == 3 failed after changedStopWatch = null ,stopWatchManager.getStopWatch(\"SW 1\").stop()", 3, this.changedCount);
    
    StopWatch _stopWatch_1 = this.stopWatchManager.getStopWatch("SW 1");
    assertEquals("changedStopWatch == stopWatchManager.getStopWatch(\"SW 1\") failed after changedStopWatch = null ,stopWatchManager.getStopWatch(\"SW 1\").stop()", _stopWatch_1, this.changedStopWatch);
    
    assertEquals("whatChanged == 8 failed after changedStopWatch = null ,stopWatchManager.getStopWatch(\"SW 1\").stop()", 8, this.whatChanged);
    
  }
  
  public static void main(final String[] args) {
    no.hal.jex.standalone.JexStandalone.main(StopWatchManagerTest.class);
  }
}
