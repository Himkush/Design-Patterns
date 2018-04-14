package in.himkush;

public class NoCard implements ATMState {

    ATMMachine atmMachine;

    public NoCard(ATMMachine atmMachine){
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Please Enter a PIN!");
        atmMachine.setAtmState(atmMachine.getYesCardState());

    }

    @Override
    public void ejectCard() {
        System.out.println("Enter a card first! ");


    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("Enter a card First");
    }

    @Override
    public void requestCash(int cashToWithDraw) {
        System.out.println("Enter a card First");

    }
}
