////////////////////////
// TITLE: Song
// AUTHOR: lego
// DATE: 2019-10-28
// PURPOSE: 
////////////////////////
package learningHeadFirstJava.learningSorting;

class Song implements Comparable<Song> {
    private String title;
    private String artist;
    private String rating;
    private String bpm;

    @Override
    public int compareTo(Song song) {
        return title.compareTo(song.getTitle());
    }

    Song(String input_title, String input_artist, String input_rating, String input_bpm) {
        title = input_title;
        this.artist = input_artist;
        this.rating = input_rating;
        this.bpm = input_bpm;

    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getBpm() {
        return bpm;
    }

    public String getRating() {
        return rating;
    }

    public String toString() {
        return title;
    }

}
