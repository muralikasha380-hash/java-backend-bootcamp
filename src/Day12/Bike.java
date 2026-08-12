package Day12;

public class Bike implements vehicle {

	@Override
	public void start() {
		System.out.println("Bike is starting");
	}

	@Override
	public void stop() {
		System.out.println("Bike is stopping");
	}
}

