package learningHeadFirstJava.learningGUI;
////////////////////////
// TITLE: SimpleGuiTwoButton
// AUTHOR: russell lego
// DATE: 2019-04-22
// PURPOSE: To build on the SimpleGuiOneButton and now have 2 buttons doing two different things
////////////////////////

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGuiTwoButton {
    JFrame frame;
    Button button1;
    Button button2;
    Label label;
    DrawRandomGradientCirclePanel panel;
    String beforeClick = "This is my Label";
    String afterClick = "My button's been clicked";

    public static void main(String[] args) {
        SimpleGuiTwoButton myGui = new SimpleGuiTwoButton();
        myGui.startGui();
    }

    private void startGui() {

        frame = new JFrame();
        // creating the components
        button1 = new Button("Click Me to Change Color");
        button2 = new Button("Click Me to Change Label");
        label = new Label("This is my Label");
        panel = new DrawRandomGradientCirclePanel();

        // registering the listeners to the event source
        button1.addActionListener(new ColorListener() );
        button2.addActionListener(new LabelListener() );



        //adding the components to their respective regions on the pane.
        frame.getContentPane().add(BorderLayout.SOUTH, button1);
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.getContentPane().add(BorderLayout.EAST, button2);
        frame.getContentPane().add(BorderLayout.WEST, label);


        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(1600, 900);
        frame.setVisible(true);

    }

    public class ColorListener implements ActionListener {
        public void actionPerformed(ActionEvent actionEvent) {
            frame.repaint();

        }
    }

    public class LabelListener implements ActionListener {
        public void actionPerformed(ActionEvent actionEvent) {
            if (label.getText().equals(beforeClick) ) {
                label.setText(afterClick);
            }
            else {
                label.setText(beforeClick);
            }



        }
    }



}
