package in.himkush;

public class SecurityCodeCheck {

    private int  securityCode = 1234;
    public int getSecurityCode(){
        return securityCode;
    }

    public boolean isCodeCorrect(int checkSecurityCode){
        if(getSecurityCode() == checkSecurityCode){

            return true;
        }

        else{
            return false;
        }
    }
}
