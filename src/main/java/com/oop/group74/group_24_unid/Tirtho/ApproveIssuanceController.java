package com.oop.group74.group_24_unid.Tirtho;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;

public class ApproveIssuanceController {
    @FXML
    private TableView<Application> applicationTable;
    @FXML
    private TextArea noteArea;

    private ObservableList<Application> applicationList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Rely on FXML-defined columns; remove if FXML handles this
        receiveApplication();
    }

    private void receiveApplication() {
        applicationList.add(new Application("A001", "John Doe", "Verified"));
        applicationList.add(new Application("A002", "Jane Smith", "Verified"));
    }

    private void fetchDetails() {
        Application selected = applicationTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            selected.setStatus("Details Fetched: " + selected.getStatus());
            applicationTable.refresh();
        }
    }

    @FXML
    private void flagIssues(ActionEvent event) {
        Application selected = applicationTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            String note = noteArea.getText().isEmpty() ? "Issues found." : noteArea.getText();
            selected.setStatus("Flagged: " + note);
            noteArea.setText("Flagged with: " + note);
            applicationTable.refresh();
        } else {
            noteArea.setText("Please select an application to flag.");
        }
    }

    @FXML
    private void approveIssuance(ActionEvent event) {
        Application selected = applicationTable.getSelectionModel().getSelectedItem();
        if (selected != null && "Verified".equals(selected.getStatus())) {
            selected.setStatus("Issued");
            noteArea.setText("U-NID issued for " + selected.getApplicantName());
        } else {
            noteArea.setText("Cannot approve: Application not verified or selected.");
        }
    }
}