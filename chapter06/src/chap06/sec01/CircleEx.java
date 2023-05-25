package chap06.sec01;

public class CircleEx {

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.radius = 10.2;
		circle.x = 300;
		circle.y = 500;
		
		circle.getPoint();
		double res = circle.getArea();
		System.out.println("¿øÀÇ ³ÐÀÌ : " + circle.getArea());
		
		circle.getCircumference();
	}
}
