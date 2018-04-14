package in.himkush;

public class HasCard implements ATMState {

    ATMMachine atmMachine;

    public HasCard(ATMMachine atmMachine){
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("You Can't enter more than one Card");

    }

    @Override
    public void ejectCard() {
        System.out.println("Card Ejected");
        atmMachine.setAtmState(atmMachine.getNoCardState());

    }

    @Override
    public void insertPin(int pinEntered) {
        if(pinEntered==1234){
            System.out.println("Correct Pin");
            atmMachine.correctPinEntered = true;
            atmMachine.setAtmState(atmMachine.getHasPin());
        }
        else{
            System.out.println("Wrong Pin");
            atmMachine.correctPinEntered = false;
            System.out.println("Card Ejected");

        }

    }

    @Override
    public void requestCash(int cashToWithDraw) {

        System.out.println("Enter PIN first");

    }
}
