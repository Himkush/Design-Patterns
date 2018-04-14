package in.himkush;

public class AccountNumberCheck {

    private int acccountNumber = 12345678;

    public int getAcccountNumber(){
        return acccountNumber;
    }

    public boolean accountActive(int checkAcccountNumber){
        if(getAcccountNumber() == acccountNumber){

            return true;
        }

        else{
            return false;
        }
    }
}
