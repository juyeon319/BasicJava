package chap06.sec03;

public class CylinderEx {

	public static void main(String[] args) {
		Cylinder c1 = new Cylinder(32.5, new Circle(10));
		System.out.println("원통의 부피는 : " + c1.getVolumn());
		
	}
}
