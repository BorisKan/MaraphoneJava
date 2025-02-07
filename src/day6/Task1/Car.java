package day6.Task1;

public class Car {
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

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void Info(){
        System.out.println("this is a car");
    }
    public int yearDifference(int year){
        int diff = this.year - year;
        return diff;
    }

}
