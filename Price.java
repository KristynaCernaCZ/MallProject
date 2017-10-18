
public class Price {
	
	public int tax; 
	public int costOfGoods;
	public int addedValue;
	public int totalPrice;
	public int discount; 
	
	
	
	public void pricaCalculation() {
	totalPrice = tax + costOfGoods + addedValue;
	}
	
	public void calculateDiscount() {
	totalPrice = totalPrice - discount; 
	}
}
