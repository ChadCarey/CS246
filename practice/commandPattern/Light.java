
public class Light {

    bool isOn;

    public Light() {
	isOn = false;
    }

    public void on() {
	if(isOn) {
	    System.out.println("Light is already on");
	} else {
	    System.out.println("You turned the light on");
	}
    }

    public void off() {
	if(isOn) {
	    System.out.println("You turned the light off");
	} else {
	    System.out.println("The light is already off");
	}
    }
}