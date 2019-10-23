////////////////////////
// TITLE: SimpleChatServer
// AUTHOR: lego
// DATE: 2019-10-23
// PURPOSE: 
////////////////////////
package learningHeadFirstJava.simpleChat;

import java.io.*;
import java.net.*;
import java.util.*;

public class SimpleChatServer {

    private ArrayList<PrintWriter> clientOutputStreams;

    public void go() {
        clientOutputStreams = new ArrayList<>();
        try {
            // this is opening the port on the current machine to incoming clients
            ServerSocket serverSock = new ServerSocket(4242);

            while (true) {
                // this acknowledges that a client has connected and creates another socket connection
                // with the client in order to transfer data through
                Socket clientSocket = serverSock.accept();
                PrintWriter writer = new PrintWriter(clientSocket.getOutputStream());
                clientOutputStreams.add(writer);

                // ths will create a new thread for each client that connects
                Thread thread = new Thread(new ClientHandler(clientSocket));
                thread.start();
                System.out.println("Got a new connection from a client");
            }

        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }


    // This is the job that we pass to the thread in order for it to do work.
    public class ClientHandler implements Runnable {
        BufferedReader reader;
        Socket socket;

        // here we have a constructor that creates a new input stream reader
        // from the client's socket that gets passed in as an argument
        public ClientHandler(Socket clientSocket) {
            try {
                socket = clientSocket;
                InputStreamReader isReader = new InputStreamReader(socket.getInputStream());
                reader = new BufferedReader(isReader);
            } catch(Exception ex) {
                ex.printStackTrace();
            }
        }

        public void run() {
            String message;
            try {
                while ((message = reader.readLine()) != null) {
                    // if there is a message that gets sent over the wire into the reader,
                    // the message will be sent to everyone
                    System.out.println("Message: " + message);
                    tellEveryone(message);
                }
            } catch(Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    public static void main (String[] args) {
        new SimpleChatServer().go();
    }



    public void tellEveryone(String message) {
        // loop through each client stream and use write to write the message to each client
        Iterator iterator = clientOutputStreams.iterator();
        while(iterator.hasNext()) {
            try {
                PrintWriter writer = (PrintWriter) iterator.next();
                writer.println(message);
                writer.flush();
            } catch(Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
