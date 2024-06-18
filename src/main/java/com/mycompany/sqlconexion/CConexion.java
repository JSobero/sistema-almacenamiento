/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sqlconexion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author ADVANCE
 */
public class CConexion {

    Connection conectar = null;

    String usuario = "root";
    String contrasena = "root";
    String bd = "INVENTARIPLUS";
    String ip = "localhost";
    String puerto = "1433";
    
    public Connection establecerConexion(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String cadena = "jdbc:sqlserver://"+ip+":"+puerto+";"+"databaseName="+bd+";"+
                            "encrypt=true;trustServerCertificate=true";
            conectar = DriverManager.getConnection(cadena,usuario,contrasena);
            JOptionPane.showMessageDialog(null, "Se conecto correctamente la base de datos");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se conecto correctamente");
        }
        return conectar;
    }
}
