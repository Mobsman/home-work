package proxy;

public class Main {
    public static void main(String[] args) {
        Database dbProxy = new DatabaseProxy("jdbc:postgresql:", "postgres", "localhost", 5432);
        dbProxy.connect();
    }
}
