package chap11.sec01;

//StringBuffer, StringBuilder : String Ŭ������ ����(immutable)�� ������ Ŭ����
//append() �޼��带 �̿��Ͽ� ����� ���ڿ� ���� ���ο� ���ڿ� �߰� ����
//���� �� toString()�� �̿��Ͽ� ���ڿ�(String) Ÿ������ ��ȯ

public class StringBufferEx {
	
	public static void main(String[] args) {
		 StringBuffer sb = new StringBuffer();
		 StringBuffer sb1 = new StringBuffer("select * from member where mem_id = ? ");
		 sb.append("select * \n ");
		 sb.append("   from member \n ");
		 sb.append(" where mem_id = ? ");
		 
		 String str = sb.toString();
		 System.out.println(str);
	}
}
