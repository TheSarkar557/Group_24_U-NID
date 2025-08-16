package com.oop.group74.group_24_unid.Tirtho;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;


public class ValidateBiometricDataController
{
    @FXML
    private TableView<BiometricData> biometricTable;
    @FXML
    private TextField qualityInput;
    @FXML
    private TextArea commentArea;

    private ObservableList<BiometricData> biometricDataList = FXCollections.observableArrayList();
    private static final int MIN_QUALITY_SCORE = 70;

    @javafx.fxml.FXML
    public void initialize() {
        // Initialize table columns
        TableColumn<BiometricData, String> idCol = new TableColumn<>("ID");
        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        TableColumn<BiometricData, String> typeCol = new TableColumn<>("Type");
        typeCol.setCellValueFactory(new PropertyValueFactory<>("type"));
        TableColumn<BiometricData, Integer> scoreCol = new TableColumn<>("Quality Score");
        scoreCol.setCellValueFactory(new PropertyValueFactory<>("qualityScore"));

        biometricTable.getColumns().setAll(idCol, typeCol, scoreCol);
        biometricTable.setItems(biometricDataList);

        // Simulate receiving biometric data (replace with actual data fetch)
        receiveBiometric();
    }

    private void receiveBiometric() {
        biometricDataList.add(new BiometricData("B001", "Fingerprint", 75));
        biometricDataList.add(new BiometricData("B002", "Photo", 60));
    }

    @FXML
    private void validateData(ActionEvent event) {
        BiometricData selected = biometricTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            try {
                int userScore = Integer.parseInt(qualityInput.getText());
                selected.setQualityScore(userScore);
                if (userScore >= MIN_QUALITY_SCORE) {
                    commentArea.setText("Data meets quality standards.");
                } else {
                    commentArea.setText("Quality score too low. Flagging for review.");
                }
                biometricTable.refresh();
            } catch (NumberFormatException e) {
                commentArea.setText("Please enter a valid number for quality score.");
            }
        }
    }

    @FXML
    private void flagMismatch(ActionEvent event) {
        BiometricData selected = biometricTable.getSelectionModel().getSelectedItem();
        if (selected != null && selected.getQualityScore() < MIN_QUALITY_SCORE) {
            String comment = commentArea.getText().isEmpty() ? "Mismatch detected." : commentArea.getText();
            commentArea.setText("Flagged: " + comment);
        } else {
            commentArea.setText("No mismatch to flag or data is valid.");
        }
    }

    @FXML
    private void markValidated(ActionEvent event) {
        BiometricData selected = biometricTable.getSelectionModel().getSelectedItem();
        if (selected != null && selected.getQualityScore() >= MIN_QUALITY_SCORE) {
            commentArea.setText("Marked as Validated: " + selected.getId());
            // Simulate forwarding to next process
        } else {
            commentArea.setText("Cannot validate: Quality score too low.");
        }
    }
}
