package org.example;

import java.sql.*;

public class DbConnect {
    private static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/lab3database";
    private static final String USERNAME = "hajruuudin";
    private static final String PASSWORD = "honeybadger3";


    private Connection connection = null;


    public DbConnect() {
        try {
            connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void getAllTasks() throws SQLException {
        PreparedStatement statement = this
                .connection
                .prepareStatement("SELECT * FROM tasks;");
        ResultSet rs = statement.executeQuery();
        while (rs.next()) { System.out.println(rs.getString("taskId")); System.out.println(rs.getString("taskId"));
        }
    }

    public void getTaskById(int taskId) throws SQLException {
        PreparedStatement statement = this
                .connection
                .prepareStatement("SELECT * FROM customers WHERE taskId = taskId");
        statement.setInt(2, taskId);
        ResultSet rs = statement.executeQuery();
        while (rs.next()) { System.out.println(rs.getString("taskId")); System.out.println(rs.getString("taskId"));
        }
    }
}
