package chap06.sec07;

public class InheritanceEx {

	public static void main(String[] args) {
		Child c1 = new Child("남성","홍길동", 45);
		System.out.println("이름 : " + c1.getName());
		System.out.println("나이 : " + c1.getAge());
	}
}
