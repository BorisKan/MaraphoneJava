package day12.Task4;

import java.util.List;

public class MusicBand {
    private int year;
    private String name;
    List<String> persons;

    public MusicBand(int year, String name, List<String> persons) {
        this.year = year;
        this.name = name;
        this.persons = persons;
    }

    public int getYear() {
        return year;
    }

    public String  getName() {
        return name;
    }

    public List<String> getPersons() {
        return persons;
    }
}
