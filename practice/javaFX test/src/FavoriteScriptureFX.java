

import java.util.Collections;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;



public class FavoriteScriptureFX extends Application {
    
    @Override
    public void start(Stage primaryStage) {
    	primaryStage.setTitle("Scriptures");
        GridPane grid = new GridPane();	
        grid.setAlignment(Pos.TOP_LEFT);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        
        
        // add "scripture" label box to the grid
        Label entryLabel = new Label("Scripture");
        grid.add(entryLabel,  0,  0);
        
        final TextField entry = new TextField();
        grid.add(entry, 0, 1);
        
        // list
        final ListView<String> scripList = new ListView<String>();
        grid.add(scripList,  2,  1, 1, 4);
        
        // add the add button
        Button addBtn = new Button("Add >> ");
        addBtn.setOnAction(new EventHandler<ActionEvent>() {
        	@Override
        	public void handle(ActionEvent e) {
        		String str = entry.getText();
        		entry.setText("");
        		
        			if(!str.equals("")) {
        			scripList.getItems().add(str);
        		}	
        	}
        });
        grid.add(addBtn, 1, 1);
        
        // sort button
        Button sortBtn = new Button("sort");
        sortBtn.setOnAction(new EventHandler<ActionEvent>() {
        	@Override
        	public void handle(ActionEvent e) {
        		Collections.sort(scripList);
        	}
        });
        grid.add(sortBtn, 3, 1);
        
        // remove button
        Button removeBtn = new Button("remove");
        removeBtn.setOnAction(new EventHandler<ActionEvent>() {
        	@Override
        	public void handle(ActionEvent e) {
        		
        	}
        });
        grid.add(removeBtn, 3, 2);
        
        // save button
        Button saveBtn = new Button("save");
        saveBtn.setOnAction(new EventHandler<ActionEvent>() {
        	@Override
        	public void handle(ActionEvent e) {
        		
        	}
        });
        grid.add(saveBtn, 3, 3);
        
        
        // this should be last, it sets the scene after you build it
        	Scene scene = new Scene(grid, 650, 400);
        primaryStage.setScene(scene);   
    	primaryStage.show();
    	}
    }