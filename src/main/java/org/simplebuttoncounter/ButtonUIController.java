package org.simplebuttoncounter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ButtonUIController {
    int counter = 0;

    @FXML
    private Label Labeltext;

    @FXML
    void ButtonClicked(ActionEvent event) {
        counter++;
        Labeltext.setText("counter: " + counter);
    }

    @FXML
    void initialize() {
        Labeltext.setText("counter: 0");

    }

}
