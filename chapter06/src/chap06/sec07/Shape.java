package chap06.sec07;

public class Shape {
	public void calcArea() {
		System.out.println("������ ���� ���");
	}
}

class Circle extends Shape{
	private int radius;
	private final double PI = 3.1415926;
	
	Circle(int radius) {
		this.radius=radius;
	}
	
	@Override
	public void calcArea() {
		System.out.println("�� ���� : " + (radius*radius*PI));
	}
}

class Retangle extends Shape{
	private int width;
	private int height;
	
	Retangle(int width, int height) {
		this.width=width;
		this.height=height;
	}
	
	@Override
	public void calcArea() {
		System.out.println("�簢�� ���� : " + (width*height));
	}
}


