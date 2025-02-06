package day5.Task1;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(2020);
        car.setColor("red");
        car.setModel("audi");
        System.out.println(car.getYear());
        System.out.println(car.getColor());
        System.out.println(car.getModel());
    }
}
