public class Radio implements Device{
    private boolean on = false;
    private int voulme = 60;

    @Override
    public void turnOn() {
        on = true;
        System.out.println("Radio is turned on");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println("Radio is turned off");
    }

    @Override
    public void setVolume(int volume) {
        this.voulme = volume;
        System.out.println("Radio is set to " + this.voulme);
    }

    @Override
    public boolean isOn() {
        return on;
    }
}
