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
	
//	����1) 10��, 50��, 100��¥�� �������� 
//	860���� �����ϴ� ����� ��� ����Ͻÿ�.
//  �� ��� ������ 1�� �̻� ����ؾ� �Ѵ�.(for�� ���)
	public void method1() {
		int money = 860;
		int count = 0;
		System.out.println("10��, 50��, 100��¥�� �������� 860���� �����ϴ� ���");
		System.out.println("=========================================");
		
		for(int money10=1; money10<=money/10; money10++) {
			for(int money50=1; money50<=money/50; money50++) {
				for(int money100=1; money100<=money/100; money100++) {
					int result = money10*10 + money50*50 + money100*100;
					if(result==money) {
						count++;
						System.out.println(+ count + ". " + "10��¥�� " + money10 + "��, " + "50��¥�� " + money50 + "��, " + "100��¥�� " + money100 + "��");
					}
				}
			}
		}
	}
	
/*	����2) ������ ���� �������� ��� �ǵ��� ���α׷����Ͻÿ�.(for�� ���)
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
	
/*	����3) 1 ~ 50 ������ ������ �ϳ� �߻���Ű��,  
        ����ڰ� �� ���� ���ߴ� ���α׷��� �ۼ��Ͻÿ�
        ��, ����ڰ� �Է��� ���� �߻��� �������� ������ 
    "�� ū���� �Է��ϼ���"��� �޽�����,
        �������� ū ���̸� "�� ���� ���� �Է��ϼ���" ��� �޽����� ����� �� 
        ���ο� ���� �Է� �޴´�
        ������ ����ڰ� �Է��� ���� ������ "�����Դϴ�"��� �޽����� 
        �׶����� �õ��� Ƚ���� ����Ѵ�.
    (while�� ���) */
	public void method3() {
		int num = (int)(Math.random()*50)+1;
		System.out.println("1~50������ �������� ���������ϴ�. ���纸����!");
		int count = 1;
		
		while(true) {
		System.out.print(count+">>");
		int user = sc.nextInt();
		
		if(user<num) {
			System.out.println("�� ū ���� �Է��ϼ���.");
		} else if(user>num) {
			System.out.println("�� ���� ���� �Է��ϼ���.");
		} else {
			System.out.println("�����Դϴ�.");
			break;
			}
		count++;
		}
		System.out.println("�õ� Ƚ�� : " + count + "��");
	}	

//	����4] �� ���� �ֻ����� ������ ��, 
//	���� ���� 6�� �Ǵ� ��� ����� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//  (for��)
	public void method4() {
	for(int i=1; i<=6; i++) {
		for(int j=1; j<=6; j++) {
			if(i+j==6) {
				System.out.println(i + "+" + j + "=" + (i+j));
			}
		}
	}	
}
	
//	����5) ���ڷ� �̷���� ���ڿ� str�� ���� ��, 
//	�� �ڸ��� ���� ���� ����� ����ϴ� �ڵ带 �ϼ��϶�.
//  ���� ���ڿ��� "12345"���, 
//  ��1+2+3+4+5���� ����� 15�� ��µǾ�� �Ѵ�.(for��)
	public void method5() {
	String str = "12345";
	int sum = 0;
	
	for(int i=0; i<str.length(); i++) {
		int num = Integer.parseInt(String.valueOf(str.charAt(i)));
		sum += num;
	} System.out.println(sum);
}
	
//	����6) int Ÿ���� ���� num�� ���� ��, 
//	�� �ڸ��� ���� ���� ����� ����ϴ� �ڵ带 �ϼ��϶�
//  ���� ���� �� ���� ��� . num 12345 , 
//  ��1+2+3+4+5���� ����� 15�� ����϶�(while��)
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