import model.*;
import service.*;
import chat.*;
import threads.*;

import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        User u1 = new User(1, "Alice");
        User u2 = new User(2, "Bob");

        List<User> users = Arrays.asList(u1, u2);

        ExpenseService expenseService = new ExpenseService(users);
        expenseService.splitExpense(u1, 500);

        System.out.println("=== Expense Summary ===");
        System.out.println(u1.getName() + ": " + u1.getBalance());
        System.out.println(u2.getName() + ": " + u2.getBalance());

        System.out.println("\n=== Chat Simulation Started ===");

        ChatRoom chatRoom = new ChatRoom();

        UserThread t1 = new UserThread(u1, chatRoom, 0);
        UserThread t2 = new UserThread(u2, chatRoom, 1);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}