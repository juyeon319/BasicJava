package chap04.sec02;

import java.util.Scanner;

public class ForStatementEx01 {

	public static void main(String[] args) {
		ForStatement fs = new ForStatement();
//		fs.method1();
//		fs.method2();
//		fs.method3();
//		fs.method4();
		fs.method5();
	}
}

class ForStatement {
	Scanner sc = new Scanner(System.in);
	public void method1() {
		//1~10사이의 수를 한줄에 출력
		//그 합도 구해라
		int sum = 0;
		for(int i=0; i<10; i++) {
			System.out.printf("%3d",(i+1));
			sum += i;
		}
		System.out.println("\nsum="+sum);
	}
	
	public void method2() {
		//1.  1부터 100사이의 짝수의 합과 홀수의 합을 구하시오.
		int sumOfEven = 0;
		int sumOfOdd = 0;
		
		for(int i=1; i<=100; i++) {
			if(i%2==0) {
				sumOfEven += i;
			} else {
				sumOfOdd += i;
			} 
		} 
		System.out.println("짝수의 합 : "+sumOfEven);
		System.out.println("홀수의 합 : "+sumOfOdd);
	}
	public void method3() {
		//2. 문자열과 정수를 입력 받아 
//		해당 문자열을 입력된 숫자만큼 반복하여 출력하시오.
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		System.out.print("정수 입력 : ");
		int count = sc.nextInt();
		
		for(int i=0; i<count; i++) {
			System.out.print(str + ",");
		}
	} 
	public void method4() {
		//3. 알파벳 A~Z까지를 한줄로 인쇄하시오
		for(char ch='A'; ch<='Z'; ch++) {
			System.out.print(ch);
		}
	}
	public void method5() {
		//4. 1-50사이의 정수형 난수를 발생시켜 
//		그 수까지 홀수의 합을 출력하시오.
		int rnd = (int)(Math.random()*50)+1;
		int sum = 0;
		for(int i=1; i<=rnd; i++) {
			sum += i;
		}
		System.out.println("1부터" + rnd + "까지의 합 = "+sum);
	}
}
	
