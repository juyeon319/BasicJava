package chap07.sec04;

public class ShapeEx {

	public static void main(String[] args) {
		Triangle t1 = new Triangle("�ﰢ��");
		Circle c1 = new Circle("Ÿ����");
		
		//������
		Shape s1 = new Triangle("�ﰢ��");
		Shape s2 = new Circle("Ÿ����");
		
		s1.draw();
		s2.draw();
	}
}
