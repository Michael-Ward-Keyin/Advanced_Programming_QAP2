public class Money {
    private long dollars;
    private long cents;

    public Money(double amount) {
        this.dollars = (long) amount;
        this.cents = Math.round((amount - this.dollars) * 100.0);
    }

    public Money(Money otherObject) {
        this.dollars = otherObject.dollars;
        this.cents = otherObject.cents; 
    }

    public Money add(Money otherAmount) {
        long newCents = this.cents + otherAmount.cents;
        long newDollars = this.dollars + otherAmount.dollars + newCents / 100;
        newCents %= 100;
        return new Money(newDollars + newCents/ 100.0);
    }

    public Money subtract(Money otherAmount) {
        long totalCents1 = this.dollars * 100 + this.cents;
        long totalCents2 = otherAmount.dollars * 100 + otherAmount.cents;
        long diffCents = totalCents1 - totalCents2;
        return new Money(diffCents /100.0);
    }

    public int compareTo(Money otherObject) {
        if (this.dollars > otherObject.dollars || (this.dollars == otherObject.dollars && this.cents == otherObject.cents)) {
            return 1;
        } else if (this.dollars == otherObject.dollars && this.cents == otherObject.cents) {
            return 0;
        } else {
            return -1;
        }
    }

    public boolean equals(Money otherObject) {
        return this.dollars == otherObject.dollars && this.cents == otherObject.cents;
    }

    public String toString() {
        return "$" + dollars + "." + (cents < 10 ? "0" + cents : cents);
    }
}