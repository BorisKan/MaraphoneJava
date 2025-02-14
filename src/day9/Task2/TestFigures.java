package day9.Task2;

public class TestFigures {
    public static void main(String[] args) {
        Figure[] figures = {new Triangle("Red", 10, 10, 10),
        new Triangle("Green", 10, 20, 30),
        new Triangle("Red", 10, 20, 15),
        new Rectangle("Red", 5, 10),
        new Rectangle("Orange", 40, 15),
        new Circle("Red", 4),
        new Circle("Red", 10),
        new Circle("Blue", 5)};

        System.out.println(calculateRedArea(figures));
        System.out.println(calculateRedArea(figures));
    }
    public static double calculateRedPerimeter(Figure[] figures){
        double sumP = 0;
        for (int i = 0; i < figures.length; i++) {
            if (figures[i].color.equals("Red"))
                sumP = sumP + figures[i].perimeter();
        }
        return sumP;
    }

    public static double calculateRedArea(Figure[] figures){
        double sumAr = 0;
        for (int i = 0; i < figures.length; i++) {
            if (figures[i].color.equals("Red"))
                sumAr = sumAr + figures[i].area();
        }
        return sumAr;
    }
}
