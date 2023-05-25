package homework;

import java.util.Scanner;

public class Mission3 {

	public static void main(String[] args) {
		Mission5 ms = new Mission5();
//		ms.method1();
//		ms.method2();
		ms.method3();
	}
	
}

class Mission5 {
	Scanner sc = new Scanner(System.in);

	// 1. 키보드로 거스름돈을 입력받아 화폐단위별로 맷수를 구하시오.
	//(화폐단위 : 10000, 5000, 1000, 500, 100, 50, 10)
	public void method1() {
		System.out.print("거스름돈을 입력하세요.>>");
		int money = sc.nextInt();
		

			
		}
	
	// 2. 주사위를 50번 던져 나온 각각의 눈의 횟수를 구하고 이를 히스토그램으로 출력하시오.
	// ex)
	// 1 : ********(8)
	// 2 : *********(9)
	// 3 : **********(10)
	// 4 : ********(8)
	// 5 : *********(9)
	// 6 : *******(7)
	public void method2() {
		
		int count = 0;
		
		for(int i=0; i<50; i++) {

		}
	}
	
	//3. 정수 10개를 배열에 저장한 후 최대값과 최소값을 구하시오.
	public void method3() {
		int[] num = {1, 2, 3, 4, 5, 6, 7 ,8, 9, 10};
		
		int max = num[0];
		int min = num[0];
	
		for(int i=0; i<num.length; i++) {
			if(num[i]>max) {
				max = num[i];
			} else if(num[i]<min) {
				min = num[i];
			}
		}
		System.out.println("최대값 : " + max + ", 최소값 : " + min);
	}
}