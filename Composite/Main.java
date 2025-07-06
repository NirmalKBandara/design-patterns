public class Main {
    public static void main(String[] args) {
        Folder games = new Folder("Games");
        File file01 = new File("Sekiro.exe");
        File file02 = new File("EldenRing.exe");
        File file03 = new File("GTAV.exe");
        games.addFiles(file01);
        games.addFiles(file02);
        games.addFiles(file03);

        games.showDetails();
    }
}