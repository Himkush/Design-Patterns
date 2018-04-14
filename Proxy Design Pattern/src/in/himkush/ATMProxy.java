package in.himkush;

public class ATMProxy implements GetAtmData {
    @Override
    public ATMState getAtmData() {
        ATMMachine realATMMachine = new ATMMachine();

        return realATMMachine.getAtmData();
    }

    @Override
    public int getCashInMachine() {

        ATMMachine realATMMachine = new ATMMachine();

        return realATMMachine.getCashInMachine();
    }
}
