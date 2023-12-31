package Task1;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance("hajrudin");
        logger.log("Hello World");
        logger.logInfo("Hello World");
        logger.logError("Hello World");
        logger.logWarning("Hello World");
    }
}
