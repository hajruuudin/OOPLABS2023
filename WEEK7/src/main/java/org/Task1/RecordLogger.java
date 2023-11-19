package org.Task1;

public record RecordLogger(String name) implements Logger{

    @Override
    public void logMessage(String message) {
        System.out.println(this.name + " - Message: " + message);
    }
}
