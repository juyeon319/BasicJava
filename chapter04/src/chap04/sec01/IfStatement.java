package chap04.sec01;

import java.util.Scanner;

public class IfStatement {
	//����ʵ�(�������)
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
//		method1();
		method2();
	}
	
	public static void method1() {
		//Ű����� ������ �Է¹޾� 60�� �̻��̸� 
		//"�̸� �հ�"�̶�� �޼����� ����ϴ� ���α׷��� ����ÿ�.
	String message = "";
	System.out.print("�̸� �Է� : ");
	String name = sc.nextLine();
	System.out.print("���� �Է� : ");
	int score = sc.nextInt();
	
	if(score>=60) {
		message=name+"��(��) �հ��Դϴ�.";
		System.out.println(message);
		}
	}
	public static void method2() {
		//Ű����� ������ �Է¹޾� 60�� �̻��̸� 
		//"�̸� �հ��Դϴ�."�̶�� �޼��� ���
		//60�� �����̸�
		//"�̸� ���հ��Դϴ�."�̶�� �޼��� ���
		String message = "";
		System.out.print("�̸� �Է� : ");
		String name = sc.nextLine();
		System.out.print("���� �Է� : ");
		int score = sc.nextInt();
		
		if(score>=60) {
			message=name+"��(��) �հ��Դϴ�.";
		} else {
			message=name+"��(��) ���հ��Դϴ�.";
		} 
		System.out.println(message);
	}
}

