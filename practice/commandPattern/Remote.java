// make this remote compleately reprogrammable

public class Remote implements Runnable{
    Command[] slot;
    int numSlots;

    public Remote() {
	numSlots = 7;
	slot = new Command[7];
    }

    public void setCommand(Command com, int slotNumber) {
	if (slotNumber < numSlots) {
            slot[slotNumber] = com;            
	    System.out.println("Command was set to " + slotNumber);
	} else {
            System.out.println("Slot numbers are 0-" + (numSlots-1));
            System.out.println("Your input = " + slotNumber);
	}
    }

    public void executeCommand(int slotNumber) {
	if (slotNumber < numSlots) {
            slot[slotNumber].execute();
	} else {
            System.out.println("Slot numbers are 1-7");
            System.out.println("Your input = " + slotNumber);
            return;
	}
    }

    public Command newCommand(int i) {
	
    }

    public void run() {
	String input = "";
	// set up scanner
	while(input != "quit") {
	    // display options
	    // get input
	    // switch to action (add, remove, use)
	}
    }
    
    static void main(String[] args) {
	Remote r = new Remote();
	r.run();
    }
}