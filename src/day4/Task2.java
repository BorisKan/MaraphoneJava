package day4;
import java.util.Random;
import  java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = InputArray();
        int max = MaxElem(array);
        int min = MinElem(array);
        int countOfZero = FindLastZero(array);
        int sumZero = SumOfLastZero(array);
        System.out.println("Max elem of array: " + max + "\n" + "Min elem of array:" + min + "\n" + "Count of last zero:" + countOfZero + "\n" + "Sum of Zero:" + sumZero);
    }
    private static int[] InputArray(){
        Random random = new Random();
        int[] array = new int[100];
        for(int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }
    private static int MaxElem(int[] array){
        int max = 0;
        for(int i: array){
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }
    private static int MinElem(int[] array){
        int min = array[0];
        for(int i: array){
            if (min > array[i])
                min = array[i];
        }
        return min;
    }
    private static int FindLastZero(int[] array){
        int count = 0;
        for(int i: array){
            if (array[i] % 10 == 0)
                count++;
        }
        return count;
    }
    private static int SumOfLastZero(int[] array){
        int sum = 0;
        for(int i: array){
            if (array[i] % 10 == 0){
                sum = sum + array[i];

            }
        }
        return sum;
    }
}
