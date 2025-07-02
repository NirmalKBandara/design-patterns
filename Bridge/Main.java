public class Main {
    public static void main(String[] args) {

        // Think we want to create a connection between two classes
        // Like one's objects' can be controlled by others objects'
        // Then we must create a Bridge between them.
        // This way we can develop devices and remotes independently.

        Device tv = new TV();
        AdvanceRemote remote01 = new AdvanceRemote(tv);

        remote01.powerButtonPush();
        remote01.setVolume(30);
        remote01.mute();
        remote01.powerButtonPush();

        System.out.println();

        Device radio = new Radio();
        AdvanceRemote remote02 = new AdvanceRemote(radio);

        remote02.powerButtonPush();
        remote02.setVolume(50);
        remote02.mute();
        remote02.powerButtonPush();

    }
}