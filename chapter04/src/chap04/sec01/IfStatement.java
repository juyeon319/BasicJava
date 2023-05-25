package chap04.sec01;

import java.util.Scanner;

public class IfStatement {
	//멤버필드(멤버변수)
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
//		method1();
		method2();
	}
	
	public static void method1() {
		//키보드로 점수를 입력받아 60점 이상이면 
		//"이름 합격"이라는 메세지를 출력하는 프로그램을 만드시오.
	String message = "";
	System.out.print("이름 입력 : ");
	String name = sc.nextLine();
	System.out.print("점수 입력 : ");
	int score = sc.nextInt();
	
	if(score>=60) {
		message=name+"은(는) 합격입니다.";
		System.out.println(message);
		}
	}
	public static void method2() {
		//키보드로 점수를 입력받아 60점 이상이면 
		//"이름 합격입니다."이라는 메세지 출력
		//60점 이하이면
		//"이름 불합격입니다."이라는 메세지 출력
		String message = "";
		System.out.print("이름 입력 : ");
		String name = sc.nextLine();
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		
		if(score>=60) {
			message=name+"은(는) 합격입니다.";
		} else {
			message=name+"은(는) 불합격입니다.";
		} 
		System.out.println(message);
	}
}

