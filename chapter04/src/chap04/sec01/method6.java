package chap04.sec01;

import java.util.Scanner;

public class method6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하시오.>>");
		int num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println("짝수입니다.");
		} else
			System.out.println("홀수입니다.");
	}
}