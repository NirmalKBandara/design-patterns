import java.util.ArrayList;

public class Folder implements FileSystemComponents {
    private String name;
    private ArrayList<File> folder = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }
    public void addFiles(File file) {
        folder.add(file);
    }
    @Override
    public void showDetails() {
        System.out.println("Folder name: " + name);
        for (File file : folder) {
            System.out.print("    ");
            file.showDetails();
        }
    }
}
