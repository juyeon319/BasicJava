package chap07.sec03;

	//�⺻ Ŭ����
	public class Product {
	int price;
	int bonusPoint;

	//�߻�ȭ > super
	public Product(int price) {
		this.price=price;
		bonusPoint=price/10;
	}
}
