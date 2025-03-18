package course20and21.challenge4;

import java.util.Objects;

public class Song {
    private final String title;
    private final String artist;
    private final int length;

    public Song(String title, String artist, int length) {
        this.title = title;
        this.artist = artist;
        this.length = length;
    }

    @Override
    public boolean equals(Object object){
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Song song = (Song) object;
        return title.equals(song.title) && artist.equals(song.artist);
    }

    @Override
    public int hashCode(){
        return Objects.hash(title, artist);
    }
}
