package chap06.sec03;

//����1) ������ ����(kind)�� �����ϴ� ��� �ʵ尡 �ִ� ����Ŭ����(Animal)�� �����ϰ�,
//�����ڸ޼��带 ���� ������ ���� ������ ������ ������ ������ �� �ִ� �޼��� �� ������ �����ϴ� �޼��� �ۼ�	

public class Animal {
	//�ܺο��� ������ �� ����
	private String kind;
	
	//�⺻ ������
	Animal(){
		this("ȣ����");
	} 
	
	Animal(String kind){
		this.kind=kind;
	}
	
	public void setKind(String kind) {
		this.kind=kind;
	}
	
	//Ư�� �� �ϳ��� ��ȯ�� ���� : getter
	//���ڿ� ��ü ��ȯ : toString
	public String getkind() {
		return kind;
	}
}
