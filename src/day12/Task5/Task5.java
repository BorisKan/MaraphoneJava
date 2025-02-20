package day12.Task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {

    public static void main(String[] args) {
        List<MusicArtist> artists1 = new ArrayList<>();
        artists1.add(new MusicArtist("adam vaal", 19));
        artists1.add(new MusicArtist("Fill kor", 42));
        MusicBand band1 = new MusicBand(1999, "ABBA",artists1);
        List<MusicArtist> artists2 = new ArrayList<>();
        artists2.add(new MusicArtist("asdqwe asd", 51));
        artists2.add(new MusicArtist("asd ds", 41));
        MusicBand band2 = new MusicBand(2000, "ACDC", artists2);
        printArtists(transferMembers(band1,band2));
    }
    public static MusicBand transferMembers(MusicBand band1, MusicBand band2){
        for (int i = 0; i < band1.artists.size(); i++) {
            band2.artists.add(band1.artists.get(i));
        }
        MusicBand newBand = new MusicBand(band2.getYear(), band2.getName(), band2.getArtists());
        return newBand;
    }
    public static void printArtists(MusicBand band){
        for (int i = 0; i < band.artists.size(); i++) {
            System.out.println(band.artists.get(i).name + " " + band.artists.get(i).age);
        }
    }
}
