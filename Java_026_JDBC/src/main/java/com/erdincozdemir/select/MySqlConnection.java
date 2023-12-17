package com.erdincozdemir.select;

import java.sql.*;

public class MySqlConnection {
    public static void main(String[] args) throws SQLException, RuntimeException {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try

        //Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/myrealdb",
                "root",
                "He181215"

        );

        statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM person");

        while (resultSet.next()) {
            System.out.println(resultSet.getInt("id") + " " + resultSet.getString("first_name") + " " + resultSet.getString("last_name"));
        }


        finally{
            if (resultSet != null) {
                resultSet.close();
            }
        }


    }


}


