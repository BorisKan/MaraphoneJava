package day7.Task1;

public class Airplane {
    String producer;
    int year;
    double lenght;
    double weight;
    double fuel = 0;

    public Airplane(String producer, int year, double lenght, double weight){
        this.producer = producer;
        this.year = year;
        this.lenght = lenght;
        this.weight = weight;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }
    public void Info() {
        System.out.println("Изготовитель:" + producer);
        System.out.println("Год:" + year);
        System.out.println("Длина:" + lenght);
        System.out.println("Вес:" + weight);
        System.out.println("Количество топлива:" + getFuel());
    }
    public void FillUp(double L){
        this.fuel = L;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getLenght() {
        return lenght;
    }

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2){
        if (airplane1.getLenght() > airplane2.getLenght()){
            System.out.println("Первый самолет длиннее");
        } else System.out.println("Второй самолет длиннее");
    }
}
