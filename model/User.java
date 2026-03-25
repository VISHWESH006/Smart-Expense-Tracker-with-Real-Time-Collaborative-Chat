package model;

public class User {
    private int id;
    private String name;
    private double balance;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0.0;
    }

    public String getName() { return name; }
    public double getBalance() { return balance; }

    public synchronized void updateBalance(double amount) {
        this.balance += amount;
    }
}