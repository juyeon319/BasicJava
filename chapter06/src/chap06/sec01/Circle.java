package chap06.sec01;

//����1) ������ �������� ������ ��(Circle)Ŭ������ �����Ͻÿ�.
//�� �ʺ�� �ѷ��� ���ϴ� �޼��嵵 �����Ͻÿ�.
public class Circle {
	double radius;
	final double PI = 3.1415926; 
	int x;
	int y;
	
	//���� ����
	public double getArea() {
		double area = radius * radius * PI;
		return area;
	}
	
	//���� ����
	public void getCircumference() {
		getPoint();
		System.out.println("���� �ѷ� : " + (2 * radius * PI));
	}
	
	public void getPoint() {
		System.out.println("���� ���� : (" + x + ", " + y + ")");
	}
}
