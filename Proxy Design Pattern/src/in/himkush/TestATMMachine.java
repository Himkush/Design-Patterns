package in.himkush;

public class TestATMMachine {
    public static void main(String[] args) {
        ATMMachine atmMachine =  new ATMMachine();

        atmMachine.insertCard();

        atmMachine.ejectCard();

        atmMachine.insertCard();

        atmMachine.insertPin(1234);

        atmMachine.requestCash(2000);

        atmMachine.insertCard();

        atmMachine.insertPin(1234);

        GetAtmData realATMMachine = new ATMMachine();

        GetAtmData atmProxy = new ATMProxy();

        System.out.println("\nCurrent ATM State : " + atmProxy.getAtmData());

        System.out.println("Cash in ATM Machine " + atmProxy.getCashInMachine());


    }
}
