package day6.Task1;

public class Bike {
    int year;
    String color;
    String model;

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
    public Bike(int year, String color, String model){
        this.year = year;
        this.color = color;
        this.model = model;

    }
    public void Info(){
        System.out.println("this is a bike");
    }
    public int yearDifference(int year){
        int diff = this.year - year;
        return diff;
    }

}
