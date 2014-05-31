import javafx.application.Platform;
import javafx.stage.Stage;

public class TitleChanger extends Thread implements Runnable {
	
	private Stage pStage;
	private String str;
	
	public String randomTitle() {
		switch ( (int)(Math.random()*10) ) {
		case 0:
			return "Silence is golden, shutup and get rich";
		case 1:
			return "Some days you are the dog, some days you are the fire hydrant";
		case 2:
			return "Got Milk";
		case 3:
			return "A balanced diet is a cookie in each hand";
		case 4:
			return "If you smile when no one else is around, you really mean it.";
		case 5:
			return "THE SHORT BUS HAS ARRIVED! Where's your helmet?";
		/*case 6:
			return "";
		case 7:
			return "";
		case 8:
			return "";
		case 9:
			return "";*/
		default:
			return "Did you eat your cherios today?";
		}
		
	}
	
	public void run() {
	
		for (;;) {
			try {
				pStage = Glory.getInstance().getPrimaryStage();
				if(pStage.getTitle() == "Threads of Glory") {
					str = randomTitle();
				} else {
					str = "Threads of Glory";
				}
				
				Platform.runLater( new Runnable() {
					@Override
					public void run() {
						pStage.setTitle(str);	
					}
				});
		    
			sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("Stopping Title changer");
				return;
			} catch (Exception e) {
				System.out.println("ERROR: " + e);
				return;
			}
		}
	}
	
	public static void main(String[] args) {
		ColorInterface c = new ColorInterface();
		c.run();
	}
}