package learningHeadFirstJava;////////////////////////
// TITLE: DrawImagePanel
// AUTHOR: russell lego
// DATE: 2019-04-22
// PURPOSE: to override the paintComponent method to make the graphivs out an image up on the screen
////////////////////////

import javax.swing.*;
import java.awt.*;

public class DrawImagePanel extends JPanel {

    public void paintComponent(Graphics g) {
        g.setColor(Color.orange);
        g.fillRect(20, 50, 100, 100);
    }


}
