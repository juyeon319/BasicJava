package chap05.sec02;

import java.util.Scanner;

public class OneDimArrayEx01 {

	public static void main(String[] args) {
		int[] score = {80, 75, 95, 80, 88};
		OneDimArray od = new OneDimArray();
		od.method1();
		System.out.println("\n합계 = "+od.addArray(score));
	}
}
class OneDimArray {
	Scanner sc = new Scanner(System.in);
	
	public void method1() {
		//정수 5개를 저장하는 배열을 생성하고, 
		//10, 20, 30, 40, 50을 저장한 후
		//출력해라
		
		int[] num1=null;
		
		num1 = new int[5];
		char[] num2 = {'a', 'b', 'c', 'd', 'e'};
		boolean[] num3 = new boolean[5];
		
		for(int i=0; i<num2.length; i++) {
			System.out.print(num2[i]+",");
		}
	}
	
	public int addArray(int[] jumsu) {
		int sum = 0;
		for(int i=0; i<jumsu.length; i++) {
			sum+=jumsu[i];
		}
		return sum;
	}
}

