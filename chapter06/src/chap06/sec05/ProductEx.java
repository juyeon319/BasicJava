package chap06.sec05;

public class ProductEx {

	public static void main(String[] args) {
		Product p1 = new Product("����");
		System.out.println(p1);
		
		Product p2 = new Product("���찳");
		System.out.println(p2);
		
		Product p3 = new Product("����Ʈ��");
		System.out.println(p3);
	}
}

//��ǰ�ڵ�� 1001���� �ڵ������Ǿ� pid�� ����
class Product {
	static long pid=1000;
	String pName;
	
	Product(){}
	//��ǰ�ڵ�� �ڵ������Ǳ� ������ ��ǰ��
	Product(String pName){
		pid++;
		this.pName=pName;
	}
	
	@Override
	public String toString() {
		return "��ǰ��ȣ : " + pid + "\n��ǰ�� : " + pName;
	}
}
