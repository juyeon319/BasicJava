package chap11.sec01;

public class ObjectEx {

	public static void main(String[] args) {
		Person p1 = new Person("홍길동");
		System.out.println("getinfo() : " + p1.getinfo());
		System.out.println("toString() : " + p1.toString());
		
		Person p2 = new Person("홍길순");
		if (p2.equals(p1)) {
			System.out.println("같은 내용");
		} else {
			System.out.println("다른 내용");
		}
	}
}

class Person {
	private String name;
	
	Person(String name) {
		this.name=name;
	}
	
	String getinfo() {
		return getClass().getName() + '@' + Integer.toHexString(hashCode());
	}
	
	@Override
	public String toString() {
		return name;
	}
}
