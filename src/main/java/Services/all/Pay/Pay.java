package Services.all.Pay;

import Services.Specification.Service;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.naming.Reference;
import java.io.File;
import java.net.URL;
import java.nio.file.Paths;

public class Pay extends Application {

    public PaymentModel model;
    public PaymentController cont;
    public PaymentView view;
    @Override
    public void start(Stage primaryStage) throws Exception{

        String fxmlpath = "fxml/Pay/fxml_example.fxml";

        Parent root = FXMLLoader.load(Paths.get(fxmlpath).toUri().toURL());;//FXMLLoader.load(getClass().getResourc


        Scene scene = new Scene(root, 1050, 777);

        primaryStage.setTitle("FXML Welcome");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
