package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * Set up connection access to database(postgres was used)
 */

public class DBConnect {
    public void DBC() {
        String query;
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5431/tttdb", "tttdb", "tttdb");
                Scanner sc = new Scanner(System.in)) {
            System.out.println("tttdb=> ");
            query = sc.nextLine();
            Statement statement1 = connection.createStatement();
            statement1.execute(query);
/*
            System.out.println("tttdb=> ");
            query = sc.nextLine();
            Statement statement2 = connection.createStatement();
            statement2.execute(query);
            sc.close();
*/            
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }        
}
