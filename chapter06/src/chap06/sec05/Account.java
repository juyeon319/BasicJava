package chap06.sec05;

public class Account {
	public static Account ac=null; 
	private Account() {}
	
	public static Account getInstance() {
		if (ac==null) ac = new Account();
		return ac;
	}
}
