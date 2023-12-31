package Task1;

public class Logger {
    private static Logger instance;
    private String connectionString;

    private Logger(String connectionString) {
        this.connectionString = connectionString;
    }

    public static Logger getInstance(String connectionString) {
        synchronized (Logger.class) {
            if (instance == null) {
                instance = new Logger(connectionString);
            }
        }
        return instance;
    }

    public void log(String message){
        System.out.println("General message logged!" + message);
    }

    public void logInfo(String message){
        System.out.println("Info message logged!" + message);
    }

    public void logWarning(String message){
        System.out.println("Warning message logged!" + message);
    }

    public void logError(String message){
        System.out.println("Error message logged!" + message);
    }
}
