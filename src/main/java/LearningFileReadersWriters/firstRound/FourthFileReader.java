package LearningFileReadersWriters.firstRound; /**
 * Created by russell.lego on 7/25/16.
 */

import java.io.*;
public class FourthFileReader{

   public static void main(String args[]) throws IOException {
        String filePath = "/Users/lego/git/RussellCommon/first_directory/dataDirectory/aFewLinesForReading.txt";
        InputStream myInputStream = new FileInputStream(filePath);
        BufferedReader myBufferedReader = new BufferedReader(new InputStreamReader(myInputStream));
        String line = myBufferedReader.readLine(); // reads in the first line
        StringBuilder myStringBuilder = new StringBuilder();

        while (line != null) {
            myStringBuilder.append(line).append("\n"); //appends to the string
            line = myBufferedReader.readLine(); // reads the next line
        }

        String fileAsString = myStringBuilder.toString();
//        System.out.println("Contents (before Java 7) : " + fileAsString);

        String[] myStringArray = fileAsString.split("\\s");

        for (int i = 0; i < myStringArray.length; i++) {
            System.out.println(myStringArray[i]);
        }
    }

}
