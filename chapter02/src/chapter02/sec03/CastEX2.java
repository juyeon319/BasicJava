package chapter02.sec03;

import java.io.IOException;

public class CastEX2 {

	public static void main(String[] args) throws IOException {
		System.out.print("문자 하나를 입력하시오.>>");
		int ch1=System.in.read(); //한 글자 입력 받은 후 숫자로 반환됨
		
		System.out.println((char)ch1);
	}
}
