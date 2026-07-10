package oopsdemo2;

/**
 * Author : sirin
 * Date : Jul 7, 2026
 * Time : 4:37:47 PM
 * Email : sirinandini.a@gmail.com
 */

public class AccountDetails extends SavingsBank {

    int withdrawal;
    int deposit;
    int finalBalance;

    public AccountDetails(int accNo,
                          String name,
                          int minBalance,
                          int balance,
                          int withdrawal,
                          int deposit) {

        super(accNo, name, minBalance, balance);

        this.withdrawal = withdrawal;
        this.deposit = deposit;
    }

    @Override
    void display() {

        super.display();

        System.out.println("Deposit        : " + deposit);
        System.out.println("Withdrawal     : " + withdrawal);

        finalBalance = (balance + deposit) - withdrawal;

        System.out.println("Final Balance  : " + finalBalance);
    }
}