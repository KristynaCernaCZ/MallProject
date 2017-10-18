
public class Good {

	public Price price; 
	public int amountInStock; 
	public String name; 
	public String type; 
	
	public void goodsSold(int amountSold) {
		if(amountSold <= amountInStock) {
		amountInStock = amountInStock - amountSold;
		}else {
			System.out.println("Not enought good in stock");
		}
		
	}
}
