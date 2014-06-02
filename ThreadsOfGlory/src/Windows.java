import javafx.application.Platform;
import javafx.stage.Stage;

/**
 * This will change the user interface to a random color
 * @author chad
 *
 */
public class Windows implements Runnable {

	private Stage stage;
	double op;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
			stage = Glory.getInstance().getPrimaryStage();
			op = stage.getOpacity();
			
			while(true) {
				Platform.runLater( new Runnable() {
					@Override
					public void run() {
						stage.setOpacity(Math.random() * 1);		
					}
				});
			
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					Platform.runLater( new Runnable() {
						@Override
						public void run() {
							stage.setOpacity(op);		
						}
					});
					System.out.println("Stopping window fade");
					return;
				}
			}
	}

}
