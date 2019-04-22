package learningHeadFirstJava;////////////////////////
// TITLE: SimpleGui2
// AUTHOR: russell lego
// DATE: 2019-04-22
// PURPOSE: To see how I make my own things pop up on the screen by making my own panel which extends JPanel.
// Then I can override the paintComponent method where I can put my own instructions on what I want painted to the screen.
// The object that I can do this with comes in the PANEL, you can see here that I am adding the panel to my JFrame.
////////////////////////

import javax.swing.*;

public class SimpleGui2 {

    public static void main(String [] args) {
        SimpleGui2 gui = new SimpleGui2();
        gui.go();

    }

    public void go() {
        JFrame frame = new JFrame();
        MyDrawOrangeBlock myDrawOrangeBlock = new MyDrawOrangeBlock();


        frame.getContentPane().add(myDrawOrangeBlock);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(1600, 900);
        frame.setVisible(true);
    }


}
