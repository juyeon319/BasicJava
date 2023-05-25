package chap06.sec01;

//�Ա�(deposit), ���(withdraw), �ܰ�Ȯ��(getbalance)�� �����ϴ� 
//����Ŭ����(Account)�� �����Ͻÿ�.
public class Account {
	private String accountOwner;
	private int balance;
	
	Account() {}
	Account(String accointOwner) {
		this.accountOwner = accointOwner;
		balance = 0;
	}
	
	public void deposit(int amount) {
		balance+= amount;
	}
	
	public int withdraw(int amount) {
		if(balance<amount) {
			System.out.println("�ܰ� �����մϴ�.");
			amount = 0;
		}else {
			balance-= amount;
		}
		return amount;
	}
	
	public int getBalance() {
		return balance;
	}
	public String getAccountOwner() {
		return accountOwner;
	}
}
