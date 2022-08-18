/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos_Sql;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class MySQLManager {

    Connection con = null;

    public Connection getConexion() {

        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/unah_prog2","root","heysser022");
            System.out.println("Conectado");
        } catch (Exception e) {
            System.out.println("No Conectado");
             JOptionPane.showMessageDialog(null, "Error de conexion"  + e.getMessage());
        }
        return con;
    }

}
