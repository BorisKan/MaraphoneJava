package day12.Task3;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    List<MusicBand> bands;

    public static void main(String[] args) {
        List<MusicBand> bandList = new ArrayList<>();
        bandList.add(new MusicBand("AAA", 1999));
        bandList.add(new MusicBand("AAB", 2001));
        bandList.add(new MusicBand("ABA", 1456));
        bandList.add(new MusicBand("ABB", 2003));
        bandList.add(new MusicBand("BAA", 2005));
        bandList.add(new MusicBand("BAB", 1983));
        bandList.add(new MusicBand("BBA", 3214));
        bandList.add(new MusicBand("BBB", 1992));
        Info(bandList);
        List<MusicBand> newBandList = groupAfter2000(bandList);
        System.out.println("------------------------------");
        Info(newBandList);

    }
    public static List<MusicBand> groupAfter2000(List<MusicBand> list){
        List<MusicBand> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getYear() > 2000)
                newList.add(list.get(i));
        }
        return newList;
    }

    public static void Info(List<MusicBand> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName() + " " + list.get(i).getYear());
        }
    }
}
