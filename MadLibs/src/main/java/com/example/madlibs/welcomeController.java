package com.example.madlibs;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class welcomeController {

    @FXML
    void toSelectMadLib(ActionEvent event) throws IOException {
        Parent selectLibParent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/madlibs/selectLib.fxml")));
        Scene selectLibScene = new Scene(selectLibParent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(selectLibScene);
        window.show();
    }
}