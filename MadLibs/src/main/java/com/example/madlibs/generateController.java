package com.example.madlibs;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.*;

public class generateController {

    @FXML
    private Button replayButton;

    @FXML
    private TextField enterWords;

    @FXML
    private TextArea libText;

    @FXML
    private ListView<String> listWords;

    @FXML
    private Button nextWordButton;

    @FXML
    private TitledPane titlePane;

    @FXML
    void toReRun(ActionEvent event) throws IOException {
        Parent selectLibParent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/madlibs/welcome.fxml")));
        Scene selectLibScene = new Scene(selectLibParent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(selectLibScene);
        window.show();
    }

    private final Map<String, MadLib> holidayClassMap;
    private MadLib currentMadLib;
    private List<String> userInputs;
    private List<String> prompts;
    private int currentPromptIndex;

    public generateController() {
        holidayClassMap = new HashMap<>();
        holidayClassMap.put("Christmas", new Christmas());
        holidayClassMap.put("Easter", new Easter());
        holidayClassMap.put("Halloween", new Halloween());
        holidayClassMap.put("Fourth", new Fourth());
        holidayClassMap.put("Thanksgiving", new Thanksgiving());
    }

    @FXML
    private void initialize() {
        userInputs = new ArrayList<>();
    }

    @FXML
    void nextWord() {
        if (currentPromptIndex < prompts.size() && !enterWords.getText().trim().isEmpty()) {
            userInputs.add(enterWords.getText().trim());
            enterWords.clear();
            currentPromptIndex++;
            if (currentPromptIndex < prompts.size()) {
                listWords.getItems().add(prompts.get(currentPromptIndex));
            } else {
                String finalStory = currentMadLib.generateMadLib(userInputs);
                libText.setText(finalStory);
                nextWordButton.setDisable(true);
                replayButton.setDisable(false);
            }
        }
    }

    public void setMadLibName(String madLibName) {
        titlePane.setText("Selected MadLib: " + madLibName);
        loadMadLibJavaClass(madLibName);
    }

    private void loadMadLibJavaClass(String madLibName) {
        currentMadLib = holidayClassMap.get(madLibName);
        if (currentMadLib == null) {
            libText.setText("Error loading " + madLibName + " MadLib!");
            return;
        }

        prompts = currentMadLib.getPrompts();
        currentPromptIndex = 0;

        setupMadLib();
    }

    private void setupMadLib() {
        listWords.getItems().clear();
        userInputs.clear();
        listWords.getItems().add(prompts.get(currentPromptIndex));
        nextWordButton.setDisable(false);
        replayButton.setDisable(true);
    }
}