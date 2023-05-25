package chap03.sec01;

public class UnaryOperator {

	public static void main(String[] args) {
		//���׿����� : ��ȣ(+, -), �߰�(++, --), ������(!)
		logicalNot();
	}
	
	public static void signOperator() {
		//��ȣ������ : ���(+), ����(-)
		int num1 = 100;
		int num2 = -num1;
		
		System.out.println("num1="+num1);
		System.out.println("num2="+num2);
	}
	
	public static void incremetOperator() {
		//���������� : ++, --
		int num = 100;
		int res1 = 0;
		int res2 = 0;
		
		//����(postfix) ǥ���
//		res1 = num++;
//		System.out.println("num="+num+"\nres1="+res1);
		System.out.println("num++="+(num++)+", num="+num);
		System.out.println("=========================");
		
		num = 100;
		//����(prefix) ǥ���
//		res2 = ++num;
//		System.out.println("num="+num+"\nres2="+res2);
		System.out.println("++num="+(++num)+", num="+num);
	}
	
	public static void logicalNot() {
		//�� ���� ������ : !
		//��۱��(toggle) : ���� ������ �ݺ��Ǵ� ���
		//�ѿ���ȯ, ����/������� ��
		boolean powerState=true;
		
		while(true) {
		if(powerState) {
			System.out.println("���� ����ġ�� on�����Դϴ�.");
		} else {
			System.out.println("���� ����ġ�� off�����Դϴ�.");
			}
		powerState=!powerState;
		} 
	}
}
