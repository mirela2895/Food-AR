package pattern;

public class DBConnection {
    private DBConnection() {}

    private static class SingletonHolder {
        private static final DBConnection INSTANCE = new DBConnection();
    }

    public static DBConnection getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
