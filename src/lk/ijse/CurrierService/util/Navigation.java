package lk.ijse.CurrierService.util;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Navigation {
    private static AnchorPane supplierFormcontext;

    public static void navigate(Route route, AnchorPane pane) throws IOException {
        Navigation.supplierFormcontext = pane;
        Navigation.supplierFormcontext.getChildren().clear();
        Stage window = (Stage)Navigation.supplierFormcontext.getScene().getWindow();

        switch (route) {
            case Supplier:
                window.setTitle("Supplier Form");
                initUI("lk/ijse/CurrierService/view/AddForm.fxml");
                break;
            /*case PLACE_ORDER:
                window.setTitle("Place Order");
                initUI("PlaceOrderForm.fxml");
                break;
            case DASHBOARD:
                window.setTitle("Dashboard");
                initUI("DashboardForm.fxml");
                break;
            case ITEM:
                window.setTitle("Item Manage");
                initUI("ItemForm.fxml");
                break;*/
            default:
                new Alert(Alert.AlertType.ERROR, "UI Not Found!").show();
        }
    }
    public static void initUI(String location) throws IOException {
        Navigation.supplierFormcontext.getChildren().add(FXMLLoader.load(Navigation.class.getResource("/lk/ijse/CurrierService/view/"+location)));
    }
}

