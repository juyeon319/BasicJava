package chap07.sec03;

import java.util.ArrayList;

public class Buyer {
	int money;
	int bonusPoint;
	ArrayList<Product> cart = new ArrayList<Product>();
	int i=0; //cart 배열의 index
	
	Buyer() {
		money=5000;
		bonusPoint=0;
	}
	
	//다형성 : 부모 클래스 이름으로 자식 클래스 개체를 불러다 쓰는 것
	void buy(Product p) {
		cart.add(p);
	}
	
	void summary() {
		int sum=0; //구매금액 합계
		String list = ""; //구매 목록
		
		for(int i=0; i<cart.size(); i++) {
			if(cart.get(i) != null) {
			sum=sum+cart.get(i).price;
			bonusPoint+=cart.get(i).bonusPoint;
			list+=cart.get(i).toString()+", ";
			}
		}
		
		System.out.println("구매목록 : "+list);
		System.out.println("구매금액 합계 : "+sum);
		System.out.println("지급 보너스포인트 : "+bonusPoint);
		System.out.println("남은 돈 : "+(money-sum));
	}
}
