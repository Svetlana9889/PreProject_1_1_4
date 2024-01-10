package jm.task.core.jdbc.util;

import java.sql.*;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/userdb";
    private static final String USERNAME = "root1";
    private static final String PASSWORD = "root";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static Connection connection;
    public static Statement statement;
    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);
//            DriverManager.deregisterDriver(DRIVER);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            statement = connection.createStatement();
            return connection;
//            if (!connection.isClosed()) {
//                System.out.println("Соединение установлено!");
//            }
//            connection.close();
//            if (connection.isClosed()) {
//                System.out.println("Соединение закрыто!");
//            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

}
