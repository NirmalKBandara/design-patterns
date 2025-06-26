public class Main {
    public static void main(String []args){
        DataBase dataBase01 = DataBase.getInstance("SQL");
        dataBase01.getDataBaseName();

        // This is useless. But doing so don't get an error
        DataBase dataBase02 = DataBase.getInstance("MongoDB");
        dataBase02.getDataBaseName();
        // This should also print SQL
        // Since there is only one dataBase
    }
}
