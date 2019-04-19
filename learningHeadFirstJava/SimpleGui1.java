import javax.swing.*;


public class SimpleGui1 {

    public static void main(String[] args) {
        JFrame frame  = new JFrame();


        JButton button = new JButton("Please Click Me");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        frame.setSize(1600, 900);
        frame.setVisible(true);


    }

}