public class BookProduct extends Product {

	public int pagesize;
	
	public BookProduct(String name, Integer price, int pagesize) {

		super(name, price);
		this.pagesize = pagesize;
	}	
}
