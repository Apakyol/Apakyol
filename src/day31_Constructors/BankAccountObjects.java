package day31_Constructors;

public class BankAccountObjects {
    public static void main(String[] args) {
BankAccount account1=new BankAccount();
account1.setInfo("Abdulhamid PAKYOL",1231231234);
        System.out.println(account1);
        account1.deposit(10000);
        account1.checkBalance();
        account1.withdraw(9000);
        account1.checkBalance();
        System.out.println("==========================");
        BankAccount account2=new BankAccount();
        account2.setInfo("Mihri PAKYOL",1234123444);
        account2.deposit(10000);
        account2.checkBalance();
        account2.withdraw(1800);
        account2.checkBalance();
    }
}
