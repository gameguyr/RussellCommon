////////////////////////
// TITLE: MiniMusicPlayer3
// AUTHOR: lego
// DATE: 2019-08-28
// PURPOSE: To make a music player app that creates a little music video
////////////////////////
package learningHeadFirstJava.learningGUI;


import javax.sound.midi.*;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class MiniMusicPlayer3 {

    static JFrame frame = new JFrame("My First Music Video");
    static MyDrawPanel myDrawPanel;
    int frameWidth;
    int frameHeight;

    public MiniMusicPlayer3() {
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
        MiniMusicPlayer3 miniMusicPlayer3  = new MiniMusicPlayer3();
        miniMusicPlayer3.go();

    }

    public void go() {
        setUpGui();

        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequencer.addControllerEventListener(myDrawPanel, new int[] {127});
            Sequence sequence = new Sequence(Sequence.PPQ, 4);
            Track track = sequence.createTrack();

            int randomNumber;
            for (int i = 0; i < 60; i = i + 4) {
                randomNumber = (int) (Math.random() * 50 + 1);
                track.add(makeEvent(144, 1, randomNumber, 100, i));
                track.add(makeEvent(176, 1, 127, 0, i));
                track.add(makeEvent(128, 1, randomNumber, 100, i + 2));

            }

            sequencer.setSequence(sequence);
            sequencer.start();
            sequencer.setTempoInBPM(120);


        } catch (Exception exception) {
            System.out.println("failed to start the GUI due to: " + exception.toString());
        }

    }

    public void setUpGui() {
        myDrawPanel = new MyDrawPanel();
        frame.setContentPane(myDrawPanel);
        frame.setBounds(10, 10, frameWidth, frameHeight);
        frame.setVisible(true);

    }

    private static MidiEvent makeEvent(int command, int channel, int data1, int data2, int tick) {
        MidiEvent event = null;
        try {
            ShortMessage shortMessage = new ShortMessage();
            shortMessage.setMessage(command, channel, data1, data2);
            event = new MidiEvent(shortMessage, tick);


        } catch (Exception exception) {
            System.out.println("Failed to make event: " + exception);
        }
        return event;
    }

    public static class MyDrawPanel extends JPanel implements ControllerEventListener {
        boolean message = false;

        RussColor russColor = new RussColor();

        int x1_circle_coord = 70;
        int x2_circle_coord = 350;
        int y1_circle_coord = 70;
        int y2_circle_coord = 350;

        @Override
        public void controlChange(ShortMessage event) {
            message = true;
            frame.repaint();

        }

        @Override
        public void paintComponent(Graphics graphics) {
            if (message) {// casting the graphics object to a graphics2d object so I can use more of the sub-class's methods
                Graphics2D graphics2D = (Graphics2D) graphics;

                Color randomColorOne = russColor.getRandomColor();
                Color randomColorTwo = russColor.getRandomColor();

                GradientPaint gradientPaint = new GradientPaint(this.x1_circle_coord, this.y1_circle_coord, randomColorOne, this.x2_circle_coord, this.y2_circle_coord, randomColorTwo);

                graphics2D.setPaint(gradientPaint);
                graphics2D.fillOval(this.x1_circle_coord, this.y1_circle_coord, this.x2_circle_coord, this.y2_circle_coord);

            }
        }
    }
}
