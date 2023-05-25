package chap04.sec01;

import java.util.Scanner;

public class method3 {
	//월을 입력받아
	//3~5월 : "봄 입니다."
	//6~8월 : "여름 입니다."
	//9~11월 : "가을 입니다."
	//12월~2월 : "겨울 입니다."를 출력하는 프로그램 작성

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("월을 입력하세요.(1~12)>>");
		int month = sc.nextInt();
		
		if(month>=3 && month<=5) {
			System.out.println(month + "월 : 봄 입니다.");
		} else if(month>=6 && month<=8) {
			System.out.println(month + "월 : 여름 입니다.");
		} else if(month>=9 && month<=11) {
			System.out.println(month +"월 : 가을 입니다.");
		} else if(month==12 || month==1 || month==2) {
			System.out.println(month +"월 : 겨울 입니다.");
		}
	}
}
