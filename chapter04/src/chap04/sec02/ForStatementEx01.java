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
		//1~10������ ���� ���ٿ� ���
		//�� �յ� ���ض�
		int sum = 0;
		for(int i=0; i<10; i++) {
			System.out.printf("%3d",(i+1));
			sum += i;
		}
		System.out.println("\nsum="+sum);
	}
	
	public void method2() {
		//1.  1���� 100������ ¦���� �հ� Ȧ���� ���� ���Ͻÿ�.
		int sumOfEven = 0;
		int sumOfOdd = 0;
		
		for(int i=1; i<=100; i++) {
			if(i%2==0) {
				sumOfEven += i;
			} else {
				sumOfOdd += i;
			} 
		} 
		System.out.println("¦���� �� : "+sumOfEven);
		System.out.println("Ȧ���� �� : "+sumOfOdd);
	}
	public void method3() {
		//2. ���ڿ��� ������ �Է� �޾� 
//		�ش� ���ڿ��� �Էµ� ���ڸ�ŭ �ݺ��Ͽ� ����Ͻÿ�.
		System.out.print("���ڿ� �Է� : ");
		String str = sc.nextLine();
		
		System.out.print("���� �Է� : ");
		int count = sc.nextInt();
		
		for(int i=0; i<count; i++) {
			System.out.print(str + ",");
		}
	} 
	public void method4() {
		//3. ���ĺ� A~Z������ ���ٷ� �μ��Ͻÿ�
		for(char ch='A'; ch<='Z'; ch++) {
			System.out.print(ch);
		}
	}
	public void method5() {
		//4. 1-50������ ������ ������ �߻����� 
//		�� ������ Ȧ���� ���� ����Ͻÿ�.
		int rnd = (int)(Math.random()*50)+1;
		int sum = 0;
		for(int i=1; i<=rnd; i++) {
			sum += i;
		}
		System.out.println("1����" + rnd + "������ �� = "+sum);
	}
}
	
