/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoplanilla;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Walter Morales
 */
public class TestConnection {
    
    public static void main(String[] args) {
        try {
            Connection connection = DatabaseConnection.getConnection();
            if (connection != null) {
                System.out.println("Conexión exitosa a la base de datos Oracle.");
            } else {
                System.out.println("Fallo en la conexión a la base de datos Oracle.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    
}
    
}
