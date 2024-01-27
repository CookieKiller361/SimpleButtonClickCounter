package org.simplebuttoncounter;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ButtonUIController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label Labeltext;

    @FXML
    void ButtonClicked(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert Labeltext != null : "fx:id=\"Labeltext\" was not injected: check your FXML file 'ButtonUI.fxml'.";

    }

}
