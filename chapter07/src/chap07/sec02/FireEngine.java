package chap07.sec02;

public class FireEngine extends Car01{
	int amountWater;
	String color="red";
	
	public void water() {
		System.out.println("���� �Ѹ���.");
	}
	
	@Override
	public void stop() {
		System.out.println("�ҹ����� �����߽��ϴ�...");
	}
}
