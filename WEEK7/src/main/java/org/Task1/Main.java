package org.Task1;

public class Main {
    public static void main(String[] args) {
        Logger recordLog = new RecordLogger("Davids record logger");
        recordLog.logMessage("Hello this is davids record logger");

        Logger classLog = new ClassLogger("Davids class logger");
        classLog.logMessage("Hello this is davids class logger");
    }
}