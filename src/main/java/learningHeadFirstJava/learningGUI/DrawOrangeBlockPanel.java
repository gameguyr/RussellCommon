package learningHeadFirstJava.learningGUI;////////////////////////
// TITLE: DrawOrangeBlockPanel
// AUTHOR: russell lego
// DATE: 2019-04-22
// PURPOSE: to override the paintComponent of JPanel to make the graphics draw an orange block.
////////////////////////

import javax.swing.*;
import java.awt.*;

public class DrawOrangeBlockPanel extends JPanel {

    public void paintComponent(Graphics g) {
        g.setColor(Color.orange);
        g.fillRect(20, 50, 100, 100);
    }


}
