package C04Interface.BankService;

public class BankKakaoService implements BankService{
    @Override
    public void deposit(Long money, BankAccount ba) {
        long current = ba.getBalance();
//        그 금액과 money와 합산하여 업데이트 밸런스
        System.out.println(current);
        long newBalance = current + money;
        ba.updateBalance(newBalance);


    }

    @Override
    public boolean withdraw(Long money, BankAccount ba) {
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
