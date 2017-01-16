package no.hal.javafx.fxmlapp.lib;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.testfx.framework.junit.ApplicationTest;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FxmlApplicationTest extends ApplicationTest {

	private Parent rootParent;
	
	@Override
    public void start(Stage stage) throws Exception {
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("fxml", getClass().getResource("Test1.fxml").toString());
		rootParent = FxmlApplication.loadFxml(parameters);
		Scene scene = FxmlApplication.createScene(parameters, rootParent);
		FxmlApplication.initalizeKeyHandlers(rootParent, scene);
		stage.setScene(scene);
		stage.show();
    }

    @Test
    public void testRootParent() {
    	Assert.assertNotNull("Root parent must be non-null", rootParent);
//        // given:
//        rightClickOn("#desktop").moveTo("New").clickOn("Text Document");
//        write("myTextfile.txt").push(KeyCode.ENTER);
//
//        // when:
//        drag(".file").dropTo("#trash-can");
//
//        // then:
//        org.testfx.api.FxAssert.verifyThat("#desktop", org.testfx.matcher.base.NodeMatchers.hasChildren(0, ".file"));
    }
}
