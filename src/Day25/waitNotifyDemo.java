package Day25;

	class SharedData {
		
		private boolean available = false;
		
		public synchronized void produce() {
			
			System.out.println("Producing data...");
			
			available = true;
			
			notify();
			
			System.out.println("Producer notified consumer.");
		}
		
		public synchronized void consume() {
			
			while (!available) {
				
				try {
					System.out.println("Consumer is waiting...");
					wait();
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			System.out.println("Consumer received the data.");
		}
	}
	
	public class waitNotifyDemo {
		
		public static void main(String[] args) {
			
			SharedData data = new SharedData();
			
			Thread consumer = new Thread(() -> {
				data.consume();
			});
			
			Thread producer = new Thread(() -> {
				data.produce();
			});
			
			consumer.start();
			producer.start();
		}
	}