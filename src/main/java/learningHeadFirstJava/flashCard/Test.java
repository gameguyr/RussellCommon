////////////////////////
// TITLE: Test
// AUTHOR: lego
// DATE: 2019-10-17
// PURPOSE: 
////////////////////////
package learningHeadFirstJava.flashCard;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
//        ArrayList<String> arrayList = new ArrayList();
//        arrayList.add("hello");
//        arrayList.add("my");
//        arrayList.add("name");
//        arrayList.add("is");
//        arrayList.add("Russell");
//
//        for (int i=0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i));
//            System.out.println(i);
//        }
//
//        System.out.println(arrayList.size());


//        String my_string = "I Ieeyee I'm your little butterfly";
//        String my_other_string = "Green back and blue making colors in the sky";
//
//
//        System.out.println(my_string.compareTo(my_other_string));



//        try {
//            File myFile = new File("/Users/lego/git/JavaRussell/src/main/resources/dataDirectory/song_list.txt");
//            FileReader fileReader = new FileReader(myFile);
//            BufferedReader bufferedReader = new BufferedReader((fileReader));
//            String line;
//            while ( (line = bufferedReader.readline()) != null) {
//                System.out.println(line);
//
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

        File file = new File("/Users/lego/git/JavaRussell/src/main/resources/dataDirectory/song_list.txt");
        BufferedReader bufferedReader = null;
        try {
            String lineOfFile;
            bufferedReader = new BufferedReader( new FileReader(file));
            while ((lineOfFile = bufferedReader.readLine()) != null) {
                System.out.println(lineOfFile);
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
