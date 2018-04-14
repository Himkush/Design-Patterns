package in.himkush;

public class BankAccountFacade {

    private int accountNumber;

    private int securityCode;

    AccountNumberCheck acctCheck;
    SecurityCodeCheck codeChecker;
    FundCheck fundChecker;

    WelcomeToBank bankWelcome;

    public BankAccountFacade(int bankAccountNumber, int newSecCode){

        accountNumber = bankAccountNumber;
        securityCode = newSecCode;

        bankWelcome  = new WelcomeToBank();
        acctCheck = new AccountNumberCheck();
        codeChecker = new SecurityCodeCheck();
        fundChecker = new FundCheck();



    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public int getSecurityCode(){
        return securityCode;
    }

    public void withDrawCash(double cashToget){

        if (acctCheck.accountActive(getAccountNumber()) && codeChecker.isCodeCorrect(getSecurityCode())
                && fundChecker.haveEnoughMoney(cashToget)) {
            System.out.println("Transaction Complete \n");


        }
        else {
            System.out.println("Transaction Failed \n");
        }
    }

    public void depositCash(double cashToDeposit){
        if (acctCheck.accountActive(getAccountNumber()) && codeChecker.isCodeCorrect(getSecurityCode())) {
            fundChecker.makeDeposit(cashToDeposit);
            System.out.println("Transaction Complete \n");
        }
        else {
            System.out.println("Transaction Failed \n");



        }

    }
}
