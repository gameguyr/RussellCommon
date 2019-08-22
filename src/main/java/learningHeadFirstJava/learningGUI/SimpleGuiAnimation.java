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
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class SimpleGuiAnimation {
    int x1_circle_coord = 70;
    int x2_circle_coord = 350;

    int y1_circle_coord = 70;
    int y2_circle_coord = 350;

    int frameWidth;
    int frameHeight;

    DrawRandomGradientCirclePanel panel;

    public SimpleGuiAnimation() {
        Properties properties = new Properties();

        try {
            File file = new File("src/main/resources/dataDirectory/gui_constants.properties");
            FileInputStream fileInputStream = new FileInputStream(file);
            properties.load(fileInputStream);
        }
        catch (FileNotFoundException fileNotFoundException) {
            System.out.println("Could not find the properties file" + fileNotFoundException);
        }
        catch (Exception exception) {
            System.out.println("Could not load properties file" + exception.toString());
        }


        this.frameWidth = Integer.parseInt(properties.getProperty("frameWidth"));
        this.frameHeight = Integer.parseInt(properties.getProperty("frameHeight"));
    }




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
//        frame.setSize(properties.getProperty("frameWidth"), properties.getProperty("frameHeight"));
        frame.setSize(this.frameWidth, this.frameHeight);
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
            x1_circle_coord = x1_circle_coord + 1;
            x2_circle_coord = x2_circle_coord + 1;

            y1_circle_coord = y1_circle_coord + 1;
            y2_circle_coord = y2_circle_coord + 1;

            panel.repaint();

            try {
                Thread.sleep(50);
            } catch (Exception e) {}

        }
    }


    public class DrawRandomGradientCirclePanel extends JPanel {
        RussColor russColor = new RussColor();


        public void paintComponent(Graphics graphics) {
            // casting the graphics object to a graphics2d object so I can use more of the sub-class's methods
            Graphics2D graphics2D = (Graphics2D) graphics;

            Color randomColorOne = russColor.getRandomColor();
            Color randomColorTwo = russColor.getRandomColor();

            GradientPaint gradientPaint = new GradientPaint(x1_circle_coord, y1_circle_coord, randomColorOne, x2_circle_coord, y2_circle_coord, randomColorTwo);

            graphics2D.setPaint(gradientPaint);
            graphics2D.fillOval(x1_circle_coord, y1_circle_coord, x2_circle_coord, y2_circle_coord);
        }
    }



}
