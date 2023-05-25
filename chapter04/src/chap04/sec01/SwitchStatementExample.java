package chap04.sec01;

import java.util.Scanner;

public class SwitchStatementExample {
	
	public static void main(String[] args) {
		//��ü����
		SwitchStatement sw = new SwitchStatement();
		//method1 ȣ��
//		sw.method1();
//		sw.method2();
//		sw.method3();
		sw.method4();
	}
}

class SwitchStatement {
	Scanner sc = new Scanner(System.in);
	
	public void method1() {
		//1. ȸ���� ����ڵ�(1-3)�� �Է� �޾�
		//1��� �̸� "VIP ȸ���Դϴ�"��
		//2����̸� "��� ȸ���Դϴ�"��
		//3����̸� "�Ϲ� ȸ���Դϴ�"��
		//�� �̿��� ���̸� "�߸��� ��� �ڵ� �Դϴ�"�� ����ϴ� ���α׷�
		
		System.out.print("ȸ�� ��� �Է�(1-3) : ");
		int grade = Integer.parseInt(sc.nextLine());
		
		switch (grade) {
		case 1: 
			System.out.println("VIP ȸ���Դϴ�.");
			break;
		case 2:
			System.out.println("��� ȸ���Դϴ�.");
			break;
		case 3:
			System.out.println("�Ϲ� ȸ���Դϴ�.");
			break;
		default:
			System.out.println(grade+"�� �߸��� ��� �ڵ� �Դϴ�.");
		}
	}
	
	public void method2() {
//		2. 1-12�� ������ ���� �Է� �޾�
//		31�ϱ��� �����ϸ� "����¥�� 31���� ���Դϴ�."��
//		30�ϱ��� �����ϸ� "����¥�� 30���� ���Դϴ�."��
//		2���̸� "����¥�� 28���� 2���Դϴ�." 
		
		System.out.print("�� �Է�(1-12) : ");
		int month = sc.nextInt();

		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println(month+"���� ������ ��¥�� 31���� ���Դϴ�.");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println(month+"���� ������ ��¥�� 30���� ���Դϴ�.");
			break;
			default:
				System.out.println("������ ��¥�� 28���� "+month+"���Դϴ�.");
			}
		}
	
	public void method3() {
		//3. �������� ���� ����(kor,jp,ch)�� �Է� �޾� 
		// �ѱ۷� �������� ���
		System.out.print("�������� ���� ����(kor, jp, ch)�� �Է� : ");
		String str = sc.nextLine();
		
		switch (str) {
		case "kor":
			System.out.println("���ѹα�");
			break;
		case "jp":
			System.out.println("�Ϻ�");
			break;
		default:
			System.out.println("�߱�");
		}
	}
	
	public void method4() {
//		4. ������ �Է� �޾�
//		90~92 : A-
//		93~95 : A0
//		97~99 : A+
//
//		80~82 : B-
//		83~85 : B0
//		87~89 : B+
//
//		�� ���ϴ� "fail"�� ���(��øif�����)
		
		System.out.print("���� �Է� : ");
		int score = sc.nextInt();
		String grade = "";
		
			switch (score/10) {
			case 10: 
				grade = "A+";
				break;
			case 9:
				grade = "A";
				switch (score%10) {
				case 0: case 1 : case 2:
					grade += "-";
				break;
				case 3: case 4: case 5:
					grade += "0";
				break;
				case 7: case 8: case 9:
					grade += "+";
				}
				break;
			case 8:
				grade = "B";
				switch (score%10) {
				case 0: case 1 : case 2:
					grade += "-";
					break;
				case 3: case 4: case 5:
					grade += "0";
					break;
				case 7: case 8: case 9:
					grade += "+";
				}
				break;
		default:
			System.out.println("fail");
		} System.out.println("���� : "+ score + "��, ���� : " + grade);
	}
}



