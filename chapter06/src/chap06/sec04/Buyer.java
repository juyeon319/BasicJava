package chap06.sec04;

public class Buyer {
	
	public int saleGoods(Goods goods, int amt) {
		return goods.getPrice()*amt;
	}
}
