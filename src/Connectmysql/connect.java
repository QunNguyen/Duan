/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connectmysql;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author default
 */
public class connect {
    public static void main(String[] args) {
        try {
            String url="jdbc:mysql://localhost:3306/java";
            String user="root";
            String pass="quan062001";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c=DriverManager.getConnection(url,user,pass);
            System.out.println("Thanh cong");
        }
        catch (ClassNotFoundException ex)
        {
            System.out.println("That bai");
            Logger.getLogger(connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex) {
            Logger.getLogger(connect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
