package com.example.madlibs;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

import java.io.IOException;

public class selectController {

    @FXML
    private MenuButton selectLibMenuButton;

    @FXML
    void christmasAction(ActionEvent event) throws IOException {
        passDataAndChangeScene(event, "Christmas");

    }

    @FXML
    void easterAction(ActionEvent event) throws IOException {
        passDataAndChangeScene(event, "Easter");

    }

    @FXML
    void halloweenAction(ActionEvent event) throws IOException {
        passDataAndChangeScene(event, "Halloween");

    }

    @FXML
    void julyAction(ActionEvent event) throws IOException {
        passDataAndChangeScene(event, "Fourth");

    }

    @FXML
    void thanksAction(ActionEvent event) throws IOException {
        passDataAndChangeScene(event, "Thanksgiving");

    }

    private void passDataAndChangeScene(ActionEvent event, String madLibName) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/madlibs/generateLib.fxml"));
        Parent generateLibParent = loader.load();

        generateController controller = loader.getController();
        controller.setMadLibName(madLibName);

        Scene generateLibScene = new Scene(generateLibParent);

        Stage window;
        if (event.getSource() instanceof MenuItem) {
            window = (Stage) selectLibMenuButton.getScene().getWindow();
        } else {
            window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        }

        window.setScene(generateLibScene);
        window.show();
    }
}
