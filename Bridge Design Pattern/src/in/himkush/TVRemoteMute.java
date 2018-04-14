package in.himkush;

public class TVRemoteMute extends RemoteButton {

    public TVRemoteMute(EntertaintmentDevice newDevice) {
        super(newDevice);
    }

    @Override
    public void buttonNinePressed() {
        System.out.println("TV was Muted!");

    }
}
