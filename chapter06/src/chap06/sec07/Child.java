package chap06.sec07;

//���
public class Child extends Parent{
	String gender;
	int age = 25;
	
	Child() {
		//super();
	}
	
	Child(String gender, String name, int age) {
		super(name, age); //�θ� Ŭ������ ȣ���� ��
		this.gender=gender;
 	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return super.age; //super�� ���̸� �θ� Ŭ���� ���� ��ȯ
	}
}
