package application;
	
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			//create the root pane
			BorderPane root = new BorderPane();
			
			primaryStage.setTitle("Hell's Rune Manager");
			
			//create and set the scene
			Scene scene = new Scene(root,800,600);
			primaryStage.setScene(scene);
			
			//create ToC
			GridPane toc = new GridPane();
			toc.setMinSize(200, 600);
			toc.setVgap(5);
			toc.setHgap(5);
			toc.setPadding(new Insets(10,10,10,10));
			Button importFile = new Button("Import");
			importFile.setMinSize(100, 40);
			Button liveFilter = new Button("Live Filter");
			Button filterSettings = new Button("Filter Settings");
			Button exitProgram = new Button("Exit");
			toc.add(importFile, 0, 0);
			toc.add(liveFilter, 0, 1);
			toc.add(filterSettings, 0, 2);
			toc.add(exitProgram, 0, 3);
			
			 //Set button styles nodes  
		     importFile.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
		     liveFilter.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;"); 
		     filterSettings.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;"); 
		     exitProgram.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;"); 
		       
			
			//create the ToC window list
			Text text = new Text();
			text.setFont(new Font(22));
			text.setX(50);
			text.setY(150);
			text.setText("Sample Text");
			
			ObservableList list = root.getChildren();
			list.add(toc);
			
			//display the scene
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/*public static void main(String[] args) {
		launch(args);
	}*/
}
