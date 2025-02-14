package day9.Task2;

public class Circle extends Figure{
    double R;

    public Circle(String Color, double r){
        super(Color);
        this.R = r;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(this.R,2);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * this.R;
    }
}
