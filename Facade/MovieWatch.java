public class MovieWatch {
    private final DVDPlayer player = new DVDPlayer();
    private final Projector projector = new Projector();
    private final SoundSystem soundSystem = new SoundSystem();
    private final Lights lights = new Lights();
    private boolean moiveStarted = false;
    private boolean moiveEnded = false;

    public void watchMovie() {
        player.turnOn();
        projector.turnOn();
        soundSystem.turnOn();
        lights.turnOff();
        moiveStarted = true;
    }
    public void endMovie(){
        if (!moiveStarted) return;
        player.turnOff();
        projector.turnOff();
        soundSystem.turnOff();
        lights.turnOn();
        moiveEnded = true;
    }
    public void pauseMovie(){
        if (!moiveStarted) return;
        if (moiveEnded) return;
        player.pause();
    }
}