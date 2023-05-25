package chap03.sec01;

import java.util.Scanner;

public class BinaryOperator01 {
	static Scanner sc = new Scanner(System.in); //�������
	
	public static void main(String[] args) {
		logicalOperator();
		//���� ������ : ��κ��� ������(���, ������, ����, ��Ʈ, ����, �̵�) 
	}
	
	public static void arithmeticOperator() {
		//��� ������ : +, -, *, /, % 
		int n1 = 100;
		int n2 = 15;
		System.out.println("n1="+n1);
		System.out.println("n2="+n2);
		
		System.out.println("n1+n2 : " + (n1+n2));
		System.out.println("n1-n2 : " + (n1-n2));
		System.out.println("n1*n2 : " + (n1*n2));
		System.out.println("n1/n2 : " + (n1/n2));
		System.out.println("n1%n2 : " + (n1%n2));
	}
	
	public static void relationOperator() {
		//���� ������ : >, <, >=, <=, =, !=(<>)
		
		System.out.print("������ �Է��Ͻÿ�>>");
		int score = Integer.parseInt(sc.nextLine()); //���ڿ��� �Է¹޾� ����Ÿ������ ��ȯ�ض�
		String grade="";
		
		if(score>=90) {
		 grade="A����";
		} else if(score>=80) {
			grade="B����";
		} else if(score>=70) {
			grade="C����";
		} else if(score>=60) {
			grade="D����";
		} else {
			grade="F����";
		} System.out.println("���� : " + score + "��" + "\n���� : " + grade);
	}
	
	public static void logicalOperator() {
		//���� : 4�� ����̸鼭 100�� ����� �ƴϰų� 400�� ����� �Ǵ� ��
		System.out.print("�⵵�� �Է��Ͻÿ�>>");
		int year = sc.nextInt();
		
		if((year%4==0 && year%100!=0) || year%400==0) {
			System.out.println(year + "��" + " : �����Դϴ�.");
		} else 
			System.out.println(year + "��" + " : ����Դϴ�.");
	}
}
