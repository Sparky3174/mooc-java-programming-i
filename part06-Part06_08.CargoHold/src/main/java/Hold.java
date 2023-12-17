/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andre
 */
import java.util.ArrayList;
public class Hold {
    private int maximumWeight;
    private ArrayList<Suitcase> suitcases;
    private int totalWeight;
    
    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.suitcases = new ArrayList<>();
        this.totalWeight = 0;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight + suitcase.totalWeight() <= maximumWeight) {
            this.suitcases.add(suitcase);
            this.totalWeight += suitcase.totalWeight();
        }
    }
    
    public void printItems() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }
    
    public String toString() {
        return suitcases.size() + "suitcases (" + this.totalWeight + " kg)";
    }
}
