package org.example;

import javafx.fxml.FXML;

import javafx.event.ActionEvent;    // ← CORRECT
import javafx.scene.control.TextField;

public class downloadManager {

    @FXML
    private TextField urlTextField;


    @FXML
    void downloadButtonClicked(ActionEvent event) {
        String text =this.urlTextField.getText();

        System.out.println("field text is ="+text);
    }
}
