package chap07.sec04;

public abstract class  Shape {
	String kind;
	
	//추상메소드 정의
	public abstract void draw(); 
	
	Shape(String kind) {
		this.kind=kind;
	}
	
	@Override
	public String toString() {
		return kind;
	}
	
	}
