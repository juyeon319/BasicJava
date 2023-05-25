package chap07.sec03;

import java.util.ArrayList;

public class Buyer {
	int money;
	int bonusPoint;
	ArrayList<Product> cart = new ArrayList<Product>();
	int i=0; //cart �迭�� index
	
	Buyer() {
		money=5000;
		bonusPoint=0;
	}
	
	//������ : �θ� Ŭ���� �̸����� �ڽ� Ŭ���� ��ü�� �ҷ��� ���� ��
	void buy(Product p) {
		cart.add(p);
	}
	
	void summary() {
		int sum=0; //���űݾ� �հ�
		String list = ""; //���� ���
		
		for(int i=0; i<cart.size(); i++) {
			if(cart.get(i) != null) {
			sum=sum+cart.get(i).price;
			bonusPoint+=cart.get(i).bonusPoint;
			list+=cart.get(i).toString()+", ";
			}
		}
		
		System.out.println("���Ÿ�� : "+list);
		System.out.println("���űݾ� �հ� : "+sum);
		System.out.println("���� ���ʽ�����Ʈ : "+bonusPoint);
		System.out.println("���� �� : "+(money-sum));
	}
}
