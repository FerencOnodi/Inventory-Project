public class StorageManager {

	public void addStorage(StoreCapable storage) {
		this.storage = storage;
	}

	public void addCDProduct(String name, int price, int tracks) {
		storage.storeCDProduct(name, price, tracks);
		
	}

	public void addBookProduct(String name, int price, int size) {
		storage.storeBookProduct(name, price, size);
	}

	public String listProducts() {
	return listOfProducts;
	}

	public int getTotalProductPrice() {
	return price;
	}
}
