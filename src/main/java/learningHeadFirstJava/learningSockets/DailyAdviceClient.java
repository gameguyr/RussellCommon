////////////////////////
// TITLE: DailyAdviceClient
// AUTHOR: lego
// DATE: 2019-10-18
// PURPOSE: 
////////////////////////
package learningHeadFirstJava.learningSockets;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class DailyAdviceClient {

    public void go() {
        try {
            Socket socket = new Socket("127.0.0.1", 4242);

            InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String advice = bufferedReader.readLine();
            System.out.println("Today you should: " + advice);

            bufferedReader.close();

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static void main(String[] args) {
        DailyAdviceClient dailyAdviceClient = new DailyAdviceClient();
        dailyAdviceClient.go();

    }
}
