public class StorageManager {

	public void addStorage(StoreCapable storage) {
		this.storage = storage;
	}

	public void addCDProduct(String name, int price, int tracks) {
		Product cd = ((Store)storage).createProduct("CD", name, price, tracks);
	}

	public void addBookProduct(String name, int price, int size) {
		Product book = ((Store)storage).createProduct("Book", name, price, size);
	}

	public String listProducts() {
	return listOfProducts;
	}

	public int getTotalProductPrice() {
	return price;
	}
}
