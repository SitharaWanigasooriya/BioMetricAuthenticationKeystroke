/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keystroke;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Sithara wanigasooriy
 */
public class sqliteConnection {
    
    
    private static Connection conn;

    private sqliteConnection() {
        initialConnection();
    }
    
    
    public static Connection dbConnector(){
        if (conn==null){
            new sqliteConnection();
        }
        return conn;
    }
    
    public void initialConnection(){
        try{
            DriverManager.registerDriver(new org.sqlite.JDBC());
            conn = DriverManager.getConnection("jdbc:sqlite:KeyStroke_BioMetricAuthentication.sqlite");
            Utility.createTable();         
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            
        }
    }
    
}
