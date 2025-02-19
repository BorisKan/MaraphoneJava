package day12;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class Task1 {
    public static void main(String[] args) {
        List<String> cars;
        List<String> car = new ArrayList<>();
        car.add("Audi");
        car.add("BMW");
        car.add("Lexus");
        car.add("Jeep");
        car.add("Lada");
        Info(car);
        System.out.println("-----------------------");
        car = delete(car);
        Info(car);
        System.out.println("-----------------------");
        car = addCar(car, "Toyota");
        Info(car);


    }
    public static void Info(List<String> Cars){
        for (int i = 0; i < Cars.size(); i++)
            System.out.println(Cars.get(i));
    }
    public static List<String> delete(List<String> cars){ //с возвращением нового списка;
        List<String> newCars = new ArrayList<>();
        for (int i = 1; i < cars.size(); i++) {
            newCars.add(cars.get(i));
        }
        return newCars;
    }
    public static List<String> addCar(List<String> cars, String car){
        List<String> newCars = new ArrayList<>();
        for (int i = 0; i < cars.size(); i++) {
            if (i == cars.size() / 2){
                newCars.add(car);
                newCars.add(cars.get(i));
            } else newCars.add(cars.get(i));
        }
        return newCars;
    }
    
}
