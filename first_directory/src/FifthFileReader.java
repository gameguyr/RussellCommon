/**
 * Created by lego on 6/22/17.
 */
import java.io.*;
public class FifthFileReader{

    public static void main(String args[]) throws IOException {

        String filePathForRansomNote = "/Users/lego/git/RussellCommon/first_directory/dataDirectory/testRansomNote.txt";
        InputStream ransomNoteInputStream = new FileInputStream(filePathForRansomNote);
        BufferedReader ransomBufferedReader = new BufferedReader(new InputStreamReader(ransomNoteInputStream));
        String line = ransomBufferedReader.readLine(); // reads in the first line
        StringBuilder ransomStringBuilder = new StringBuilder();

        while (line != null) {
            ransomStringBuilder.append(line).append("\n"); //appends a new line to the string
            line = ransomBufferedReader.readLine(); // reads the next line
        }

        String ransomNoteString = ransomStringBuilder.toString();
//        System.out.println("Contents (before Java 7) : " + fileAsString);

        String[] ransomNoteStringArray = ransomNoteString.split("\\s"); //splitting the string by whitespaces and making an array from that




//      Now doing the same thing for the big chunk of text

        String filePathForBook = "/Users/lego/git/RussellCommon/first_directory/dataDirectory/sampleFromToKillAMockingBird.txt";
        InputStream bookInputStream = new FileInputStream(filePathForBook);
        BufferedReader bookBufferedReader = new BufferedReader(new InputStreamReader(bookInputStream));
        String bookLine = bookBufferedReader.readLine(); // reads in the first line
        StringBuilder bookStringBuilder = new StringBuilder();

        while (bookLine != null) {
            bookStringBuilder.append(bookLine).append("\n"); //appends a new line to the string
            bookLine = bookBufferedReader.readLine(); // reads the next line
        }

        String bookString = bookStringBuilder.toString();
//        System.out.println("Contents (before Java 7) : " + fileAsString);

        String[] bookStringArray = bookString.split("\\s");

        // Now we have the ransom note and the book loaded into separate arrays.  I want to
        // loop through the ransom note words and loop through the book to see if there's a match

        String[] matchedStringArray = new String[ransomNoteStringArray.length];






        for (int i = 0; i < ransomNoteStringArray.length; i++) {
            for (int j = 0; j < bookStringArray.length; j++) {
                if (ransomNoteStringArray[i].equals(bookStringArray[j])) {
                    matchedStringArray[i] = bookStringArray[j];
                    System.out.printf("Found Word: %s   Position: %s \n",bookStringArray[j], j);
                    break;
                }
            }
        }

        System.out.println("Here's the words that I found");

        for (int i = 0; i < matchedStringArray.length; i++){
            System.out.println(matchedStringArray[i]);
        }
    }

}
