package chap06.sec01;

public class StudentEx {

	public static void main(String[] args) {
//		Student s1 = new Student();
//		s1.setStdID(1001);
//		s1.setStdName("�̼���");
//		
//		s1.showInfor();
//		System.out.println(s1);
		
		Student s2 = new Student(1002, "ȫ���");
		System.out.println(s2);
	}
}

class Student {
	private long stuID;
	private String stdName;
	
	//������ �޼��� (default ������)
	public Student() {}
	public Student(long stuID, String stdName) {
		this.stuID=stuID;
		this.stdName=stdName;
	}
	
	public void setStdID(long stdID) {
		this.stuID=stdID;
	}
	
	public void setStdName(String stdName) {
		this.stdName=stdName;
	}
	
	public void showInfor() {
		System.out.println("�й� : " + stuID);
		System.out.println("�̸�: " + stdName);
	}
	
	//������
	@Override
	public String toString() {
		return "�й� : " + stuID + "\n�̸� : " + stdName;
	}
}