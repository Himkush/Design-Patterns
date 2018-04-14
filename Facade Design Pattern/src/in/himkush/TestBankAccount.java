package in.himkush;

public class TestBankAccount {

    public static void main(String[] args) {

        BankAccountFacade acessingBank = new BankAccountFacade(12345678, 1234);

        acessingBank.withDrawCash(500);

        acessingBank.withDrawCash(100);

        acessingBank.depositCash(25000);

    }
}
