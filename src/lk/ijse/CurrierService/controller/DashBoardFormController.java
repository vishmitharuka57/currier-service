package lk.ijse.CurrierService.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXML;
import lk.ijse.CurrierService.util.Navigation;
import lk.ijse.CurrierService.util.Route;
import java.io.IOException;
import java.net.URL;


public class DashBoardFormController {
    /*public AnchorPane supplierFormContext;

    public void openAddForm(ActionEvent actionEvent) throws IOException {
        loadUi("AddForm");
        }

        public void openSearchForm(ActionEvent actionEvent) throws IOException {
            loadUi("SearchForm");
        }

        public void openUpdateForm(ActionEvent actionEvent) throws IOException {
            loadUi("UpdateForm");
        }

    void loadUi(String filName) throws IOException {
        URL resource = getClass().getResource("../view/" + filName + ".fxml");
        Parent load = FXMLLoader.load(resource);
        supplierFormContext.getChildren().clear();
        supplierFormContext.getChildren().add(load);

    }*/

        @FXML
        private AnchorPane supplierFormContext;

        @FXML
        void openAddForm(ActionEvent actionEvent) throws IOException {
                Navigation.navigate(Route.Supplier, supplierFormContext);
        }

        @FXML
        void openSearchForm(ActionEvent actionEvent) {
        }

        @FXML
        void openUpdateForm(ActionEvent actionEvent) {
        }



    }


