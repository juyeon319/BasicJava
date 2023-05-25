package chap06.sec03;

public class AnimalEx {

	public static void main(String[] args) {
		Animal a1 = new Animal();
		System.out.println(a1.getkind());

		a1.setKind("강아지");
		System.out.println(a1.getkind());

		Animal a2 = new Animal("고양이");
		System.out.println(a2.getkind());
		
	}
}
