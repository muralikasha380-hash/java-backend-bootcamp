package Day12;

public class car implements vehicle {
	
	@Override
	public void start() {
		System.out.println("Car is starting");
		
	}

	@Override
	public void stop() {
		System.out.println("Car is stopping");

	}
}

