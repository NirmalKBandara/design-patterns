public class Main {
    public static void main(String[] args) {
        Internet admin01 = (Internet) new ProxyInternet("Nirmal", 2);
        Internet admin02 = (Internet) new ProxyInternet("Kalana", 4);

        admin01.accessInternate();
        admin02.accessInternate();

    }
}