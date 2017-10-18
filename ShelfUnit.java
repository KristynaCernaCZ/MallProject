
public class ShelfUnit {
	
	public int numberOfShelfs;
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
