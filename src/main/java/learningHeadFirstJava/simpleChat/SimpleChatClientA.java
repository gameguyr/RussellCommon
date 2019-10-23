////////////////////////
// TITLE: SimpleChatClientA
// AUTHOR: lego
// DATE: 2019-10-22
// PURPOSE: 
////////////////////////
package learningHeadFirstJava.simpleChat;

import sun.java2d.pipe.SpanShapeRenderer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class SimpleChatClientA {

    JTextField outgoingMessageText;
    PrintWriter writer;
    Socket socket;

    public static void main(String[] args) {
        SimpleChatClientA simpleChatClientA = new SimpleChatClientA();
        simpleChatClientA.go();
    }


    public void go() {
        // make gui and register a listener with the send button
        // call the setUpNetworking() method


        JFrame frame = new JFrame("Ludicrously Simple Chat Client");
        JPanel panel = new JPanel();
        JButton button = new JButton("Send Message");
        outgoingMessageText = new JTextField(20);

        button.addActionListener(new SendButtonListener());


        panel.add(button);
        panel.add(outgoingMessageText);
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(450, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        setUpNetworking();
    }

    private void setUpNetworking() {
        // make a Socket, then make a PrintWriter
        // assign the PrintWriter to writer instance variable
        try {
            socket = new Socket("127.0.0.1", 4242);
            writer = new PrintWriter(socket.getOutputStream());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public class SendButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent ev) {
            // get the text from the text field and
            // send it to the server using the writer (a PrintWriter)
            writer.println(outgoingMessageText.getText());
            writer.flush();
            outgoingMessageText.setText("");
            outgoingMessageText.requestFocus();



        }
    }
}
