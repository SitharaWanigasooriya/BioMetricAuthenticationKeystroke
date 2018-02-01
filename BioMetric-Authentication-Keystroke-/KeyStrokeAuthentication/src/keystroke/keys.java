/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keystroke;

/**
 *
 * @author Sithara wanigasooriy
 */
public class keys {
    private char key;
    private double pressingTime;
    private double releasingTime;
    public keys(char key){
        this.key=key;
    }

    public char getKey() {
        return key;
    }

    public double getPressingTime() {
        return pressingTime;
    }

    public double getReleasingTime() {
        return releasingTime;
    }

    public void setKey(char key) {
        this.key = key;
    }

    public void setPressingTime(double pressingTime) {
        this.pressingTime = pressingTime;
    }

    public void setReleasingTime(double releasingTime) {
        this.releasingTime = releasingTime;
    }
    
}
