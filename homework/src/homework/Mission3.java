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

	// 1. Ű����� �Ž������� �Է¹޾� ȭ��������� �˼��� ���Ͻÿ�.
	//(ȭ����� : 10000, 5000, 1000, 500, 100, 50, 10)
	public void method1() {
		System.out.print("�Ž������� �Է��ϼ���.>>");
		int money = sc.nextInt();
		

			
		}
	
	// 2. �ֻ����� 50�� ���� ���� ������ ���� Ƚ���� ���ϰ� �̸� ������׷����� ����Ͻÿ�.
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
	
	//3. ���� 10���� �迭�� ������ �� �ִ밪�� �ּҰ��� ���Ͻÿ�.
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
		System.out.println("�ִ밪 : " + max + ", �ּҰ� : " + min);
	}
}