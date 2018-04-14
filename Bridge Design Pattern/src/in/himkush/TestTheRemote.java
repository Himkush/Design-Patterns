package in.himkush;

public class TestTheRemote {

    public static void main(String[] args) {

        RemoteButton theTV =  new TVRemoteMute(new TVDevice(1,200));
        RemoteButton theTV2 =  new TVRemotePaused(new TVDevice(1,200));

        System.out.println("Test Tv with mute");
        theTV.buttonFivePressed();
        theTV.buttonSixPressed();
        theTV.buttonNinePressed();

        System.out.println("Test Tv with paused");

        theTV2.buttonFivePressed();
        theTV2.buttonSixPressed();
        theTV2.buttonSixPressed();
        theTV2.buttonSixPressed();
        theTV2.buttonNinePressed();
        theTV2.deviceFeedback();


    }
}
