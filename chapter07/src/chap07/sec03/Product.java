package chap07.sec03;

	//기본 클래스
	public class Product {
	int price;
	int bonusPoint;

	//추상화 > super
	public Product(int price) {
		this.price=price;
		bonusPoint=price/10;
	}
}
