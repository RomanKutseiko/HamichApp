package ClientForm;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {
	
	private Stage primaryStage;

	@Override
	public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("MainStage");
        
        initLayout();
	}
	
	  public void initLayout() {
	        try {
	            // Load layout from fxml file
	            FXMLLoader loader = new FXMLLoader();
	            loader.setLocation(MainApp.class.getResource("FXMLDoc.fxml"));
	            // Show the scene containing the layout
	            Scene scene = new Scene(loader.load());
	            primaryStage.setScene(scene);
	            primaryStage.show();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	public static void main() {
		launch();
	}
}
