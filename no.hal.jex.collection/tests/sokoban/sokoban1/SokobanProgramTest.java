package sokoban.sokoban1;

import junit.framework.TestCase;

public class SokobanProgramTest extends TestCase {

	private SokobanProgram program;
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		program = new SokobanProgram();
		program.init("#######|#.@ # #|#$* $ #|#   $ #|# ..  #|#  *  #|#######");
	}
	
	
}
