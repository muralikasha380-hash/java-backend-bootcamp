package Day23;

	public class SleepDemo extends Thread {

		@Override
		public void run() {
			
			for (int i = 1; i <= 5; i++) {
				
				System.out.println("Counting: " + i);
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("Thread interrupted");
				}
			}
		}

	public static void main(String[] args) {
		
		SleepDemo thread = new SleepDemo();
		
		thread.start();
	}
}
