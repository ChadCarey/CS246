
public class Counter implements Runnable {
	
	public void run() {
		for(int i = 1;; i++) { 
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Stoping");
				return;
			} catch (Exception e) {
				System.out.println("Error in counter");
				return;
			}
		}
	}
	
	public static void main(String[] args) {
		Counter c = new Counter();
		c.run();

	}

}
