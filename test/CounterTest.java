import javafx.stage.Stage;
import org.junit.Test;
import org.testfx.framework.junit.ApplicationTest;
import org.testfx.matcher.base.NodeMatchers;
import counterApp.Main;

import static org.testfx.api.FxAssert.verifyThat;

public class CounterTest extends ApplicationTest {

    private Main main;

    @Override
    public void start(Stage stage) throws Exception {
        main = new Main();
        main.start(stage);
    }

    @Test
    public void displayCounterWhenButtonClicked() {
        clickOn("Count");
        verifyThat("#Counter", NodeMatchers.hasText("1"));
    }

    @Test
    public void countIncrementsPerClick() {
        clickOn("Count");
        clickOn("Count");
        clickOn("Count");
        verifyThat("#Counter", NodeMatchers.hasText("3"));
    }
}
