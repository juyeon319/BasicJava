package chap06.sec03;

//����2) ���� ������ �����ϴ� ����(Cylinder) Ŭ������ �ۼ��Ͻÿ�.
//����ʵ� : ��Ŭ���� ��ü, �Ǽ�Ÿ���� ����
//�޼��� : ������, ������ ����Ͽ� ��ȯ �޼���  
//��(Circle)Ŭ����
//����ʵ� : ������(�Ǽ�:radius), ���(PI, 3.1415926)
//�޼��� : ������, ������ ����Ͽ� ��ȯ �޼���  
public class Cylinder {

		private double height;
		Circle circle;
		
		Cylinder(){}
		Cylinder(double height, Circle circle) {
			this.height=height;
			this.circle=circle;
	}
		//���� ����
		public double getVolumn() {
			return height*circle.getArea();
	}
}
