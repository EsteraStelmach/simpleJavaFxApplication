package Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuSceneController {

   static Parent applicationRoot;
   static Stage applicationStage;


    static Parent optionsRoot;
    static Stage optionsStage;

    static Stage menuStage;
    static Parent menuRoot;

   static {

       FXMLLoader menuLoader=new FXMLLoader();
       menuLoader.setLocation(Main.class.getResource("/Application/MenuScene.fxml"));

       FXMLLoader applicationLoader = new FXMLLoader();
       applicationLoader.setLocation(Main.class.getResource("/Application/ApplicationScene.fxml"));

       FXMLLoader optionsLoader = new FXMLLoader();
       optionsLoader.setLocation(Main.class.getResource("/Application/OptionsScene.fxml"));
       try {
           menuRoot = menuLoader.load();
           applicationRoot = applicationLoader.load();
           optionsRoot = optionsLoader.load();
       }catch (IOException e) {
           e.printStackTrace();
       }
       menuStage = new Stage();
       menuStage.setTitle("Hello");
       menuStage.setScene(new Scene(menuRoot));

       applicationStage =new Stage();
       applicationStage.setScene(new Scene(applicationRoot));
       applicationStage.setTitle("Application");

       optionsStage = new Stage();
       optionsStage.setScene(new Scene((optionsRoot)));
       optionsStage.setTitle("Options");




   }

   public void openApplication() {
        applicationStage.show();
   }

   public void openOptions() {
       optionsStage.show();
   }

   public void exit() {
       menuStage.close();
   }
}

