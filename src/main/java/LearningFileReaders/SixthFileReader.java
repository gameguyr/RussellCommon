package LearningFileReaders;

import com.sun.deploy.util.StringUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by lego on 6/23/17.
 */


public class SixthFileReader{

    private String filePath1;
    private String filePath2;

    public SixthFileReader(){}

    public SixthFileReader(String filePath1, String filePath2){
        this.filePath1=filePath1;
        this.filePath2=filePath2;
    }
    // getter
    public String getfilePath1(){
        return this.filePath1;
    }
    //setter
    public void setfilePath1(String filePath){
        this.filePath1 = filePath;
    }

    // getter
    public String getfilePath2(){
        return this.filePath2;
    }
    //setter
    public void setfilePath2(String filePath){
        this.filePath2 = filePath;
    }

    public boolean areWordsFound(String filePath1, String filePath2) throws IOException {


        ArrayList ransomNoteStringArray = returnStringArray(filePath1);
        ArrayList textStringArray = returnStringArray(filePath2);
        ArrayList matchedStringArray = new ArrayList();


        for (int i = 0; i < ransomNoteStringArray.size(); i++) {
            for (int j = 0; j < textStringArray.size(); j++) {
                if (ransomNoteStringArray.get(i).equals(textStringArray.get(j))) {
                    matchedStringArray.add(textStringArray.get(j)) ;
                    System.out.printf("Found Word: %s   Position: %s \n",textStringArray.get(j), j);
                    break;
                }
            }
        }

        System.out.println("Here's the words that I found");

        for (int i = 0; i < matchedStringArray.size(); i++){
            System.out.println(matchedStringArray.get(i));
        }

        Iterator<String> stringIterator = ransomNoteStringArray.iterator();
        while(stringIterator.hasNext()){
            String temp = stringIterator.next();
            if(!matchedStringArray.contains(temp)){
                return false;
            }
        }
        return true;
    }

    /**
     *
     * @param filePath
     * @return
     * @throws IOException
     */
    public static ArrayList returnStringArray (String filePath) throws IOException {

        InputStream myInputStream = new FileInputStream(filePath);
        BufferedReader myBufferedReader = new BufferedReader(new InputStreamReader(myInputStream));
        String line = myBufferedReader.readLine(); // reads in the first line
        StringBuilder myStringBuilder = new StringBuilder();

        while (line != null) {
            myStringBuilder.append(line).append("\n"); //appends a new line to the string
            line = myBufferedReader.readLine(); // reads the next line
        }

        String myString = myStringBuilder.toString();
        String[] temp = myString.split("\\s");

        ArrayList<String> myStringArray ; //splitting the string by whitespaces and making an array from that
        myStringArray = new ArrayList<>(Arrays.asList(temp));
        return myStringArray;
    }


}

