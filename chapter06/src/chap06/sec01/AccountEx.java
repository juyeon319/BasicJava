package chap06.sec01;

public class AccountEx {

    public static void main(String[] args) {
        new AccountEx().start();
    }

    public void start() {
        Account account = new Account("ȫ�浿");
        account.deposit(10000);
        printInfo(account);
        int amt = account.withdraw(5000);
        System.out.println("��ݱݾ� : "+amt);
        printInfo(account);
    }
    
    public void printInfo(Account account) {
        System.out.println("������ : "+account.getAccountOwner());
        System.out.println("�ܰ� : "+account.getBalance());
    }
}