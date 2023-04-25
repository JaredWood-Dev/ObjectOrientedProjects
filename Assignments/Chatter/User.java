package Assignments.Chatter;

import javax.swing.*;
import javax.swing.plaf.basic.BasicArrowButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class User implements IUser
{
    String userName;
    Color userColor;
    public Server userServer;

    private int windowWidth = 300;

    public JTextArea log;


    User(String name, Color color)
    {
        userName = name;
        userColor = color;

        setUpFrame();
    }

    public void setUpFrame()
    {
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

        //Configuring the textbox
        JTextField userInput = new JTextField();
        userInput.setSize(new Dimension(windowWidth - 100,50));
        userInput.setLocation(20, 300);
        content.add(userInput);

        //Configuring the chat log
        log = new JTextArea("");
        log.setEditable(false);
        //log.setSelectedTextColor(userColor);
        log.setSize(new Dimension(windowWidth - 100, 275));
        log.setLocation(20, 10);
        content.add(log);

        //Configuring the button
        JButton sendButton = new JButton();
        sendButton.setSize(new Dimension(50,50));
        content.setLayout(null);
        sendButton.setText("Send");
        sendButton.setLocation(220,300);
        content.add(sendButton);
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(userName + ": " + userInput.getText());
                //log.setText(userInput.getText());
                userServer.sendMessage(userInput.getText(), userName);
                userInput.setText("");
            }
        });
    }

    public String getName()
    {
        return userName;
    }

    @Override
    public void setServer(Server ser) {
        userServer = ser;
    }

    public void showMessage(String message)
    {
        log.setText(message);
    }
}
