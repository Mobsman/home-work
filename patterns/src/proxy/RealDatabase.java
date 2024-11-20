package proxy;

public class RealDatabase implements Database{

    private String databaseName;

    public RealDatabase(String databaseName) {
        this.databaseName = databaseName;
    }

    @Override
    public void connect() {
        System.out.println("Connected to " + databaseName);
    }
}
