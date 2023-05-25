package chap06.sec03;

//예제2) 다음 조건을 만족하는 원통(Cylinder) 클래스를 작성하시오.
//멤버필드 : 원클래스 객체, 실수타입의 높이
//메서드 : 생성자, 면적을 계산하여 반환 메서드  
//원(Circle)클래스
//멤버필드 : 반지름(실수:radius), 상수(PI, 3.1415926)
//메서드 : 생성자, 면적을 계산하여 반환 메서드  
public class Cylinder {

		private double height;
		Circle circle;
		
		Cylinder(){}
		Cylinder(double height, Circle circle) {
			this.height=height;
			this.circle=circle;
	}
		//원의 부피
		public double getVolumn() {
			return height*circle.getArea();
	}
}
