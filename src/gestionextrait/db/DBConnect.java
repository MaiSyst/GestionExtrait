/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionextrait.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author orion90
 */
public class DBConnect {
    private static Connection connection = null;

    public static Connection getInstance() {
        if (connection == null) {
            try {
                String url="jdbc:mysql://localhost:3306/mairiedb1";
                String user="root";
                String password="Newstreet98@zolki";
                connection = DriverManager.getConnection(url, user, password);
            } catch (SQLException e) {
                Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return connection;
    }
    
}
