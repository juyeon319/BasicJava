package chap06.sec01;

//����4) ��ǰ��ȣ, ��ǰ��, ����ȸ��, ���� ������ �������ְ� ��ǰ������ ����� �� �ִ�
//��ǰ Ŭ����(Products)�� �����Ͻÿ�.
public class Products {

	String prodno;
	String prodname;
	String prodmaker;
	String prodprice;
	
	public void proddata() {
		System.out.println("��ǰ��ȣ : " + prodno);
		System.out.println("��ǰ�� : " + prodname);
		System.out.println("������ : " + prodmaker);
		System.out.println("���� : " + prodprice);
	}
}
