/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andre
 */
public class Container {

    private int content;
    private String name;

    public Container() {
        this.content = 0;
    }

    public int contains() {
        return this.content;
    }

    public void add(int addAmount) {
        if (addAmount > 0) {
            if (addAmount + content > 100) {
                content = 100;
            } else {
                content += addAmount;
            }
        }
    }

    public void remove(int removeAmount) {
        if (removeAmount > 0) {
            if (content - removeAmount < 0) {
                content = 0;
            } else {
                content -= removeAmount;
            }
        }
    }

    public void move(int moveAmount, Container secondContainer) {
        if (content - moveAmount < 0) {
            secondContainer.add(content);
        } else {
            secondContainer.add(moveAmount);
        }
        this.remove(moveAmount);
    }

    public String toString() {
        return this.content + "/100";
    }
}
