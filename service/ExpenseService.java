package service;

import java.util.*;
import model.User;

public class ExpenseService {
    private final List<User> users;

    public ExpenseService(List<User> users) {
        this.users = new ArrayList<>(users);
    }

    public void splitExpense(User payer, double amount) {
        double split = amount / users.size();

        for (User user : users) {
            if (user != payer) {
                user.updateBalance(-split);
                payer.updateBalance(split);
            }
        }
    }
}