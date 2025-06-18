package C02ClassBasic;

import java.util.ArrayList;
import java.util.List;

public class C08ClassPractice {
    public static void main(String[] args) {

        List<Account> myList = new ArrayList<>();
        Account a1 = new Account("hong1","1234",10000);
        Account a2 = new Account("hong2","4321",20000);

        myList.add(a1);
        myList.add(a2);
        System.out.println(myList.get(0));

    }
}
//객체 선언 및 list에 2개 정도 add
//Account 클래스. 계좌주명(String name), 계좌번호( String accountNumber), 잔고(Long balance),
class Account {

    private String name;
    private String accountNumber;
    private long balance;

    public Account (String name, String accountNumber, long balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public  String getName() {
        return this.name; //왜 this안쓰지
    }
    public  String getAccountNumber() {
        return accountNumber;
    }
    public  long getbalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
    //tostring만들기 : 이름은
}