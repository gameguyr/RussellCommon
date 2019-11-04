////////////////////////
// TITLE: JukeBox1
// AUTHOR: lego
// DATE: 2019-10-31
// PURPOSE: To take in a list of songs from a file and sort them and print them
////////////////////////
package learningHeadFirstJava.learningSorting;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class JukeBox1 {

    ArrayList<Song> songList = new ArrayList<>();

    public static void main(String[] args) {
        JukeBox1 jukeBox1 = new JukeBox1();
        jukeBox1.loadSongs();
        jukeBox1.printSongs();



    }

    private void printSongs() {
        Collections.sort(songList);
        for( int i=0; i < songList.size(); i++ ) {
            System.out.println(songList.get(i).getTitle());
        }
    }

    private void loadSongs() {

        try {
            File songFile = new File("src/main/resources/dataDirectory/song_list.txt");
            FileReader fileReader = new FileReader(songFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null){
                String[] songAttributes = line.split(":");
                Song tempSong = new Song(songAttributes[0], songAttributes[1], songAttributes[2], songAttributes[3]);
                songList.add(tempSong);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }





    }
