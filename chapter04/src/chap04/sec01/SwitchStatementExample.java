package chap04.sec01;

import java.util.Scanner;

public class SwitchStatementExample {
	
	public static void main(String[] args) {
		//객체생성
		SwitchStatement sw = new SwitchStatement();
		//method1 호출
//		sw.method1();
//		sw.method2();
//		sw.method3();
		sw.method4();
	}
}

class SwitchStatement {
	Scanner sc = new Scanner(System.in);
	
	public void method1() {
		//1. 회원의 등급코드(1-3)를 입력 받아
		//1등급 이면 "VIP 회원입니다"를
		//2등급이면 "우수 회원입니다"를
		//3등급이면 "일반 회원입니다"를
		//그 이외의 값이면 "잘못된 등급 코드 입니다"를 출력하는 프로그램
		
		System.out.print("회원 등급 입력(1-3) : ");
		int grade = Integer.parseInt(sc.nextLine());
		
		switch (grade) {
		case 1: 
			System.out.println("VIP 회원입니다.");
			break;
		case 2:
			System.out.println("우수 회원입니다.");
			break;
		case 3:
			System.out.println("일반 회원입니다.");
			break;
		default:
			System.out.println(grade+"는 잘못된 등급 코드 입니다.");
		}
	}
	
	public void method2() {
//		2. 1-12월 사이의 월을 입력 받아
//		31일까지 존재하면 "끝날짜가 31일인 달입니다."를
//		30일까지 존재하면 "끝날짜가 30일인 달입니다."를
//		2월이면 "끝날짜가 28일인 2월입니다." 
		
		System.out.print("월 입력(1-12) : ");
		int month = sc.nextInt();

		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println(month+"월은 끝나는 날짜가 31일인 달입니다.");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println(month+"월은 끝나는 날짜가 30일인 달입니다.");
			break;
			default:
				System.out.println("끝나는 날짜가 28일인 "+month+"월입니다.");
			}
		}
	
	public void method3() {
		//3. 국가명을 영문 약자(kor,jp,ch)를 입력 받아 
		// 한글로 국가명을 출력
		System.out.print("국가명을 영문 약자(kor, jp, ch)로 입력 : ");
		String str = sc.nextLine();
		
		switch (str) {
		case "kor":
			System.out.println("대한민국");
			break;
		case "jp":
			System.out.println("일본");
			break;
		default:
			System.out.println("중국");
		}
	}
	
	public void method4() {
//		4. 점수를 입력 받아
//		90~92 : A-
//		93~95 : A0
//		97~99 : A+
//
//		80~82 : B-
//		83~85 : B0
//		87~89 : B+
//
//		그 이하는 "fail"를 출력(중첩if문사용)
		
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		String grade = "";
		
			switch (score/10) {
			case 10: 
				grade = "A+";
				break;
			case 9:
				grade = "A";
				switch (score%10) {
				case 0: case 1 : case 2:
					grade += "-";
				break;
				case 3: case 4: case 5:
					grade += "0";
				break;
				case 7: case 8: case 9:
					grade += "+";
				}
				break;
			case 8:
				grade = "B";
				switch (score%10) {
				case 0: case 1 : case 2:
					grade += "-";
					break;
				case 3: case 4: case 5:
					grade += "0";
					break;
				case 7: case 8: case 9:
					grade += "+";
				}
				break;
		default:
			System.out.println("fail");
		} System.out.println("점수 : "+ score + "점, 학점 : " + grade);
	}
}



