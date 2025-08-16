package com.oop.group74.group_24_unid.Tirtho;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class QualityCheckerController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void validateDataOnAction(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com.oop.group74.group_24_unid/Tirtho/ValidateBiometricData.fxml"));
            Parent root = fxmlLoader.load();
            Node source = (Node) actionEvent.getSource();
            Stage stage = (Stage) source.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Validate Biometric Data");
            stage.show();
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }


    @javafx.fxml.FXML
    public void rejectApplicationsOnAction(ActionEvent actionEvent) {try{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(""));
        Parent root = fxmlLoader.load();
        Node source = (Node) actionEvent.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("");
        stage.show();
    }catch (IOException e)
    {
        e.printStackTrace();
    }
    }

    @javafx.fxml.FXML
    public void approveIssuanceOnAction(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com.oop.group74.group_24_unid/Tirtho/ApprovelIssuance.fxml"));
            Parent root = fxmlLoader.load();
            Node source = (Node) actionEvent.getSource();
            Stage stage = (Stage) source.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Approve Issuance");
            stage.show();
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}