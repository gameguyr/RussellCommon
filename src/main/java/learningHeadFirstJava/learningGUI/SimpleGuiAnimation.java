package learningHeadFirstJava.learningGUI;
////////////////////////
// TITLE: SimpleGuiAnimation
// AUTHOR: russell lego
// DATE: 2019-04-22
// PURPOSE: to get a circle to move across the screen
// for some reason I could not get the button to work.
// The animation works fine without the button listener
// but If I make a button that does the same thing paintCircle,
// it doesn't animate
////////////////////////

import javax.swing.*;
import java.awt.*;

public class SimpleGuiAnimation {
    int x_position = 70;
    int y_position = 70;

    DrawRandomGradientCirclePanel panel;

    public static void main(String[] args) {
        SimpleGuiAnimation myGui = new SimpleGuiAnimation();
        myGui.startGui();
    }

    private void startGui() {

        JFrame frame = new JFrame();
        panel = new DrawRandomGradientCirclePanel();
//        Button button1 = new Button("Click me watch the circle go!");

//        button1.addActionListener(new ButtonListener() );


//        frame.getContentPane().add(BorderLayout.SOUTH, button1);
        frame.getContentPane().add(BorderLayout.CENTER, panel);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(900, 400);
        frame.setVisible(true);


        paintCircle();

    }

//    public class ButtonListener implements ActionListener {
//        @Override
//        public void actionPerformed(ActionEvent actionEvent) {
//            paintCircle();
//        }
//    }

    public void paintCircle() {
        for (int i=0; i<130; i++) {
            x_position = x_position + 1;
            y_position = y_position + 1;
            panel.repaint();

            try {
                Thread.sleep(50);
            } catch (Exception e) {}

        }
    }


    public class DrawRandomColoredCirclePanel extends JPanel {

        public void paintComponent(Graphics graphics) {
            graphics.fillRect(0, 0, this.getWidth(), this.getHeight());

            int redValue = (int) (Math.random() * 256);
            int greenValue = (int) (Math.random() * 256);
            int blueValue = (int) (Math.random() * 256);

            Color randomColor = new Color(redValue, greenValue, blueValue);
            graphics.setColor(randomColor);
            graphics.fillOval(x_position, y_position, 100, 100);


        }
    }



}
