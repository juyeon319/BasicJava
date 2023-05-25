package chap06.sec02;

public class ShapeEx {

	public static void main(String[] args) {
		Shape s1 = new Shape("삼각형",100);
		s1.weight=500;
		System.out.println(s1);
		
		Shape s2 = new Shape("사각형",10);
		s2.weight=1500;
		System.out.println(s2);
	}
}