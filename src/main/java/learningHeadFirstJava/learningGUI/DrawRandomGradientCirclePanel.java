////////////////////////
// TITLE: DrawRandomGradientCirclePanel
// AUTHOR: lego
// DATE: 2019-08-20
// PURPOSE: to provide a panel that draws a circle with a gradient
////////////////////////
package learningHeadFirstJava.learningGUI;

import javax.swing.*;
import java.awt.*;
//import RussColor;


public class DrawRandomGradientCirclePanel extends JPanel {
    RussColor russColor = new RussColor();
    int x1_circle_coord = 70;
    int x2_circle_coord = 350;

    int y1_circle_coord = 70;
    int y2_circle_coord = 350;

    public void paintComponent(Graphics graphics) {
        // casting the graphics object to a graphics2d object so I can use more of the sub-class's methods
        Graphics2D graphics2D = (Graphics2D) graphics;

        Color randomColorOne = russColor.getRandomColor();
        Color randomColorTwo = russColor.getRandomColor();

        GradientPaint gradientPaint = new GradientPaint(this.x1_circle_coord, this.y1_circle_coord, randomColorOne, this.x2_circle_coord, this.y2_circle_coord, randomColorTwo);

        graphics2D.setPaint(gradientPaint);
        graphics2D.fillOval(this.x1_circle_coord, this.y1_circle_coord, this.x2_circle_coord, this.y2_circle_coord);
    }
}
