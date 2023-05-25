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
// 	문제 1) 1/1 + 1/2 + 1/3 +... +1/10 의 합을 구하시오.
		double sum = 0.0;
		for(int i=1; i<=10; i++) {
			sum += 1.0/i;
		} 
		System.out.println("sum = " + sum);
	}
	
	public void method2() {
//	문제 2) 1-2+3-4+......-10=xx 를 구하여 출력하시오.
//         출력도 반드시 위의 형식대로 출력할 것
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
//	문제 3) 컴퓨터와 가위,바위,보 게임을 하려고 한다. 
//		     이를 프로그램하시오.(난수 사용)
		System.out.println("가위, 바위, 보 게임을 시작합니다.");
		System.out.print("사용자>>");
		String user = sc.nextLine();
		
		int com = (int)(Math.random()*3);
		String comstr = "";
		
		int result = 0;
		
	switch (com) {
		case 0:
			comstr = "가위";
			if(user.equals("가위")) {
				result=1;
			} else if(user.equals("바위")) {
				result=2;
			} else {
				result=3;
			}
			break;
		case 1:
			comstr = "바위";
			if(user.equals("가위")) {
				result=3;
			} else if(user.equals("바위")) {
				result=1;
			} else {
				result=2;
			}
			break;
		case 2:
			comstr = "보";
			if(user.equals("가위")) {
				result=2;
			} else if(user.equals("바위")) {
				result=3;
			} else {
				result=1;
			}
			break;
		}
		System.out.println("컴퓨터>>"+comstr);
		
		if(result==1) {
			System.out.println("비겼습니다.");
		} else if(result==2) {
			System.out.println("사용자가 이겼습니다.");
		} else {
			System.out.println("컴퓨터가 이겼습니다.");
		}
	}
}
