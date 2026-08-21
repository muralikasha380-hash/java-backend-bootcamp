package Day21;

class Box<T> {

	private T value;

	public void setValue(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}
}

public class GenericDemo {

	public static void main(String[] args) {

		Box<String> stringBox = new Box<>();

		stringBox.setValue("Kasha Murali");

		System.out.println(stringBox.getValue());
	}
}
