/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoplanilla;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Walter Morales
 */
public class DatabaseConnection {
    
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String USER = "SYSTEM";
    private static final String PASSWORD = "MANAGER";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    
}
