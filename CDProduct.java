public class CDProduct extends Product {

	public int numOfTrack;

	public CDProduct(String name, Integer price, int numOfTracks) {
		super(name, price);
		this.numOfTracks = numOfTracks;
	}
}
