package chapter02.sec02;

public class StringEX {

	public static void main(String[] args) {
		//String : ���ڿ� ó�� ��ü
		//		   " "�� ���� ���ͷ� ó��
		// 		   "+"�����ڴµ� ���ڿ��� ���ս�ų �� ���
		//**��ü�鿡 ���� �������(==)�� �ּҰ��� ���ϸ�
		//	����񱳴� .equals()�޼ҵ带 ����ؾ� �Ѵ�.
		
		String name1 = "�̼���";
		String name2 = "�̼���";
		
		String name3 = new String("�̼���");
		String name4 = new String("�̼���");
		
		System.out.println(name1==name2);
		System.out.println(name3==name4);
		
		System.out.println(name1);
		
		Person p1 = new Person("�̼���");
		System.out.println("p1="+p1);
	}
}


class Person {
	String name;
	
	Person(String name) {
		this.name=name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
