package chap04.sec01;

import java.util.Scanner;

public class method6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��Ͻÿ�.>>");
		int num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println("¦���Դϴ�.");
		} else
			System.out.println("Ȧ���Դϴ�.");
	}
}