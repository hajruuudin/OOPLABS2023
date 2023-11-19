package org.Task1;

import java.sql.SQLOutput;

public class ClassLogger implements Logger{
    private String name;

    public ClassLogger(String name){
        this.name = name;
    }


    @Override
    public void logMessage(String message) {
        System.out.println(this.name + " - Message: " + message);
    }
}
