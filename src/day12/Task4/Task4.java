package day12.Task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    List<MusicBand> bands;

    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        List<String> members2 = new ArrayList<>();
        members1.add(new String("Adam Vaal"));
        members1.add(new String("Larisa Dolina"));
        members2.add(new String("Filip Kirkorov"));
        members2.add(new String("Grigoriy Leps"));
        MusicBand band1 = new MusicBand(1999, "AAA",members1);
        MusicBand band2 = new MusicBand(2001, "BBB",members2);
       // transferMembers(band1,band2);
        PrintMembers(transferMembers(band1,band2));

    }
    public static MusicBand transferMembers(MusicBand band1, MusicBand band2){
        for (int i = 0; i < band1.getPersons().size(); i++)
            band2.persons.add(band1.persons.get(i));
        MusicBand newBand = new MusicBand(band2.getYear(), band2.getName(),band2.getPersons());
        return newBand;
    }
    public static void PrintMembers(MusicBand band){
        for (int i = 0; i < band.persons.size(); i++)
            System.out.println(band.persons.get(i));
    }
}

