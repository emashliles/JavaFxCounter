package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class Controller {
    public Label Counter;
    private static int counter;

    public void SayHello(ActionEvent actionEvent) {
        counter++;
        Counter.setText(Integer.toString(counter));
    }
}
