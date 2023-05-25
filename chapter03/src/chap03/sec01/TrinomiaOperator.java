package chap03.sec01;

import java.util.Scanner;

public class TrinomiaOperator {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
//		method1();
		method2();
		//���� ������ : (���ǽ�)? ��ɹ�1 : ��ɹ�2
		//- ���ǽ��� �� ��� ���̸� ��ɹ�1�� �����ϰ�, 
		//	�����̸� ��ɹ�2�� �����Ѵ�.
		//- ��ɹ�1,2���� ���̳� ������� ���
	}
	
	public static void method1() {
		//���̸� �Է� �޾� �������� �ƴ��� �̼����������� �Ǻ��ϴ� ���α׷�
		System.out.print("���̸� �Է��Ͻÿ�.>>");
		int age = sc.nextInt();
		
		String str = (age>=18) ? "������ �Դϴ�" : "�̼����� �Դϴ�.";
		System.out.println("���� : " + age + " ==> " + str);
	}
	
	public static void method2() {
		//Ű����� ������ �Է� �޾� 
		//100~90 : A, 89~80 : B, 79~70 : C,
		//69~60 : D, �� �����̸� F ���
		System.out.print("������ �Է��Ͻÿ�.>>");
		int score = Integer.parseInt(sc.nextLine());
		
		String grade = (score>=90 ? "A" : (score>=80 ? "B" : (score>=70 ? "C" : (score>=60 ? "D" : "F"))));
		System.out.println("���� : " + score + " ==> " + grade + "����");
		
	}
}
