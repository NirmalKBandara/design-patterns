public class TV implements Device{
    private boolean on = false;
    private int voulme = 40;

    @Override
    public void turnOn() {
        on = true;
        System.out.println("TV is turned on");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println("TV is turned off");
    }

    @Override
    public void setVolume(int volume) {
        this.voulme = volume;
        System.out.println("TV is set to " + this.voulme);
    }

    @Override
    public boolean isOn() {
        return on;
    }
}
