package in.himkush;

public class TVRemotePaused extends RemoteButton {


    public TVRemotePaused(EntertaintmentDevice newDevice) {
        super(newDevice);
    }

    @Override
    public void buttonNinePressed() {
        System.out.println("TV was paused");

    }
}
