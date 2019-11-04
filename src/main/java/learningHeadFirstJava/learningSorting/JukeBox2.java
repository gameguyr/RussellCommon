////////////////////////
// TITLE: JukeBox2
// AUTHOR: lego
// DATE: 2019-10-31
// PURPOSE: To learn how to sort by using a custom comparator
////////////////////////
package learningHeadFirstJava.learningSorting;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class JukeBox2 {

    ArrayList<Song> songList = new ArrayList<>();

    public static void main(String[] args) {
        JukeBox2 jukeBox2 = new JukeBox2();
        jukeBox2.loadSongs();
        jukeBox2.printSongs();



    }

    private void printSongs() {
        Collections.sort(songList, new ArtistCompare() );
        for( int i=0; i < songList.size(); i++ ) {
            String message = String.format("title: %-22s artist: %-22s", songList.get(i).getTitle(), songList.get(i).getArtist());
            System.out.println(message);
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

    class ArtistCompare implements Comparator<Song> {
        public int compare(Song songOne, Song songTwo) {
            return songOne.getArtist().compareTo(songTwo.getArtist());
        }
    }
}
