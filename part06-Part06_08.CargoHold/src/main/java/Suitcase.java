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

public class Suitcase {

    private int maxWeight;
    private ArrayList<Item> items;
    private int totalWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
        this.totalWeight = 0;
    }

    public void addItem(Item item) {
        if (totalWeight + item.getWeight() <= this.maxWeight) {
            this.items.add(item);
            this.totalWeight += item.getWeight();
        }
    }
    
    public void printItems() {
        for (Item item : items) {
            System.out.println(item.toString());
        }
    }
    
    public int totalWeight() {
        return this.totalWeight;
    }
    
    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }
        Item heaviest = items.get(0);
        for (Item item : items) {
            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        } 
        return heaviest;
    }

    public String toString() {
        if (items.isEmpty()) {
            return "no items (0 kg)";
        }
        return items.size() 
                + String.valueOf(this.items.size() > 1 ? " items " : " item ") 
                +"(" 
                + this.totalWeight 
                + " kg)";
    }
}
