package Day24;

	class SafeCounter {

		int count = 0;

		public synchronized void increment() {
			count++;
		}
	}
	
	public class SynchronizedDemo {
		
		public static void main(String[] args) throws InterruptedException {
			
			SafeCounter counter = new SafeCounter();
			
			Thread thread1 = new Thread(() -> {
				for (int i = 1; i <= 1000; i++) {
					counter.increment();
				}
			});
			
			Thread thread2 = new Thread(() -> {
				for (int i = 1; i <= 1000; i++) {
					counter.increment();
				}
			});
			
			thread1.start();
			thread2.start();
			
			thread1.join();
	        thread2.join();
	        
	        System.out.println("Final Count: " + counter.count);
		}
	}
