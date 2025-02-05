package day2;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            int floor = scanner.nextInt();
            TypeofHouse(floor);
            if (floor == 0)
                flag = false;
            if (floor < 0)
                System.out.println("ERROR");
        }
    }
    private static void TypeofHouse(int floor){
        if(floor <= 4 && floor >= 1)
            System.out.println("Малоэтажный дом");
        if(floor <= 8 && floor >= 5)
            System.out.println("Среднеэтажный дом");
        if(floor >= 9)
            System.out.println("Многоэтажный дом");
    }
}
