package singleton;

public class Main {
    public static void main(String[] args) {
        SingletonLogger logger = SingletonLogger.getInstance();
        logger.createLog("String", "This is data");
    }
}
