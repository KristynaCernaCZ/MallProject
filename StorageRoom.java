
public class StorageRoom {

	public int totalOnStock; 
	public Good good; 
	
	public void totalAmountOfGoodsInStock() {
		totalOnStock = good.amountInStock; //would be changes to concreate goods 
	}
	
}
