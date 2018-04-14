package in.himkush;

public class NoCash implements ATMState {

    ATMMachine atmMachine;

    public NoCash(ATMMachine atmMachine){
        this.atmMachine = atmMachine;
    }
    @Override
    public void insertCard() {
        System.out.println("We don't have Money");

    }

    @Override
    public void ejectCard() {
        System.out.println("We don't have Money");


    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("We don't have Money");


    }

    @Override
    public void requestCash(int cashToWithDraw) {
        System.out.println("We don't have Money");


    }
}
