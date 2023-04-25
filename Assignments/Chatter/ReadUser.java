package Assignments.Chatter;

import javax.swing.*;
import java.awt.*;

public class ReadUser implements IUser
{

    String userName = "";
    Server userServer;
    Color userColor = null;
    public JTextArea log;
    private int windowWidth = 300;

    ReadUser(String name, Color color)
    {
        userName = name;
        userColor = color;

        setUpFrame();
    }
    @Override
    public void showMessage(String message) {
        log.setText(message);
    }

    @Override
    public void setUpFrame() {
        //Create the frame and give it a name
        JFrame jf = new JFrame(userName);

        //Make the frame visible
        jf.setVisible(true);

        //Stops the program on close
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Set the default size of the window
        jf.setSize(new Dimension(windowWidth,400));


        Container content = jf.getContentPane();
        content.setBackground(userColor);
        content.setVisible(true);


        //Configuring the chat log
        log = new JTextArea("");
        log.setEditable(false);
        //log.setSelectedTextColor(userColor);
        log.setSize(new Dimension(windowWidth - 100, 275));
        log.setLocation(20, 10);
        content.add(log);
    }

    @Override
    public String getName() {
        return userName;
    }

    @Override
    public void setServer(Server ser) {
        userServer = ser;
    }


}
