package Day21;

	class DataHolder<T> {

	private T data;

	public DataHolder(T data) {
		this.data = data;
	}

	public void display() {
		System.out.println("Data: " + data);
	}
}

public class DataHolderDemo {

	public static void main(String[] args) {

		DataHolder<String> name =
				new DataHolder<>("Murali");

		name.display();

		DataHolder<Integer> accountNumber =
				new DataHolder<>(1001);

		accountNumber.display();

		DataHolder<Double> balance =
				new DataHolder<>(50000.0);

		balance.display();
	}
}