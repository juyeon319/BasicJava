package chapter02.sec02;

public class CharEX {

	public static void main(String[] args) {
		//char : 2byte(부호없는 정수 : 0 ~ 65535)
		
		char ch1 = '가'; //44032
		System.out.println((char)(ch1+10));
		
		for(char ch='A'; ch<='Z'; ch++) {
			System.out.println(ch+"="+(int)ch);
		}
		
		System.out.println("===================");
		
		for(int i=0; i<=250; i++) {
			System.out.println(i+"=>"+(char)i);
		}
		
		short sh1=200;
		short sh='A';
		
		char ch2=(short)200;
	}
}
