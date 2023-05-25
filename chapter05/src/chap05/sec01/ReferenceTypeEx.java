package chap05.sec01;

public class ReferenceTypeEx {

	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 50);
		//toString 메소드가 재정의해서 문자가 찍힌다.
		String str = new String("홍길동");
		
		int[] score = new int[10];
		System.out.println(args[0] + ", " + args[1] + ", " + args[2]);
		
		System.out.println("p1="+p1);
		System.out.println("str="+str);
		System.out.println("score="+score);
	}
}

class Person {
	//멤버변수
	String name;
	int age;
	
	//생성자 메소드 : 멤버변수의 값을 초기화, 모든 클래스는 생성자 메소드를 하나 이상 가져야 함
	//오버로딩 : 한 클래스내에서 이름이 똑같은 메소드가 복수로 존재하는 것, 
	//다양한 데이터 취급 목적, 사용하는 매개변수의 개수나 타입이 다르면 이름이 같아도 상관없음
	//오버라이딩 : 부모 클래스에서 정의해놓은 클래스를 자식 클래스에서 다시 재정의 하는 것

	Person() {} //기본 생성자 : 매개변수 유무로 구분
	Person(String name, int age) { //매개변수 : 외부로부터 데이터를 받을 때 통로
		this.name=name;
		this.age=age;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}