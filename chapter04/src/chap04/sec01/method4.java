package chap04.sec01;

import java.util.Scanner;

public class method4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("체중을 입력하시오.>>");
		double weight = sc.nextDouble();
		System.out.print("키를 입력하시오.>>");
		double height = sc.nextDouble();
		
		double bmi = weight/(height*height);
		
		if(bmi<=18.4) {
			System.out.println("저체중");
		} else if(bmi>=18.5 && bmi<=22.9) {
			System.out.println("정상");
		} else if(bmi>=23.0 && bmi<=24.9) {
			System.out.println("과체중");
		}else if(bmi>=25.0 && bmi<=29.9) {
			System.out.println("비만");
		} else
			System.out.println("고도비만");
}
}