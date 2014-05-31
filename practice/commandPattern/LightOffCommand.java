
public class LightOnCommand implements Command {

    Light light;

    // give it the specific light that we want to turn on
    public LightOnCommand(Light l) {
	light = l;
    }

    public void execute() {
	light.turnOff();
    }
}