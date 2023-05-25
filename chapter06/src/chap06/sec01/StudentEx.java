package chap06.sec01;

public class StudentEx {

	public static void main(String[] args) {
//		Student s1 = new Student();
//		s1.setStdID(1001);
//		s1.setStdName("이순신");
//		
//		s1.showInfor();
//		System.out.println(s1);
		
		Student s2 = new Student(1002, "홍길순");
		System.out.println(s2);
	}
}

class Student {
	private long stuID;
	private String stdName;
	
	//생성자 메서드 (default 생성자)
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
		System.out.println("학번 : " + stuID);
		System.out.println("이름: " + stdName);
	}
	
	//재정의
	@Override
	public String toString() {
		return "학번 : " + stuID + "\n이름 : " + stdName;
	}
}