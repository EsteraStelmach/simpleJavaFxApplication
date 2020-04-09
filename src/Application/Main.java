package Application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Stage stage = new Stage();

        stage.setTitle("Hello");
        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(this.getClass().getResource("/Application/MenuScene.fxml"));
        Parent gridPane = loader.load();

        Scene scene = new Scene(gridPane);
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
