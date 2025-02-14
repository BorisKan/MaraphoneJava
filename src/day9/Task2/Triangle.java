package day9.Task2;

public class Triangle extends Figure{
    double a;
    double b;
    double c;

    public Triangle(String Color, double a1, double a2, double a3){
        super(Color);
        this.a = a1;
        this.b = a2;
        this.c = a3;
    }

    public double area() {
        double p = (this.a + this.b + this.c) / 2;
        return Math.sqrt((p-this.a)*(p-this.b)*(p-this.c));
    }

    public double perimeter() {
        return this.a + this.b + this.c;
    }
}
