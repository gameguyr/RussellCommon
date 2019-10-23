////////////////////////
// TITLE: DailyAdviceServer
// AUTHOR: lego
// DATE: 2019-10-18
// PURPOSE: 
////////////////////////
package learningHeadFirstJava.learningSockets;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class DailyAdviceServer {
    private String[] adviceList = {"Take smaller bites",
            "Go for the tight jeans. They do NOT make you look fat",
            "One word: inappropriate",
            "Just for today, be honest. Tell you boss what you *really* think",
            "You might want to rethink that haircut",
            "Always follow your dreams"};
    public void go() {
        try {
            ServerSocket serverSocket = new ServerSocket(4242);

            while (true) {
                Socket socket = serverSocket.accept();

                PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
                String advice = getAdvice();

                printWriter.println(advice);
                printWriter.close();
                System.out.println(advice);

            }

        } catch (Exception exception) {

        }

    }

    private String getAdvice() {
        int randomIndex = (int) (Math.random() * adviceList.length);
        return adviceList[randomIndex];

    }

    public static void main(String[] args) {
        DailyAdviceServer dailyAdviceServer = new DailyAdviceServer();
        dailyAdviceServer.go();

    }
}
