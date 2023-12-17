
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        if (this.cents + addition.cents > 99) {
            Money newMoney = new Money(this.euros + addition.euros + (this.cents + addition.cents) / 100, (this.cents + addition.cents) % 100);
            return newMoney;
        } else {
            Money newMoney = new Money(addition.euros + this.euros, addition.cents + this.cents);
            return newMoney;
        }
    }

    public Money minus(Money subtraction) {
        if (this.lessThan(subtraction)) {
            Money newMoney = new Money(0, 0);
            return newMoney;
        }
        if (this.cents - subtraction.cents < 0 && this.euros - subtraction.euros > 0) {
            Money newMoney = new Money(this.euros - subtraction.euros - ((this.cents - subtraction.cents) / -100 + 1), this.cents - subtraction.cents % -100 + 100);
            return newMoney;
        }
        Money newMoney = new Money(this.euros - subtraction.euros, this.cents - subtraction.cents);
        return newMoney;
    }

    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        } else if (this.cents < compared.cents && this.euros <= compared.euros) {
            return true;
        }
        return false;
    }

}
