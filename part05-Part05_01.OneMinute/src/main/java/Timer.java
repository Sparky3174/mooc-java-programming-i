/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andre
 */
public class Timer {

    private ClockHand seconds;
    private ClockHand miliseconds;

    public Timer() {
        this.seconds = new ClockHand(60);
        this.miliseconds = new ClockHand(100);
    }

    public void advance() {
        if (this.miliseconds.value() == 99) {
            this.miliseconds.advance();
            this.seconds.advance();
        } else {
            this.miliseconds.advance();
        }
    }

    public String toString() {
        return this.seconds + ":" + this.miliseconds;
    }

}
