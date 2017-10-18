
public class ShoppingCart {

	public int size; 
	public int amountOfGoods; 
	
	public int stockAddded (int goodsAdds) {
		amountOfGoods = amountOfGoods - goodsAdds;
		return amountOfGoods; 
	}
	
	public int stockTaken (int goodsTaken) {
		amountOfGoods = amountOfGoods - goodsTaken;
		return amountOfGoods; 
	}

	
}
