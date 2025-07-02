// This can be further develop if we want.
// And it will not affect the remove class

public class AdvanceRemote extends Remote {
    public AdvanceRemote(Device device) {
        super(device);
    }
    public void mute() {
        System.out.println("...Device Muted...");
        device.setVolume(0);
    }
}
