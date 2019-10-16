////////////////////////
// TITLE: ReadAFile
// AUTHOR: lego
// DATE: 2019-10-16
// PURPOSE: 
////////////////////////
package LearningFileReadersWriters.secondRound;

import java.io.*;

public class ReadAFile {
    public static void main(String[] args) {
        File file = new File("src/main/resources/dataDirectory/aFewLinesForReading.txt");

        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));

            String fileLine;

            while ( (fileLine = bufferedReader.readLine() ) != null) {
                System.out.println(fileLine);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }


    }
}