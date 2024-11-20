package proxy;

public class DatabaseProxy implements Database {
    private RealDatabase realDatabase;
    private String dbUrl;

    public DatabaseProxy(String url, String name, String host, int port) {
        this.realDatabase = new RealDatabase(name);
        this.dbUrl = url + "//" + host + ":" + port + "/" + name;
    }

    @Override
    public void connect() {
        System.out.println("connecting to URL: " + dbUrl);
        realDatabase.connect();
    }

}
