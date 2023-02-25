package adapter;

public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new AdapterJavaToDatabase();
        database.select();
        database.insert();
        database.update();
        database.delete();
    }
}
