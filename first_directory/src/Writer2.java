/**
 * Created by russell.lego on 7/20/16.
 */

import java.io.*;

public class Writer2 {
    public static void main(String[] args){
        try {
            boolean newFile = false;
            File file = new File("fileWrite1.txt");
            System.out.println(file.exists());
            newFile = file.createNewFile();
            System.out.println(newFile);
            System.out.println(file.exists());
        } catch (IOException e) {}


        }

    }
