/**
 * Created by russell.lego on 7/23/16.
 */
import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.io.*;
import java.util.Scanner;
//import org.apache.commons.io;

public class SecondFileReader {
    public static void main(String[] args) throws IOException {
        File myFile = new File("/Users/lego/git/RussellCommon/first_directory/dataDirectory/aFewLinesForReading.txt");
        FileReader myFileReader = new FileReader(myFile);

        String myContent = new Scanner(myFile).useDelimiter("\\w").next();
        System.out.println(myContent);
        String[] myStringArray = myContent.split("\\s");

        for (int i = 0; i < myStringArray.length; i++) {
            System.out.println(myStringArray[i]);
        }


        // this actually doesn't work and I don't know why


    }
}
