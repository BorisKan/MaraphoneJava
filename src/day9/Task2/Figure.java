package day9.Task2;

abstract class Figure {
    String color;

    public Figure(String Color){
        this.color = Color;
    }

    public abstract double area();
    public abstract double perimeter();
}
