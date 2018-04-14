package in.himkush;

public abstract class RemoteButton {

    private EntertaintmentDevice device;

    public RemoteButton(EntertaintmentDevice newDevice){
        device = newDevice;
    }

    public void buttonFivePressed(){
        device.buttonFivePressed();
    }

    public void buttonSixPressed(){
        device.buttonSixPressed();
    }

    public void deviceFeedback(){

        device.deviceFeedback();
    }

    public abstract void  buttonNinePressed();
}
