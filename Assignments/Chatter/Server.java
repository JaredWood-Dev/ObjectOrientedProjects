package Assignments.Chatter;

import java.util.ArrayList;
import java.util.Queue;

public class Server {

    private ArrayList<IUser> users;
    private ArrayList<String> chatLog;
    Server()
    {
        users = new ArrayList<>();
        chatLog = new ArrayList<>();
    }

    void addUser(IUser newUser)
    {
        users.add(newUser);
        newUser.setServer(this);
    }

    void displayUsers()
    {
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i).getName());
        }
    }

    void sendMessage(String msg, String sendingUser)
    {
        if (chatLog.size() > 10)
        {
            for (int i = 0; i < chatLog.size()-1; i++) {
                chatLog.set(i, chatLog.get(i+1));
            }
            chatLog.set(10, sendingUser + ": " + msg);
        }
        else {
            chatLog.add(sendingUser + ": " + msg);
        }
        String log = "";
        for (int i = 0; i < chatLog.size(); i++) {
            log = log + "\n"+ chatLog.get(i);
        }
        for (int i = 0; i < users.size(); i++) {
            users.get(i).showMessage(log);
        }
    }
}
