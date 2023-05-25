package chap07.sec04;

public class ShapeEx {

	public static void main(String[] args) {
		Triangle t1 = new Triangle("삼각형");
		Circle c1 = new Circle("타원형");
		
		//다형성
		Shape s1 = new Triangle("삼각형");
		Shape s2 = new Circle("타원형");
		
		s1.draw();
		s2.draw();
	}
}
