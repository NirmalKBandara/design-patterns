public class ProxyInternet {
    String name;
    int level;

    public ProxyInternet(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public void accessInternate() {
        if (level >= 3) System.out.println(name+": access Granted.");
        else System.out.println(name+": access Denied.");
    }
}
