////////////////////////
// TITLE: SimpleChatServerA
// AUTHOR: lego
// DATE: 2019-10-22
// PURPOSE: 
////////////////////////
package learningHeadFirstJava.simpleChat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class SimpleChatServerA {
    private ArrayList<String> chatMessages = new ArrayList<>();


    void go() {
        try {
            ServerSocket serverSocket = new ServerSocket(4242);
            Socket socket = serverSocket.accept();
            InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line;
            while (true) {
                if ( (line = bufferedReader.readLine()) != null) {
                    chatMessages.add(line);
                    System.out.println(line);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SimpleChatServerA simpleChatServerA = new SimpleChatServerA();
        simpleChatServerA.go();
    }

}
