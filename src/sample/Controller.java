package sample;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{
    public Label Counter;
    private int counter;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        counter = 0;
    }

    public void SayHello(ActionEvent actionEvent) {
        counter++;
        Counter.setText(Integer.toString(counter));
    }
}
