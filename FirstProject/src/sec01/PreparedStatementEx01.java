package sec01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//���� query��ɾ� ��ü
// => �ڹ��� ����ð��� �ʿ��� �����͸� �Է¹޾� ���� ����
// 1) ������ �Ҵ�� �� ��� ?�� ����Ͽ� ���� ����
// 	ex) tbl_member�� �ű� ȸ���� ���
// 	SQL='INSERT INTO TBL_MEMBER VALUES(?,?,?,?,?)
// 2) query�� ?�� �����ϴ� ������ mapping(setter�޼��� : set������Ÿ��)
// 	��ɾü����.set������Ÿ��(?����, ��)
// 	ex) PreparedStatement ps=conn.preparedStatement(sql);
// 	ps.setString(1,"a002") => mem_id
//	ps.setString(2,"09876") => mem_pass
//	ps.setString(3, "������") => mem_name
//	ps.setString(4, "951230-1234567") => mem_jumin
//	ps.setInt(5, 1000) => mem_mileage
// 3) ���� ����
//  . select �� : excuteQuery()
//	. �� �̿���  query : exceteUpdate()
// 4) ������
// 	. select �� : ResultSet ��ü�� ����
// 	ex) ResuitSet rs=excuteQuery();
//		while(rs.next()){
//			String mid=rs.getString("MEM_ID");
//							:
//			int mileage=rs.getInt("MEM_MILEAGE");
//			}
// 	. �� �̿��� query : Ŀ��(������ ������� ��(row)�� ����)�� ���� ��(����) 
public class PreparedStatementEx01 {
	private Scanner sc = new Scanner(System.in);

	private String url="jdbc:oracle:thin:@localhost:1521:xe";
	private String user="pc06";
	private String passwd="java";

	private Connection conn=null;
	private PreparedStatement pstmt=null;
	private ResultSet rs=null;
	private int rowCount=0;
	
	public static void main(String[] args) {
		String 	sql=" INSERT INTO TBL_MEMBER VALUES(?,?,?,?,?) ";
		int result=new PreparedStatementEx01().insert(sql);
		if(result!=0) {
			System.out.println("�ڷᰡ ���������� ����Ǿ����ϴ�. ");
		} else {
			System.out.println("�ڷᰡ ��������ʾҽ��ϴ�. ");
		}
	}
	
	 public int insert(String sql) {
		 List<Object> param=new ArrayList<Object>();
		 System.out.print("ȸ�� ���̵� : ");
		 String mid=sc.nextLine();
		 param.add(mid);
		 
		 
		 System.out.print("ȸ���� : ");
		 String mname=sc.nextLine();
		 
		 System.out.print("��й�ȣ : ");
		 String pw=sc.nextLine();
		 
		 System.out.print("�ֹε�Ϲ�ȣ : ");
		 String jumin=sc.nextLine();
		 
		 System.out.print("���ϸ��� : ");
		 int mileage=Integer.parseInt(sc.nextLine());
		 
		 try {
			conn=DriverManager.getConnection(url, user, passwd);
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, mid);
			pstmt.setString(2, pw);
			pstmt.setString(3, mname);
			pstmt.setString(4, jumin);
			pstmt.setInt(5, mileage);
			
			rowCount=pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs!=null)  try {rs.close();} catch (Exception e) {}
			if(pstmt!=null)  try {pstmt.close();} catch (Exception e) {}
			if(conn!=null)  try {conn.close();} catch (Exception e) {}
		}
		 return rowCount;
	 }
}
