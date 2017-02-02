public class Main {

	public static void main(String[] args) {
		StorageManager store = new StorageManager();
		StoreCapable sc = new PersistentStore();
		store.addStorage(storage);
	}
}
