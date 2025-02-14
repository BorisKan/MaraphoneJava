package day9.Task2;

public class Rectangle extends Figure {
    double h;
    double w;

    public Rectangle(String Color, double high, double weight){
        super(Color);
        this.h = high;
        this.w = weight;
    }

    public double area(){
        return this.w * this.h;
    }
    public double perimeter(){
        return 2 * this.h + 2 * this.w;
    }
}
