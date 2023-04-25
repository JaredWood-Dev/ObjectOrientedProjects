package Assignments.GUIDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main
{
    public static void main(String[] args)
    {
        //Creates a frame (window?)
        JFrame jf = new JFrame("My Frame");
        //Sets the frame visible
        jf.setVisible(true);
        //Ends the program if the X button is pressed
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Set the dimensions
        jf.setSize(new Dimension(800,600));
        //Change the background color
        jf.setBackground(Color.ORANGE);

        //Creating a button
        JButton jb = new JButton("Click");
        //Get the Content Pane, store it in a variable, then add the button to the pane
        Container content = jf.getContentPane();
        content.add(jb);
        //Tell the button to do something
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Pressed!");
            }
        });

        System.out.println("Hello World");
    }

    public void buttonPress()
    {

    }
}
