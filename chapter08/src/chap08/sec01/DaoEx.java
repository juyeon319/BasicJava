package chap08.sec01;

public class DaoEx {
	
	public static void main(String[] args) {
		OracleDao od = new OracleDao();
		MySqlDao msd = new MySqlDao();
		
		od.insert();
		
		//������
		DataAccessObject dao = new OracleDao();
		dao.insert();
	}
}

