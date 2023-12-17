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

public class Stack {

    private ArrayList<String> strings;

    public Stack() {
        this.strings = new ArrayList();
    }

    public void add(String value) {
        this.strings.add(value);
    }

    public boolean isEmpty() {
        if (this.strings.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<String> values() {
        return this.strings;
    }

    public String take() {
        String taken = this.strings.get(this.strings.size() - 1);
        this.strings.remove(this.strings.size() - 1);
        return taken;
    }
}
