package model;

public class Expense {
    private User payer;
    private double amount;

    public Expense(User payer, double amount) {
        this.payer = payer;
        this.amount = amount;
    }

    public double getAmount() { return amount; }
    public User getPayer() { return payer; }
}