package day12.Task5;

import java.util.List;

public class MusicBand {
    int year;
    String name;
    List<MusicArtist> artists;

    public MusicBand(int year, String name, List<MusicArtist> artists) {
        this.year = year;
        this.name = name;
        this.artists = artists;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public List<MusicArtist> getArtists() {
        return artists;
    }
}
