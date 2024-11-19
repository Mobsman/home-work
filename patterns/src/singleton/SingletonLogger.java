package singleton;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SingletonLogger {

    private static SingletonLogger instance;

    private SingletonLogger() {
    }

    public static SingletonLogger getInstance() {
        if (instance == null) {
            instance = new SingletonLogger();
        }
        return instance;
    }

    public void createLog(Object obj, String info) {

        String className = obj.getClass().getSimpleName();
        String date = new SimpleDateFormat("dd.MM.yy").format(new Date());

        System.out.println("Log info: " + date + " - " + className + " - " + info);
    }

    public static void main(String[] args) {
        SingletonLogger logger = SingletonLogger.getInstance();
        logger.createLog("String", "This is data");
    }
}
