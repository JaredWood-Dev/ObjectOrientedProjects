package Assignments.Chatter;

import java.awt.*;

public class Main
{
    public static void main(String[] args)
    {
        Server serverA = new Server();
        User Garf = new User("Garf", new Color(10, 111, 173));
        serverA.addUser(Garf);
        User Kai = new User("Kai", new Color(217, 13, 13));
        serverA.addUser(Kai);
        User Winter = new User("Winter", new Color(143, 143, 143));
        serverA.addUser(Winter);
        User Coal = new User("Coal", new Color(0, 0, 0));
        serverA.addUser(Coal);

        //Two chats happening simultaneously
        Server serverB = new Server();
        User Houston = new User("Houston", new Color(46, 13, 138));
        serverB.addUser(Houston);
        //Read User is a read only; they cannot send messages bat can receive them
        IUser Blorb = new ReadUser("Blorb", new Color(98, 93, 246));
        serverB.addUser(Blorb);

        //Server.displayUsers();
    }
}
