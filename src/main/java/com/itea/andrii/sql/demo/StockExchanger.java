package com.itea.andrii.sql.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StockExchanger {
    public static final String DB_URL = "jdbc:h2:./db/stockExchange";
    public static final String DB_Driver = "org.h2.Driver";

    public static void main(String[] args) {
        try {
            Class.forName(DB_Driver);
            Connection connection = DriverManager.getConnection(DB_URL);
            System.out.println("З'єднання з СУБД виконано");
            connection.close();
            System.out.println("Відключення від СУБД виконано");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("JDBC драйвер для СУБД не знайдено!");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Помилка SQL");
        }
    }
}
