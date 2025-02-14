package day8.Task2;

import day6.Task2.Airplane;

public class Main {
    public static void main(String[] args) {
        day6.Task2.Airplane airplane = new Airplane("Boing", 2014, 30, 20);
            airplane.setYear(2020);
            airplane.setLenght(32);
            airplane.FillUp(20);
            airplane.FillUp(40);
            airplane.Info();
    }
}
