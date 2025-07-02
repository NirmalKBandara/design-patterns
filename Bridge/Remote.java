// Not going to develop this one.

public class Remote{
    protected Device device;
    public Remote(Device device) {
        this.device = device;
    }
    public void powerButtonPush() {
        if (device.isOn()){
            device.turnOff();
        }
        else {
            device.turnOn();
        }
    }
    public void setVolume(int volume) {
        device.setVolume(volume);
    }
}
