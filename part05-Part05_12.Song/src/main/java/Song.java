
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    public boolean equals(Object song) {
        if (song == this) {
            return true;
        }
        if (!(song instanceof Song)) {
            return false;
        }
        
        Song comparedSong = (Song) song;
        
         if (this.artist == comparedSong.artist && this.name == comparedSong.name && this.durationInSeconds == comparedSong.durationInSeconds) {
             return true;
         } else {
             return false;
         }
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

}
