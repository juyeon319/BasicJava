package chap06.sec08;

public class DaoEx {

	public static void main(String[] args) {
		doWork(new OracleDao());
		//doWork(new MySqlDao());
	} 
	 
	public static void doWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
}
