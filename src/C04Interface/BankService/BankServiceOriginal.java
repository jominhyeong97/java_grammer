package C04Interface.BankService;

public class BankServiceOriginal {

    void deposit(Long money, BankAccount ba) {
//        현재 잔액조회
        long current = ba.getBalance();
//        그 금액과 money와 합산하여 업데이트 밸런스
        System.out.println(current);
        long newBalance = current + money;
        ba.updateBalance(newBalance);



    }
    public boolean withdraw(Long money, BankAccount ba) {
//        현재 잔고조회 && 출금금액과 비교
//        그 금액과 money와 차감하여 업데이트 밸런스
        long current = ba.getBalance();

        if(current<money) {
            return false;
        } else {
            long newBalance = current - money;
            ba.updateBalance(newBalance);
            return true;
        }


    }

}
