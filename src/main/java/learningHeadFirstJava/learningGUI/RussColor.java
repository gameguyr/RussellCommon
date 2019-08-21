////////////////////////
// TITLE: RussColor
// AUTHOR: lego
// DATE: 2019-08-20
// PURPOSE: This is to hold all of the function that I have been making that
// have to do with making colors
////////////////////////
package learningHeadFirstJava.learningGUI;

import java.awt.*;

public class RussColor {
    Color getRandomColor() {
        int redValue = (int) (Math.random() * 256);
        int greenValue = (int) (Math.random() * 256);
        int blueValue = (int) (Math.random() * 256);

        Color randomColor = new Color(redValue, greenValue, blueValue);

        return randomColor;
    }
}
