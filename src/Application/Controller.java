package Application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    Parent root1;
    Stage applicationStage;


    public void openApplication() {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(Main.class.getResource("/Application/ApplicationScene.fxml"));
        try {
            root1 = fxmlLoader.load();
            applicationStage =new Stage();
            applicationStage.setScene(new Scene(root1));
            applicationStage.setTitle("Application");
            applicationStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    public void exit_Application(){
    }

    public void options(ActionEvent actionEvent) {
    }

    public void exit(ActionEvent actionEvent) {
    }
}
