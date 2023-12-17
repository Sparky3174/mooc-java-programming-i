/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 16784
 */
public class PaymentCard {

    private double balance;

    public PaymentCard(double initialBalance) {
        this.balance = initialBalance;
    }

    public void eatAffordably() {
        if (this.balance - 2.60 >= 0) {
            this.balance -= 2.60;
        } else {

        }
    }

    public void eatHeartily() {
        if (this.balance - 4.60 >= 0) {
            this.balance -= 4.60;
        } else {

        }
    }

    public void addMoney(double amount) {
        if (amount > 0) {
            if (amount + this.balance > 150) {
                this.balance = 150;
            } else {
                this.balance += amount;
            }
        }

    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }

}
