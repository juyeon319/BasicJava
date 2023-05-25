package chap03.sec01;

import java.util.Scanner;

public class TrinomiaOperator {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
//		method1();
		method2();
		//삼항 연산자 : (조건식)? 명령문1 : 명령문2
		//- 조건식의 평가 결과 참이면 명령문1을 수행하고, 
		//	거짓이면 명령문2를 수행한다.
		//- 명령문1,2에는 값이나 연산식을 기술
	}
	
	public static void method1() {
		//나이를 입력 받아 성년인지 아닌지 미성년자인지를 판별하는 프로그램
		System.out.print("나이를 입력하시오.>>");
		int age = sc.nextInt();
		
		String str = (age>=18) ? "성년자 입니다" : "미성년자 입니다.";
		System.out.println("나이 : " + age + " ==> " + str);
	}
	
	public static void method2() {
		//키보드로 점수를 입력 받아 
		//100~90 : A, 89~80 : B, 79~70 : C,
		//69~60 : D, 그 이하이면 F 출력
		System.out.print("점수를 입력하시오.>>");
		int score = Integer.parseInt(sc.nextLine());
		
		String grade = (score>=90 ? "A" : (score>=80 ? "B" : (score>=70 ? "C" : (score>=60 ? "D" : "F"))));
		System.out.println("점수 : " + score + " ==> " + grade + "학점");
		
	}
}
