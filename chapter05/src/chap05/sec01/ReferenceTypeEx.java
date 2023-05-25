package chap05.sec01;

public class ReferenceTypeEx {

	public static void main(String[] args) {
		Person p1 = new Person("ȫ�浿", 50);
		//toString �޼ҵ尡 �������ؼ� ���ڰ� ������.
		String str = new String("ȫ�浿");
		
		int[] score = new int[10];
		System.out.println(args[0] + ", " + args[1] + ", " + args[2]);
		
		System.out.println("p1="+p1);
		System.out.println("str="+str);
		System.out.println("score="+score);
	}
}

class Person {
	//�������
	String name;
	int age;
	
	//������ �޼ҵ� : ��������� ���� �ʱ�ȭ, ��� Ŭ������ ������ �޼ҵ带 �ϳ� �̻� ������ ��
	//�����ε� : �� Ŭ���������� �̸��� �Ȱ��� �޼ҵ尡 ������ �����ϴ� ��, 
	//�پ��� ������ ��� ����, ����ϴ� �Ű������� ������ Ÿ���� �ٸ��� �̸��� ���Ƶ� �������
	//�������̵� : �θ� Ŭ�������� �����س��� Ŭ������ �ڽ� Ŭ�������� �ٽ� ������ �ϴ� ��

	Person() {} //�⺻ ������ : �Ű����� ������ ����
	Person(String name, int age) { //�Ű����� : �ܺηκ��� �����͸� ���� �� ���
		this.name=name;
		this.age=age;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}