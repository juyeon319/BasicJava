package chap07.sec01;

public class StudentEx {

	public static void main(String[] args) {
		Student s1 = new Student("ȫ�浿", 25, "����", "abc@naver.net");
		
		System.out.println("�л��� : " + s1.name);
		System.out.println("���� : " + s1.age);
		System.out.println("���� : " + s1.gender);
		
		People p2 = new People("������", 30, "����");
	}
}
