package Day21;

class Pair<K, V> {

	private K key;
	private V value;

	public Pair(K key, V value) {

		this.key = key;
		this.value = value;
	}

	public void display() {

		System.out.println("Key: " + key);
		System.out.println("Value: " + value);
	}
}

	public class KeyValue {

		public static void main(String[] args) {

			Pair<Integer, String> student =
					new Pair<>(101, "Murali");

			student.display();
	}
}