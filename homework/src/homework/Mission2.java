package homework;

import java.util.Scanner;

public class Mission2 {

	public static void main(String[] args) {
	Missionhw ms = new Missionhw ();
//	ms.method1();
//	ms.method2();
//	ms.method3();
//	ms.method4();
	ms.method5();
//	ms.method6();
	}
}
class Missionhw {
	Scanner sc = new Scanner(System.in);
	
//	문제1) 10원, 50원, 100원짜리 동전으로 
//	860원을 구성하는 방법을 모두 출력하시오.
//  단 모든 동전은 1개 이상 사용해야 한다.(for문 사용)
	public void method1() {
		int money = 860;
		int count = 0;
		System.out.println("10원, 50원, 100원짜리 동전으로 860원을 구성하는 방법");
		System.out.println("=========================================");
		
		for(int money10=1; money10<=money/10; money10++) {
			for(int money50=1; money50<=money/50; money50++) {
				for(int money100=1; money100<=money/100; money100++) {
					int result = money10*10 + money50*50 + money100*100;
					if(result==money) {
						count++;
						System.out.println(+ count + ". " + "10원짜리 " + money10 + "개, " + "50원짜리 " + money50 + "개, " + "100원짜리 " + money100 + "개");
					}
				}
			}
		}
	}
	
/*	문제2) 다음과 같이 구구단이 출력 되도록 프로그래밍하시오.(for문 사용)
	2 * 1 = 2         3 * 1 = 3         4 * 1 = 4    
	2 * 2 = 4         3 * 2 = 6         4 * 2 = 8
	2 * 3 = 6         3 * 3 = 9         4 * 3 = 12
	2 * 4 = 8         3 * 4 = 12        4 * 4 = 16
	2 * 5 = 10        3 * 5 = 15        4 * 5 = 20
	2 * 6 = 12        3 * 6 = 18        4 * 6 = 24
	2 * 7 = 14        3 * 7 = 21       	4 * 7 = 28
	2 * 8 = 16        3 * 8 = 24       	4 * 8 = 32
	2 * 9 = 18        3 * 9 = 27       	4 * 9 = 36 */
	public void method2() {
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=4; j++) {
				System.out.printf("%d * %d = %d\t", j, i, (j * i));
			}
			System.out.println();
		}
	}
	
/*	문제3) 1 ~ 50 사이의 난수를 하나 발생시키고,  
        사용자가 그 수를 맞추는 프로그램을 작성하시오
        즉, 사용자가 입력한 수가 발생된 난수보다 작으면 
    "더 큰수를 입력하세요"라는 메시지를,
        난수보다 큰 수이면 "더 작은 수를 입력하세요" 라는 메시지를 출력한 후 
        새로운 값을 입력 받는다
        난수와 사용자가 입력한 값이 같은면 "정답입니다"라는 메시지와 
        그때까지 시도한 횟수도 출력한다.
    (while문 사용) */
	public void method3() {
		int num = (int)(Math.random()*50)+1;
		System.out.println("1~50사이의 랜덤값이 정해졌습니다. 맞춰보세요!");
		int count = 1;
		
		while(true) {
		System.out.print(count+">>");
		int user = sc.nextInt();
		
		if(user<num) {
			System.out.println("더 큰 수를 입력하세요.");
		} else if(user>num) {
			System.out.println("더 작은 수를 입력하세요.");
		} else {
			System.out.println("정답입니다.");
			break;
			}
		count++;
		}
		System.out.println("시도 횟수 : " + count + "번");
	}	

//	문제4] 두 개의 주사위를 던졌을 때, 
//	눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오.
//  (for문)
	public void method4() {
	for(int i=1; i<=6; i++) {
		for(int j=1; j<=6; j++) {
			if(i+j==6) {
				System.out.println(i + "+" + j + "=" + (i+j));
			}
		}
	}	
}
	
//	문제5) 숫자로 이루어진 문자열 str이 있을 때, 
//	각 자리의 합을 더한 결과를 출력하는 코드를 완성하라.
//  만일 문자열이 "12345"라면, 
//  ‘1+2+3+4+5’의 결과인 15가 출력되어야 한다.(for문)
	public void method5() {
	String str = "12345";
	int sum = 0;
	
	for(int i=0; i<str.length(); i++) {
		int num = Integer.parseInt(String.valueOf(str.charAt(i)));
		sum += num;
	} System.out.println(sum);
}
	
//	문제6) int 타입의 변수 num이 있을 때, 
//	각 자리의 합을 더한 결과를 출력하는 코드를 완성하라
//  만일 변수 의 값이 라면 . num 12345 , 
//  ‘1+2+3+4+5’의 결과인 15를 출력하라(while문)
	public void method6() {
	int num = 12345;
	int sum = 0;
	
	while(num>0) {
		sum += num%10;
		num/=10;
		} 
	System.out.println(sum);
	}
}