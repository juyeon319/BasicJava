package chap06.sec01;

public class AccountEx {

    public static void main(String[] args) {
        new AccountEx().start();
    }

    public void start() {
        Account account = new Account("È«±æµ¿");
        account.deposit(10000);
        printInfo(account);
        int amt = account.withdraw(5000);
        System.out.println("Ãâ±Ý±Ý¾× : "+amt);
        printInfo(account);
    }
    
    public void printInfo(Account account) {
        System.out.println("°èÁÂÁÖ : "+account.getAccountOwner());
        System.out.println("ÀÜ°í : "+account.getBalance());
    }
}