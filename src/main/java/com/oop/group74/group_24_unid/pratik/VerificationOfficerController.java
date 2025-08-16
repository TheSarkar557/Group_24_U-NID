package com.oop.group74.group_24_unid.pratik;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;

public class VerificationOfficerController {

    @FXML
    private ListView<Application> applicationList;

    @FXML
    private void handleViewDetails() {
        Application selected = applicationList.getSelectionModel().getSelectedItem();
        if (selected != null) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Application Details");
            alert.setHeaderText(selected.getApplicantName());
            alert.setContentText("DOB: " + selected.getDob() + "\nAddress: " + selected.getAddress());
            alert.showAndWait();
        }
    }

    @FXML
    private void handleDownloadDocuments() {
        Application selected = applicationList.getSelectionModel().getSelectedItem();
        if (selected != null) {
            System.out.println("Downloading documents for " + selected.getApplicantName());
        }
    }

    @FXML
    private void handleCheckNationalData() {
        Application selected = applicationList.getSelectionModel().getSelectedItem();
        if (selected != null) {
            System.out.println("Checking national data for " + selected.getApplicantName());
        }
    }
}
