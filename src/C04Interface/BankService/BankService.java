package C04Interface.BankService;

public interface BankService {
    public void deposit(Long money, BankAccount ba);

    public boolean withdraw(Long money, BankAccount ba);
}
