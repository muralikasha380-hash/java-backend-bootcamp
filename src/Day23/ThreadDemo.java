package Day23;

	class MyThread extends Thread {
		
		@Override
		public void run() {
			
			for (int i = 1; i <= 5; i++) {
				System.out.println("Thread is running: " + i);
			}
		}
	}
	
	public class ThreadDemo {
		
		public static void main(String[] args) {
			
			MyThread thread = new MyThread();
			
			thread.start();
		}
	}