/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andre
 */
public class Bird {
    private String name;
    private int numberOfObservations;
    private String latinName;
    
    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.numberOfObservations = 0;
    }
    
    public String getName() {
    return name;
}
    
    public void addObservation() {
        this.numberOfObservations++;
    }
    
    public String toString() {
        return name + " (" + latinName + "): " + numberOfObservations + " observations";
    }
    
}
