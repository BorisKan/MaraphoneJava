package day3;
import  java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (count < 5){
            System.out.println("input first number");
            int a = scanner.nextInt();
            System.out.println("input second number");
            int b = scanner.nextInt();
            float c = (float)a/b;
            switch (b){
                case 0:
                    System.out.println("Деление на ноль");
                    break;
                default:
                    System.out.println(c);
            }
            count++;
        }
    }
}
