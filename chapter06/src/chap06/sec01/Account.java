package chap06.sec01;

//입금(deposit), 출금(withdraw), 잔고확인(getbalance)을 수행하는 
//계좌클래스(Account)를 생성하시오.
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
			System.out.println("잔고가 부족합니다.");
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
