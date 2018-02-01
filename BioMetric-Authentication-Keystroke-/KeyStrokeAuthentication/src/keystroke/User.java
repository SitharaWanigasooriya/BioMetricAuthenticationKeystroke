/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keystroke;

import java.util.ArrayList;


/**
 *
 * @author Sithara wanigasooriy
 */
public class User {
    private int id;
    private String UserName;
    private String Password;
    private ArrayList<ArrayList<Digraph>> signupAllAttempsData = null;
    
    public User(String UserName, String Password) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.UserName=UserName;
        this.Password=Password;
    }

    public void setSignupAllAttempsData(ArrayList<ArrayList<Digraph>> signupAllAttempsData) {
        this.signupAllAttempsData = signupAllAttempsData;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return UserName;
    }

    public String getPassword() {
        return Password;
    }

    
    
    public ArrayList<ArrayList<Digraph>> getSignupAllAttempsData() {
        return signupAllAttempsData;
    }

    
    
}
