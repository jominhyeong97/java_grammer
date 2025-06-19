package C02ClassBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

public class C09BankService {
    public static void main(String[] args) throws IOException {

        //        계좌개설 및 입출금 서비스 : id(auto_increment),name(String), accountNumber(String), balance(long).
//        주의사항1 : main메서드에서 입출력 처리를 하고, deposit, withdraw, transfer 메서드는 BankAccount클래스에 생성.
//        주의사항2 : 프로그램은 항상 실행될수 있도록 전체코드를 while(true)처리
//        서비스번호를 입력하세요. 1.개설 2.조회 3.입금 4.출금 5.송금
//        1.계좌개설 : 계좌번호와 현재가지고 계신돈을 입력하세요. -> 자동으로 id값 증가되어 세팅
//        2.계좌조회 : 계좌조회서비스입니다. 계좌번호를 입력해주세요. -> 잔고출력
//        3.입금 : 계좌입금서비스입니다. 계좌번호와 입금금액을 입력해주세요. -> 현재 계좌에 얼마가 있습니다. 출력.
//        4.출금 : 계좌출금서비스입니다. 계좌번호와 출금금액을 입력해주세요.(잔액검증) -> 남은 금액은 얼마입니다(출금이 성공하면). 또는 잔액이 부족합니다. 출력.
//        5.송금 : 송금서비스입니다. 본인의 계좌번호를 입력해주세요. 보내고자 하는 상대방의 계좌번호를 입력해주세요. 송금금액을 입력해주세요.(잔액검증) 실패하면 잔액무족

//        자료구조 : BankAccount객체를 담을 자료구조 선언

//        수정 사항 : 객체메서드를 많이 못만들고 피지컬로 구현.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<BankAccount> acc = new ArrayList<>();
        loop1:
        while (true) {
            System.out.println("원하시는 서비스 번호를 입력하세요.");
            System.out.println("1.개설 2.조회 3.입금 4.출금 5.송금 6.나가기");
            int serviceNum = Integer.parseInt(br.readLine());
            if(serviceNum<1 || serviceNum > 6) {
                System.out.println("유효한 번호를 입력하세요.");
                continue loop1;
            }

             if (serviceNum==1) {

                    System.out.println("1. 계좌 개설 서비스입니다.");
                    System.out.println("성함을 입력해주세요.");
                    String nameInput = br.readLine();
                    System.out.println("계좌번호를 입력해주세요.");
                    String accountInput1 = br.readLine();
                    System.out.println("보유하신 금액을 입력해주세요.");
                    long moneyInput = Long.parseLong(br.readLine());

                    for(int i=0; i<acc.size(); i++) {
                        if(acc.get(i).getAccountNumber().equals(accountInput1)) {
                            System.out.println("이미 존재하는 계좌입니다.");
                            continue loop1;
                        }
                    }

                        acc.add(new BankAccount(nameInput, accountInput1, moneyInput));
                        System.out.println("개설에 성공하였습니다!");


            } else if(serviceNum==2) {

                    System.out.println("2. 계좌 조회 서비스입니다, 계좌번호를 입력해주세요.");
                    String accountInput = br.readLine();
                    boolean found = false;
                    for(int i=0; i<acc.size(); i++) {
                        if(accountInput.equals(acc.get(i).getAccountNumber())) {
                            System.out.println("ID" + acc.get(i).getId() + " / 이름: " + acc.get(i).getName() + " / 잔액 : " + acc.get(i).getBalance());
                            found = true;
                            break;
                        }

                    }
                     if(!found) {
                         System.out.println("유효하지 않은 계좌번호입니다.");
                         continue loop1;
                     }


            }

            else if(serviceNum ==3) {

                 System.out.println("3. 계좌입금서비스입니다.");
                 System.out.println("계좌번호를 입력해주세요.");
                 String accountInput = br.readLine();
                 System.out.println("입금금액을 입력해주세요.");
                 long money = Long.parseLong(br.readLine());
                 boolean found = false;
                    for(int i=0; i<acc.size(); i++) {
                            if(acc.get(i).getAccountNumber().equals(accountInput)) {
                                acc.get(i).addBalance(money);
                                System.out.println("입금이 완료되었습니다.");
                                System.out.println("입금 후 잔액 : " + acc.get(i).getBalance());
                                found = true;
                            }
                    }
                    if(found==false) {
                        System.out.println("존재하지 않는 계좌번호입니다.");
                        continue loop1;
                    }
            }

            else if(serviceNum==4) {

                    System.out.println("4. 계좌출금서비스입니다. 계좌번호와 출금금액을 입력해주세요.");

                    System.out.println("계좌번호를 입력해주세요.");
                    String accountInput = br.readLine();
                    System.out.println("출금금액을 입력해주세요.");
                    long money = Long.parseLong(br.readLine());
                    boolean found = false;

                    for(int i=0; i<acc.size(); i++) {
                        if(accountInput.equals(acc.get(i).getAccountNumber())) {
                            if(acc.get(i).getBalance()>=money) {
                                acc.get(i).minBalance(money);
                                System.out.println("출금후 잔액 : " + acc.get(i).getBalance());
                                found = true;
                            } else {
                                System.out.println("잔액이 부족합니다.");
                                break;
                            }
                        }
                    }
                    if(found==false) {
                        System.out.println("유효하지 않은 계좌번호 입니다.");
                        continue loop1;
                    }

            } else if(serviceNum ==5) {

                    System.out.println("5. 송금 서비스입니다. 본인의 계좌번호를 입력해주세요");
                    String senderAccount = br.readLine();
                    boolean foundSender = false;
                    for(int i =0; i<acc.size(); i++) {
                        if(acc.get(i).getAccountNumber().equals(senderAccount)) {
                            foundSender = true;
                        }
                    }
                    if(!foundSender) {
                        System.out.println("유효하지 않은 계좌번호입니다.");
                        continue loop1;
                    }


                    System.out.println("받을 사람의 계좌번호를 입력해주세요");
                    String receiverAccount = br.readLine();

                 boolean foundReceive = false;
                 for(int i =0; i<acc.size(); i++) {
                     if(acc.get(i).getAccountNumber().equals(receiverAccount)) {
                         foundReceive = true;
                     }
                 }
                 if(!foundReceive) {
                     System.out.println("유효하지 않은 계좌번호입니다.");
                     continue loop1;
                 }

                    System.out.println("보낼 금액을 입력해주세요");
                    long senderBalance = Long.parseLong(br.readLine());

                    for(int i=0; i<acc.size(); i++) {
                        if(acc.get(i).getAccountNumber().equals(senderAccount)) {
                            if (acc.get(i).getBalance() < senderBalance) {
                                System.out.println("잔액이 부족합니다.");
                                continue loop1;
                            } else {
                                acc.get(i).minBalance(senderBalance);
                                System.out.println("송금 성공");
                                System.out.println("거래 후 잔액 : " + acc.get(i).getBalance());
                            }
                        }
                    }

                    for(int i=0; i<acc.size(); i++) { //받는 사람 계좌
                        if(acc.get(i).getAccountNumber().equals(receiverAccount)) {
                            acc.get(i).addBalance(senderBalance);
                        }
                    }
            }
            else if(serviceNum==6) {
                 System.out.println("나가시겠습니까? 1:머무르기 / 2:나가기 ");
                 int isExit = Integer.parseInt(br.readLine());

                 if(isExit==2) {
                     break;
                 } else {
                     continue loop1;
                 }
             }
        }
    }
}

class BankAccount {

    static int autoIncrement = 0;
    private String name;
    private String accountNumber;
    private long balance;
    private int id;

    public BankAccount(String name, String accountNumber, long balance) {

        autoIncrement++;
        this.id = autoIncrement;
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //    getter 생성
//    setter 생성(의도를 명확히 한 메서드를 생성 update..등등)

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public void addBalance(long money) {
        balance += money;
    }

    public void minBalance(long money) {
        balance -= money;
    }

    public void deposit(long money) { //3.입금

    }

    public boolean withdraw(long money) { //4.출금
//        잔고있으면 차감 후 true
//        잔고 없으면 false 리턴
        if(balance<money) {
            return false;
        } else {
            minBalance(money);
            return true;
        }
    }

//    매개변수로 bankaccount 또는 string의 accountnumber 둘다 가능
    public void transfer(BankAccount targetAccount, long money) { //5.송금

    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}