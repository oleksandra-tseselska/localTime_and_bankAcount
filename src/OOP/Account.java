package OOP;

public class Account {
    private double balance;

    public Account(){
        this.balance = 0;
        System.out.println("Balance is "+this.balance);
    }

    public Account(double deposit){
        this.balance = balance + deposit;
        System.out.println("Balance is "+this.balance);
    }

    public void deposit(double deposit){
        this.balance += deposit;
        System.out.println("Balance is "+this.balance);
    }

    public void withdraw(double withdraw){
        if(withdraw > this.balance){
            System.out.println("You don't have enough money");
            return;
        }
        this.balance -= withdraw;
        System.out.println("Balance is "+this.balance);
    }


    public double getBalance(){
        System.out.println("Balance is "+this.balance);
        return this.balance;
    }
}
