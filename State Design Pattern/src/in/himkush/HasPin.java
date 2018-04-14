package in.himkush;

public class HasPin implements ATMState {

    ATMMachine atmMachine;

    public HasPin(ATMMachine atmMachine){
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
        System.out.println("Already Entered Pin");

    }

    @Override
    public void requestCash(int cashToWithDraw) {
        if (cashToWithDraw > atmMachine.cashInMachine){
            System.out.println("Don't have enough cash");
            System.out.println("Card Ejected");
            atmMachine.setAtmState(atmMachine.getNoCardState());
        }
        else{
            System.out.println(cashToWithDraw +" is provided by machine");
            atmMachine.setCashInMachine(atmMachine.cashInMachine - cashToWithDraw);
            System.out.println("Card Ejected");
            atmMachine.setAtmState(atmMachine.getNoCardState());
            if (atmMachine.cashInMachine<= 0){
                atmMachine.setAtmState(atmMachine.getNoCashState());
            }

        }

    }
}
