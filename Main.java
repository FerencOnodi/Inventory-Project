public class Main {

	public static void main(String[] args) {
		StorageManager storeManager = new StorageManager();
		StoreCapable storeCapable = new PersistentStore();
		storeManager.addStorage(storeCapable);
		storeManager.addCDProduct("DJ Közwilágításh megamix", 2500, 25);
		storeManager.addBookProduct("Masturbating in public made simple", 3500, 120);
		System.out.println(storeManager.listProducts());
		System.out.println(storeManager.getTotalProductPrice());
	}
}
