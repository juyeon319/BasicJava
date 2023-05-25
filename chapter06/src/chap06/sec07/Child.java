package chap06.sec07;

//상속
public class Child extends Parent{
	String gender;
	int age = 25;
	
	Child() {
		//super();
	}
	
	Child(String gender, String name, int age) {
		super(name, age); //부모 클래스를 호출할 때
		this.gender=gender;
 	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return super.age; //super를 붙이면 부모 클래스 나이 반환
	}
}
