
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * This will randomly color the user interface as long as the thread is running
 * @author chad
 *
 */
public class ColorInterface implements Runnable {
	
	private Stage pStage;
	private String style;
	
	public void run() {
		int red;
		int green;
		int blue;
	
		for (;;) {
			try {
				pStage = Glory.getInstance().getPrimaryStage();
				red = (int)(Math.random() * 255);
				green = (int)(Math.random() * 255);
				blue = (int)(Math.random() * 255);
			
				style = "-fx-background-color: rgb(" + red + ", " + green + ", " + blue + ");";
			
				Platform.runLater( new Runnable() {
					@Override
					public void run() {
						pStage.getScene().getRoot().setStyle(style);
					}
				});
		    
				Thread.sleep(200);
			} catch (InterruptedException e) {
				System.out.println("Stopping color changer");
				return;
			} catch (Exception e) {
				System.out.println("ERROR" + e);
				return;
			}
		}
	}
	
	public static void main(String[] args) {
		ColorInterface c = new ColorInterface();
		c.run();
	}
}
