package chap05.sec06;

public class ObjectArrayEx {

	public static void main(String[] args) {
//	Books[] book = new Books[3];
//	book[0] = new Books("���ʺ� ����", "EBS", 15000);
//	book[1] = new Books("���� �Թ���", "����ȣ", 30000);
//	book[2] = new Books("��ũ���׽� ����", "������", 10000);
		
		Books[] book = {new Books("���ʺ� ����", "EBS", 15000),
						new Books("���� �Թ���", "����ȣ", 30000),
						new Books("��ũ���׽� ����", "������", 10000)
							};
	
	System.out.println("-------------------------------------");
	for(Books b : book) {
		System.out.println(b);
		System.out.println("-------------------------------------");
		}
	}
}

class Books {
	private String title;
	private String writer;
	private int price;
	
	public Books() {}
	public Books(String title, String writer, int price) {
		this.title=title;
		this.writer=writer;
		this.price=price;
	} 
	
	//������
	@Override
	public String toString() {
		return "å�̸� : " + title + "\n���� : " + writer + 
				"\n���� : " + price;
	}
}