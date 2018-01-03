package application;
	
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class ApplicationController extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			//create the root pane
			Parent root = FXMLLoader.load(getClass().getResource("Overview.fxml"));
			
			//create and set the scene
			Scene scene = new Scene(root,800,600);
			primaryStage.setTitle("Hell's Rune Manager");
			primaryStage.setScene(scene);
			
			//display the scene
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
