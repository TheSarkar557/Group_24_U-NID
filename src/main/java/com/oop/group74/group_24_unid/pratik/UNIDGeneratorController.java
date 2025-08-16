package com.oop.group74.group_24_unid.pratik;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import model.Application;
import model.UNIDCard;

public class UNIDGeneratorController {

    @FXML
    private ListView<Application> approvedApplications;

    @FXML
    private void handleGenerateUNID() {
        Application selected = approvedApplications.getSelectionModel().getSelectedItem();
        if (selected != null) {
            UNIDCard card = new UNIDCard(selected, "UNID-" + System.currentTimeMillis());
            System.out.println("Generated U-NID: " + card.getUnidNumber() + " for " + selected.getApplicantName());
        }
    }
}
