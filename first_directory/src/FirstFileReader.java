/**
 * Created by russell.lego on 7/23/16.
 */
import java.io.*;

public class FirstFileReader {
    public static void main(String[] args) throws IOException {
        File myFile = new File("/Users/lego/git/RussellCommon/first_directory/dataDirectory/aFewLinesForReading.txt");
        FileReader myFileReader = new FileReader(myFile);
        BufferedReader myBufferedReader = new BufferedReader(myFileReader);

        String myString ;


        while( (myString = myBufferedReader.readLine() ) != null) {
            System.out.println(myString);
        }

        myBufferedReader.close();

    }
}
