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
public class Digraph {
    private double meanLatency;
    private double sumOfLatency;
    private double sumOfSquareOfLatency;
    private double deviation;
    
    public Digraph(double meanLatency,double sumOfLatency,double sumOfSquareOfLatency,double deviation){
        this.meanLatency= meanLatency;
        this.sumOfLatency=sumOfLatency;
        this.sumOfSquareOfLatency=sumOfSquareOfLatency;
        this.deviation=deviation;
    }

    public double getMeanLatency() {
        return meanLatency;
    }

    public double getSumOfLatency() {
        return sumOfLatency;
    }

    public double getSumOfSquareOfLatency() {
        return sumOfSquareOfLatency;
    }

    public double getDeviation() {
        return deviation;
    }

    public void setMeanLatency(double meanLatency) {
        this.meanLatency = meanLatency;
    }

    public void setSumOfLatency(double sum_of_Latency) {
        this.sumOfLatency = sumOfLatency;
    }

    public void setSumOfSquareOfLatency(double sum_of_Square_of_Latency) {
        this.sumOfSquareOfLatency = sumOfSquareOfLatency;
    }

    public void setDeviation(double deviation) {
        this.deviation = deviation;
    }

    
    
}
