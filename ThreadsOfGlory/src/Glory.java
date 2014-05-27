import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Glory extends Application {

	
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Threads of Glory");
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setPadding(new Insets(25, 25, 25, 25));
		
		
		// 'enter runnable' label
		Label enterRunnable = new Label("Enter Runnable");
		grid.add(enterRunnable, 0, 0);
		// runnable text box
		TextField entry = new TextField();
		grid.add(entry, 1, 0);
		// add button
		
		
		
		// runnables label
		Label runnableLabel = new Label("Runnables");
		grid.add(runnableLabel, 0, 1);
		//runnables list
		ListView runnablesList = new ListView();
		grid.add(runnablesList, 0, 2, 2, 3);
		GridPane.setMargin(runnablesList ,new Insets(10,10,0,0));
		// start button
		Button start = new Button("Start Thread");
		grid.add(start, 0, 9);
		
		//running threads label
		Label runningThreadsLabel = new Label("Running Threads");
		grid.add(runningThreadsLabel, 4, 1);
		//running threads list
		ListView runningThreads = new ListView();
		grid.add(runningThreads, 4, 2, 2, 3);
		GridPane.setMargin(runningThreads ,new Insets(10,10,0,0));
		//stop button
		Button stop = new Button("Stop Thread");
		grid.add(stop, 4, 9);
		
		
		// this should be last, it sets the scene after you build it
		Scene scene = new Scene(grid, 650, 400);
		primaryStage.setScene(scene);   
		primaryStage.show();
	}
	

}
