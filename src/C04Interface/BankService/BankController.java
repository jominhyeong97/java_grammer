package C04Interface.BankService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BankController {
    public static void main(String[] args) throws IOException {
        System.out.println("계좌번호를 입력해주세요");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String accountNumber = br.readLine();
        System.out.println("계설 금액");
        Long money1 = Long.parseLong(br.readLine());
        BankAccount ba = new BankAccount(accountNumber, money1);
        System.out.println(ba);



        while (true) {
            System.out.println("입금:1번 출금:2번");

            String serviceNumber = br.readLine();
            if(serviceNumber.equals("1")) {
                System.out.println("입금하실 방법을 입력해주세요 1. 카카오페이 2. 토스페이");
                String pay = br.readLine();

                if(pay.equals("1")) {
                    BankKakaoService bk = new BankKakaoService();
                    System.out.println("입금하실 금액을 입력해주세요");
                    Long money = Long.parseLong(br.readLine());
                    bk.deposit(money, ba);
                    System.out.println("입금이 완료되었습니다.");

                } else if(pay.equals("2")) {
                    BankTossService bt = new BankTossService();
                    System.out.println("입금하실 금액을 입력");
                    Long money = Long.parseLong(br.readLine());
                    bt.deposit(money, ba);
                    System.out.println("입금이완료되었습니다.");


                }


//                서비스 계층이 있다면,
            } else if(serviceNumber.equals("2")) {
                System.out.println("출금하실 금액을 입력해주세요");
                Long money = Long.parseLong(br.readLine());
                System.out.println("출금방법 1.카카오페이 2. 토스페이");
                String pay = br.readLine();
                if(pay.equals("1")) {
                    BankKakaoService bk = new BankKakaoService();
                    if(!bk.withdraw(money,ba)) {
                        System.out.println("잔액이 부족합니다");
                    } else if(bk.withdraw(money,ba)) {
                        System.out.println("출금 성공");
                    }

                }



            }

        }
    }
}
