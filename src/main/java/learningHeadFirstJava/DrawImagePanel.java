package learningHeadFirstJava;////////////////////////
// TITLE: DrawImagePanel
// AUTHOR: russell lego
// DATE: 2019-04-22
// PURPOSE: to override the paintComponent method to make the graphics output an image up on the screen
////////////////////////

import javax.swing.*;
import java.awt.*;

public class DrawImagePanel extends JPanel {

    public void paintComponent(Graphics graphics) {
        Image image = new ImageIcon("src/main/resources/imageDirectory/grandma_dj.jpeg").getImage();
        graphics.drawImage(image, 3, 4, 1600, 900,  this);
    }


}
