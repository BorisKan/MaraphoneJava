package day3;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while(flag) {
            String city = scanner.nextLine();
            switch (city) {
                case "Moscow":
                case "Rostov":
                case "Vladivostok":
                    System.out.println("Russia");
                    break;
                case "Liverpool":
                case "London":
                case "Manchester":
                    System.out.println("England");
                    break;
                case "Rim":
                case "Milan":
                case "Turin":
                    System.out.println("Italy");
                    break;
                case "Berlin":
                case "Keln":
                case "Munhchen":
                    System.out.println("Germany");
                    break;
                case "stop":
                    flag = false;
                    System.out.println("ERROR");
                default:
                    System.out.printf("-" + "unknown country");
            }
        }
    }
}
