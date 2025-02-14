package day7.Task1;



public class Main {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boing", 2014, 30, 20);
        Airplane airplane2 = new Airplane("Boing", 2014, 42, 31 );
        Airplane.compareAirplanes(airplane1,airplane2);

    }
}
