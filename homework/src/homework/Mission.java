package homework;

import java.util.Scanner;

public class Mission {

	public static void main(String[] args) {
		Mission1 ms = new Mission1();
//		ms.method1();
//		ms.method2();
		ms.method3();
	}
}
class Mission1 {
	Scanner sc = new Scanner(System.in);
	
	public void method1() {
// 	���� 1) 1/1 + 1/2 + 1/3 +... +1/10 �� ���� ���Ͻÿ�.
		double sum = 0.0;
		for(int i=1; i<=10; i++) {
			sum += 1.0/i;
		} 
		System.out.println("sum = " + sum);
	}
	
	public void method2() {
//	���� 2) 1-2+3-4+......-10=xx �� ���Ͽ� ����Ͻÿ�.
//         ��µ� �ݵ�� ���� ���Ĵ�� ����� ��
		int sum = 0;
		String str = "";
		for(int i=1; i<=10; i+=2) {
			sum += i - (i+1);
			str += i + "-" + (i+1);
			if(i!=9) {
				str += "+";
			} else
				str += "=";
		}
		System.out.println(str+sum);
	}
	
	public void method3() {
//	���� 3) ��ǻ�Ϳ� ����,����,�� ������ �Ϸ��� �Ѵ�. 
//		     �̸� ���α׷��Ͻÿ�.(���� ���)
		System.out.println("����, ����, �� ������ �����մϴ�.");
		System.out.print("�����>>");
		String user = sc.nextLine();
		
		int com = (int)(Math.random()*3);
		String comstr = "";
		
		int result = 0;
		
	switch (com) {
		case 0:
			comstr = "����";
			if(user.equals("����")) {
				result=1;
			} else if(user.equals("����")) {
				result=2;
			} else {
				result=3;
			}
			break;
		case 1:
			comstr = "����";
			if(user.equals("����")) {
				result=3;
			} else if(user.equals("����")) {
				result=1;
			} else {
				result=2;
			}
			break;
		case 2:
			comstr = "��";
			if(user.equals("����")) {
				result=2;
			} else if(user.equals("����")) {
				result=3;
			} else {
				result=1;
			}
			break;
		}
		System.out.println("��ǻ��>>"+comstr);
		
		if(result==1) {
			System.out.println("�����ϴ�.");
		} else if(result==2) {
			System.out.println("����ڰ� �̰���ϴ�.");
		} else {
			System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
		}
	}
}
