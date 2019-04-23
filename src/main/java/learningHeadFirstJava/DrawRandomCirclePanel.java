package learningHeadFirstJava;
////////////////////////
// TITLE: DrawRandomCirclePanel
// AUTHOR: russell lego
// DATE: 2019-04-22
// PURPOSE: to provide a panel that draws a random colored circle
////////////////////////

import javax.swing.*;
import java.awt.*;

public class DrawRandomCirclePanel extends JPanel {

    public void paintComponent(Graphics graphics) {
        graphics.fillRect(0, 0, this.getWidth(), this.getHeight());

        int redValue = (int) (Math.random() * 256);
        int greenValue = (int) (Math.random() * 256);
        int blueValue = (int) (Math.random() * 256);

        Color randomColor = new Color(redValue, greenValue, blueValue);
        graphics.setColor(randomColor);
        graphics.fillOval(70, 70, 100, 100);
//        graphics.setColor(Color.white);
        graphics.fillOval(270, 70, 100, 100);
    }
}
