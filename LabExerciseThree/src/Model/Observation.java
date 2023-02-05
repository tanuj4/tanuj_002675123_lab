/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author tanujkodali
 */
public class Observation {
    int observationId;
    private double bloodPressure;
    private double temperature;
    
    public Observation(){
        
        
    }

    public int getObservationId() {
        return observationId;
    }

    public void setObservationId(int observationId) {
        this.observationId = observationId;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    
    @Override
    
    public String toString(){
        return String.valueOf(this.observationId);
    }
    
}
