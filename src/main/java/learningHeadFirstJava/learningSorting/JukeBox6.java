////////////////////////
// TITLE: JukeBox6
// AUTHOR: lego
// DATE: 2019-11-04
// PURPOSE: To see the differences between using an ArrayList and a HashSet
////////////////////////
package learningHeadFirstJava.learningSorting;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class JukeBox6 {
    ArrayList<Song>  songList = new ArrayList<>();




    public static void main(String[] args) {
        JukeBox6 myJukeBox = new JukeBox6();
        myJukeBox.go();
    }
    public void go() {
        loadSongs();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
        HashSet<Song> songSet = new HashSet<>();
        songSet.addAll(songList);
        System.out.println(songSet);


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
