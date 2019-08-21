package learningHeadFirstJava.learningGUI;

import javax.swing.*;
import java.awt.event.*;

public class SimpleGui1B implements ActionListener {
    // here are my instance variables.
    JButton button;



    public static void main(String [] args) {
        SimpleGui1B gui = new SimpleGui1B();
        gui.go();

    }

    public void go() {
        JFrame frame = new JFrame();
        button = new JButton("Please Click Me");

        // this next line tells the button that this class cares about it's actions
        button.addActionListener(this);


        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(1600, 900);
        frame.setVisible(true);
    }


    public void actionPerformed(ActionEvent e) {
        //this is where I will write the code that gets run when the action is performed
        this.button.setText("I have been clicked");
    };
}
