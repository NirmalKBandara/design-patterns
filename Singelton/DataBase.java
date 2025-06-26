public class DataBase {
    // Static instance of the class
    private static DataBase instance;
    private final String dataBaseName;

    // Private constructor to prevent instantiation
    private DataBase(String dataBaseName) {
        this.dataBaseName = dataBaseName;
        System.out.println("Database '" + dataBaseName + "' initialized.");
    }

    // Static method to get the single instance
    public static DataBase getInstance(String dataBaseName) {
        if (instance == null) {
            instance = new DataBase(dataBaseName);
        }
        return instance;
    }
    public void getDataBaseName() {
        System.out.println(dataBaseName);
    }
}