import java.util.ArrayList;
public abstract class Store implements StoreCapable {

	private void saveToXML(Product product) {
		Element root = new Element("Product");		
	}

	protected void storeProduct(Product product) {
	}

	protected Product createProduct(String type, String name, int price, int size) {
		if(type == "CD") {
			Product cd = new CDProduct(name, price, size);
			return cd;
		} else {
			Product book = new Bookproduct(name, price, size);
			return book;
		}
	}

	public ArrayList<Product> loadProducts() {
	}
	
	public void store(Product product) {
	}

	void storeCDProduct(String name, int price, int tracks) {
		Product cd = new CDProduct(name, price, tracks);
		saveToXML(cd);
	}
	
	void storeBookProduct(String name, int price, int size) {
		Product book = new BookProduct(name, price, size);
		saveToXML(book);
	}

	public ArrayList<Product> getAllProduct() {
	}
}
