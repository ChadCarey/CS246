

/**
 * CLASS: calculator
 * This is a command line calculator class (like bc)
 */

public class Calculator implements Runnable {

    public int add(String x1, String x2) {
	return 10;
    }

    protected boolean validateInput(String [] op) {
	return true;
    }

    protected boolean isOperator(String s) {
	return true;
    }

    protected int getOperation(String[] op) {
	return 0;
    }

    public void run() {
	String str = "0 + 0";
	Boolean done = false;
	while( !str.equals("quit") ) {
	    int y = 0;
	    // get input
	    // break input up into operations and values
	    String[] op = str.split(" ");

	    // check to see if the input is valid
	    if (validateInput(op)) {
		// determine the operation
		switch (getOperation(op)) {
		case 0:
		    //		    y = add(op[0], op[3]);
		    break;
		case 1:
		    break;
		case 2:
		    break;
		case 3:
		    break;
		case 4:
		    break;
		}
	    } else {
		System.out.println("Invalid input\n\tint operator int");
	    }

	    System.out.println("\t" + y);
	}
    }
    
    static public void main(String[] arg) {
	Calculator cal = new Calculator();
	cal.run();
    }

}