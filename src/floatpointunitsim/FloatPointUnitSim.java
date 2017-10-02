package floatpointunitsim;

import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author alberto
 */
public class FloatPointUnitSim extends Application {
    
    public static boolean isSplashLoaded = false;
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        primaryStage.setTitle("Floating Point Simulator");
        primaryStage.getIcons().add(new Image("file:images/Calculator.png"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);        
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
