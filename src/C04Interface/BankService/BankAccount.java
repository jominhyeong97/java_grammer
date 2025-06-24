package C04Interface.BankService;

public class BankAccount {
    private String accountNumber;
    private  Long balance;

    public BankAccount(String accountNumber, Long balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Long getBalance() {
        return balance;
    }
//최종 금액을 통해 update : 아래 매서드를 입/출금 모두에 활용

//    클래스의 역할 : controller(사용자와 인터페이스), Service(핵심로직처리) 계층
    public void updateBalance(Long balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
