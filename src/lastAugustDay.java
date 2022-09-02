import OOP.Account;
import OOP.Time;

public class lastAugustDay {
    public static void main(String[] arg){
//        Account account = new Account(40);
//        account.deposit(20);
//        account.withdraw(20);
//        account.getBalance();
//
//        Account account1 = new Account();
//        account1.getBalance();
//
//        account.getBalance();


        Time time = new Time(44);
        Time time2 = new Time(56, 57);
        Time time3 = new Time(3,58, 57);

        time3.getTime();
        time3.setSeconds(4);
        time3.setMinutes(4);
        time3.setHour(6);
        time3.getTime();

        time2.getTime();
        time2.setMinutes(45);
        time2.setHour(24);
        time2.getTime();

        time.getTime();
        time.setHour(24);
        time.getTime();
    }
}
