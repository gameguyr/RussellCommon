/**
 * Created by russell.lego on 7/25/16.
 */
import java.io.*;
public class ThirdFileReader{

    public static void main(String args[]) throws IOException {

        InputStream myInputStream = new FileInputStream("/Users/lego/git/RussellCommon/first_directory/dataDirectory/aFewLinesForReading.txt");
        BufferedReader myBufferedReader = new BufferedReader(new InputStreamReader(myInputStream));
        String line = myBufferedReader.readLine(); // reads in the first line
        StringBuilder myStringBuilder = new StringBuilder();

        while (line != null) {
            myStringBuilder.append(line).append("\n");
            line = myBufferedReader.readLine();
        }

        String fileAsString = myStringBuilder.toString();
        System.out.println("Contents (before Java 7) : " + fileAsString);
    }

}
