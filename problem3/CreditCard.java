public class CreditCard {
    private Person owner;
    private Money balance;
    private Money creditLimit;

    public CreditCard(Person newCardHolder, Money limit) {
        this.owner = newCardHolder;
        this.creditLimit = new Money(limit);
        this.balance = new Money(0);
    }

    public Money getBalance() {
        return new Money(balance);
    }

    public Money getCreditLimit() {
        return new Money(creditLimit);
    }

    public String custInfo() {
        return owner.toString();
    }

    public void charge(Money amount) {
        Money newbalance = balance.add(amount);
        if (newbalance.compareTo(creditLimit) <= 0) {
            balance = newbalance;
            System.out.println("Charge: " + amount);
        } else {
            System.out.println("Exceeds credit limit");
        }
    }

    public void payment(Money amount) {
        balance = balance.subtract(amount);
        System.out.println("Payment: " + amount);
    }
}

