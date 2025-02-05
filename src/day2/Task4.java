package day2;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.nextLine();
        if(x > 5){
            System.out.println(firstCondition(x));
     }
        if(x >= -3 && x <= 5){
            System.out.println(secondCondition(x));
        }
        if(x < -3){
            System.out.println(thirdCondition());
        }

    }
    private static double firstCondition(int x){
        double y = (x*x - 10)/(x + 7);
        return y;
    }
    private static double secondCondition(int x){
        double y = (x+3)*(x*x-2);
        return y;
    }
    private static int thirdCondition(){
        return 420;
    }

}
