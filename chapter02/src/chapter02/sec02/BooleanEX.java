package chapter02.sec02;

public class BooleanEX {

	public static void main(String[] args) {
		//boolean : true/false를 표현하는 논리 타입
		//			1 byte, 조건문에 사용되어 프로그램 실행제어 수행
		//			다른 타입과 형변환이 발생되지 않음
		
		int age = 30;
		boolean flag = false;
		
		flag=age >=25;
	
		System.out.println(flag);
	}
}
