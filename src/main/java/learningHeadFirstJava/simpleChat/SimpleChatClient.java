////////////////////////
// TITLE: SimpleChatClient
// AUTHOR: lego
// DATE: 2019-10-22
// PURPOSE: 
////////////////////////
package learningHeadFirstJava.simpleChat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SimpleChatClient {
    private JTextArea chatRoomText;
    private JTextArea outMessageText;
    private PrintWriter writer;
    private BufferedReader reader;
    Socket socket;

    public static void main(String[] args) {
        SimpleChatClient simpleChatClient = new SimpleChatClient();
        simpleChatClient.go();
    }

    public void go() {
//        Set up GUI, add button listener
        JFrame frame = new JFrame("Simple Chat Client");
        JPanel panel = new JPanel();
        JButton sendButton = new JButton("SEND");
        JLabel chatRoomLabel = new JLabel("Chat Room");
        JLabel messageLabel = new JLabel("Message");

        Font textFont = new Font(Font.MONOSPACED, Font.ITALIC, 16);

        chatRoomText = new JTextArea(20, 20);
        chatRoomText.setLineWrap(true);
        chatRoomText.setWrapStyleWord(true);
        chatRoomText.setFont(textFont);
        chatRoomText.setEditable(false);

        outMessageText = new JTextArea(2, 17);

        sendButton.addActionListener( new SendButtonListener() );





        JScrollPane chatRoomTextScrollPane = new JScrollPane(chatRoomText);
        chatRoomTextScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        chatRoomTextScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        setUpNetworking();

        Thread thread = new Thread(new ReceiveMessage() );
        thread.setName("ReceiveMessage ");
        thread.start();

        panel.add(chatRoomLabel);

        panel.add(chatRoomText);
        panel.add(messageLabel);
        panel.add(outMessageText);
        panel.add(sendButton);
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(250, 550);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        outMessageText.requestFocus();

    }

    private void setUpNetworking() {
        try {
            socket = new Socket("qa-pint-data01.dev.us-east-1e.private", 4242);
            writer = new PrintWriter(socket.getOutputStream());
            InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
            reader = new BufferedReader(inputStreamReader);
            System.out.println("Networking set up OK");
        } catch (Exception e) {
            System.out.println("Failed to set up networking");
            e.printStackTrace();
        }

    }

    private class SendButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            writer.println(outMessageText.getText());
            writer.flush();
            outMessageText.setText("");

            outMessageText.requestFocus();

        }
    }

    private class ReceiveMessage implements Runnable {
        String line;
        public void run() {
            try {
                while ((line = reader.readLine()) != null) {
                    System.out.println("Incoming: " + line);
                    chatRoomText.append(line + "\n");
                }

            } catch(Exception exception) {

            }


        }
    }
}
