package chap06.sec03;

public class AnimalEx {

	public static void main(String[] args) {
		Animal a1 = new Animal();
		System.out.println(a1.getkind());

		a1.setKind("������");
		System.out.println(a1.getkind());

		Animal a2 = new Animal("�����");
		System.out.println(a2.getkind());
		
	}
}
