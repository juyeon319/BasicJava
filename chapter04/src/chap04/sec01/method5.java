package chap04.sec01;

import java.util.Scanner;

public class method5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���̸� �Է��ϼ���>>");
		int age = sc.nextInt();
		System.out.print("�����Ը� �Է��ϼ���>>");
		int weight = sc.nextInt();
		
		if(age>=18 && weight>=50) {
			System.out.println("������ �����մϴ�.");
		} else
			System.out.println("������ �Ұ����մϴ�.");
	}
}