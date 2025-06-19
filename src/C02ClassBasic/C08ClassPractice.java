package C02ClassBasic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C08ClassPractice {
    public static void main(String[] args) {

        List<Account> myList = new ArrayList<>();
        Account a1 = new Account("hong1","1234",100000);
        Account a2 = new Account("hong2","4321",200000);

        myList.add(a1);
        myList.add(a2);
        System.out.println(myList.get(0));

//        계좌번호 조회
        for(Account a : myList) {
            System.out.println(a.getAccountNumber());
        }


//        사용자 1이 사용자2에게 송금(50000)
        for(Account a : myList) {
            if(a.getAccountNumber().equals("1234")) {
                a.setBalance(a.getbalance()-50000);
            }
            if(a.getAccountNumber().equals("4321")) {
                a.setBalance(a.getbalance()+50000);
            }
        }


//        계좌 상세조회 : 계좌번호와 잔고조회
        for(Account a : myList) {
            System.out.println("계좌번호 : " + a.getAccountNumber() + " 잔고 : " + a.getbalance());
        }



//        Map을 자료구조로 사용
        Map<String, Account> accountMap = new HashMap<>();
//        계좌개설
        accountMap.put("1234",new Account("hong1","1234",100000));
        accountMap.put("4321",new Account("hong2","4321",100000));
//        송금
        Account a = accountMap.get("1234");
        Account b = accountMap.get("4321");
        a.setBalance(a.getbalance()-50000);
        b.setBalance(a.getbalance()+50000);

//        계좌조회
        for(String ac : accountMap.keySet()) {
            System.out.println(accountMap.get(ac).getAccountNumber());
        }


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
        return name;
    }
    public  String getAccountNumber() {
        return accountNumber;
    }
    public  long getbalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
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