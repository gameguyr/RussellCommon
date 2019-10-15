////////////////////////
// TITLE: WriteAFile
// AUTHOR: lego
// DATE: 2019-10-14
// PURPOSE: 
////////////////////////
package LearningFileReaders.secondRound;

import java.io.FileWriter;
import java.io.IOException;

public class WriteAFile {

    public static void main(String[] args) {
        String myString = "Hello this is my first string.  I think that releasing two separate code bases in one day is a bad idea";


        try {
            FileWriter fileWriter = new FileWriter("test_file_writer.txt");
            fileWriter.write(myString);
            fileWriter.close();
        }

        catch(IOException exception){
            System.out.println("Failed to write to the file due to: " + exception);
        }

    }
}
