package chap04.sec01;

import java.util.Scanner;

public class method3 {
	//���� �Է¹޾�
	//3~5�� : "�� �Դϴ�."
	//6~8�� : "���� �Դϴ�."
	//9~11�� : "���� �Դϴ�."
	//12��~2�� : "�ܿ� �Դϴ�."�� ����ϴ� ���α׷� �ۼ�

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է��ϼ���.(1~12)>>");
		int month = sc.nextInt();
		
		if(month>=3 && month<=5) {
			System.out.println(month + "�� : �� �Դϴ�.");
		} else if(month>=6 && month<=8) {
			System.out.println(month + "�� : ���� �Դϴ�.");
		} else if(month>=9 && month<=11) {
			System.out.println(month +"�� : ���� �Դϴ�.");
		} else if(month==12 || month==1 || month==2) {
			System.out.println(month +"�� : �ܿ� �Դϴ�.");
		}
	}
}
