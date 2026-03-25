package chat;

import model.Message;

public class ChatRoom {
    private int turn = 0;

    public synchronized void sendMessage(Message msg, int userId) {
        try {
            while (userId != turn) {
                wait();
            }

            System.out.println(msg.getFormattedMessage());

            turn = (turn == 0) ? 1 : 0;

            notifyAll();

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
    }
}