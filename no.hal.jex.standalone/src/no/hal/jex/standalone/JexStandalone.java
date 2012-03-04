package no.hal.jex.standalone;

import junit.framework.Test;
import no.hal.jex.swing.JexExercisePanel;

public class JexStandalone {

	public static void main(Class<? extends Test> testClass) {
		main(testClass.getName());
	}
	public static void main(String testClassName) {
		main(new String[]{testClassName});
	}
	public static void main(String[] args) {
		String testClassName = (args.length >= 1 ? args[0] : null);
		String classPath = (args.length >= 2 ? args[1] : null);
		JexExercisePanel.main(new String[]{testClassName, classPath});
	}
}
