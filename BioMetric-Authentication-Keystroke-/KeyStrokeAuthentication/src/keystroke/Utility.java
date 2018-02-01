/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keystroke;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Sithara wanigasooriy
 */
public class Utility {
    
    
    
    public static void createTable(){
        Connection conn = sqliteConnection.dbConnector();
        Statement stat = null;
        try{
            
            stat= conn.createStatement();
            String createTableStatement  = "CREATE TABLE if not exists \"users\" (\"userid\" INTEGER PRIMARY KEY  NOT NULL ,\"userName\" TEXT,\"password\" TEXT,\"meanValues\" VARCHAR,\"deviationValues\" VARCHAR DEFAULT (null) )";
            stat.execute(createTableStatement);
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            
        }
        
        
    }
    
}
