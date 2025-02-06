package day4;
import java.util.Arrays;
import  java.util.Scanner;
import java.util.Random;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input lenght of array:");
        int lenght = scanner.nextInt();
        int [] array = inputElements(lenght);
        info(array, lenght);
        System.out.println(Arrays.toString(array));
        }

    private static int[] inputElements(int count){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    private static void info(int [] array, int count){
        int CountOfEvenNumbers = 0;
        int countEight = 0;
        int CountOfNumbersEqualsOne = 0;
        int CountOfOddNumbers = 0;
        int sum = 0;
        for (int i = 0; i < count; i++) {
            if (array[i] > 8)
                countEight++;
            if (array[i] % 2 == 0)
                CountOfEvenNumbers++;
            if (array[i] == 1)
                CountOfNumbersEqualsOne++;
            if (array[i] % 2 != 0)
                CountOfOddNumbers++;
            sum = sum + array[i];
        }
        System.out.println("lenght of array:" + count);
        System.out.println("Count of numbers which > 8:" + " " + countEight);
        System.out.println("Count of numbers which equals 1:" + " " + CountOfNumbersEqualsOne);
        System.out.println("Count of even numbers:" + " " + CountOfEvenNumbers);
        System.out.println("Count of odd numbers:" + " " + CountOfOddNumbers);
        System.out.println("Sum of elements:" + " " + sum);
    }

}
