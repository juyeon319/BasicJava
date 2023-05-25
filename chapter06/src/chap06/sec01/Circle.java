package chap06.sec01;

//예제1) 원점과 반지름을 보유한 원(Circle)클래스를 생성하시오.
//또 너비와 둘레를 구하는 메서드도 포함하시오.
public class Circle {
	double radius;
	final double PI = 3.1415926; 
	int x;
	int y;
	
	//원의 넓이
	public double getArea() {
		double area = radius * radius * PI;
		return area;
	}
	
	//원의 넓이
	public void getCircumference() {
		getPoint();
		System.out.println("원의 둘레 : " + (2 * radius * PI));
	}
	
	public void getPoint() {
		System.out.println("원의 원점 : (" + x + ", " + y + ")");
	}
}
