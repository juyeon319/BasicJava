package chap04.sec01;

import java.util.Scanner;

public class method4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ü���� �Է��Ͻÿ�.>>");
		double weight = sc.nextDouble();
		System.out.print("Ű�� �Է��Ͻÿ�.>>");
		double height = sc.nextDouble();
		
		double bmi = weight/(height*height);
		
		if(bmi<=18.4) {
			System.out.println("��ü��");
		} else if(bmi>=18.5 && bmi<=22.9) {
			System.out.println("����");
		} else if(bmi>=23.0 && bmi<=24.9) {
			System.out.println("��ü��");
		}else if(bmi>=25.0 && bmi<=29.9) {
			System.out.println("��");
		} else
			System.out.println("����");
}
}