package day2;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input diapason:\n");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a >= b)
            System.out.println("ERROR");
        FindNecessary(a, b);

    }
    private static void FindNecessary(int x, int y){
        for (;x < y; x++){
            if (x % 10 == 5)
                System.out.printf(x + " ");
        }
    }
}
