package chap04.sec01;

import java.util.Scanner;

public class method5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요>>");
		int age = sc.nextInt();
		System.out.print("몸무게를 입력하세요>>");
		int weight = sc.nextInt();
		
		if(age>=18 && weight>=50) {
			System.out.println("헌혈이 가능합니다.");
		} else
			System.out.println("헌혈이 불가능합니다.");
	}
}