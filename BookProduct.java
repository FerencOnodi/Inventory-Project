public class BookProduct extends Product {

	public int pagesize;
	
	public BookProduct(String name, int price, int pagesize) {

		super(name, price);
		this.pagesize = pagesize;
	}	
}
