
public class TV {

    boolean isOn;
    int vol;

    public TV() {
	isOn = false;
	vol = 3;
    }

    public void turnOn() {
	if(isOn) {
	    System.out.println("Light is already on");
	} else {
	    System.out.println("You turned the light on");
	}
    }

    public void turnOff() {
	if(isOn) {
	    System.out.println("You turned the light off");
	} else {
	    System.out.println("The light is already off");
	}
    }

    public void setVol(int newVol) {
	if (newVol >= 0 && newVol <= 100) {
	    vol = newVol;
	}
    }

    public void turnVolUp() {
	setVol(vol + 1);
    }
    
    public void turnVolDown() {
	setVol(vol - 1);
    }
}