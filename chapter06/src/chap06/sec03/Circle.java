package chap06.sec03;

//����2) ���� ������ �����ϴ� ����(Cylinder) Ŭ������ �ۼ��Ͻÿ�.
//����ʵ� : ��Ŭ���� ��ü, �Ǽ�Ÿ���� ����
//�޼��� : ������, ������ ����Ͽ� ��ȯ �޼���  
//��(Circle)Ŭ����
//����ʵ� : ������(�Ǽ�:radius), ���(PI, 3.1415926)
//�޼��� : ������, ������ ����Ͽ� ��ȯ �޼���  

public class Circle {
	private double radius;
	private final double PI = 3.1415926;
	
	Circle(){}
	Circle(double radius) {
		this.radius=radius;
	}
	
	//���� �ʺ�
	public double getArea() {
		return radius*radius*PI;
	}
}
