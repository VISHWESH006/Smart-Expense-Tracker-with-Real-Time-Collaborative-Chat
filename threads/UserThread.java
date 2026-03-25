package threads;

import chat.ChatRoom;
import model.Message;
import model.User;

public class UserThread extends Thread {
    private final User user;
    private final ChatRoom chatRoom;
    private final int userId;

    public UserThread(User user, ChatRoom chatRoom, int userId) {
        this.user = user;
        this.chatRoom = chatRoom;
        this.userId = userId;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            Message msg = new Message(user.getName(), "Message " + i);
            chatRoom.sendMessage(msg, userId);
        }
    }
}