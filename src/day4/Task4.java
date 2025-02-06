package day4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[100];
        array = InputArray();
        int[] IndexSum = FindMaxSum(array);
        int[] SumOfArray = new int[98];
        int sum = 0;
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length - 3; i++) {
            sum = array[i] + array[i + 1] + array[i + 2];
            SumOfArray[i] = sum;
            System.out.println(i + "-" + SumOfArray[i]);
        }
        System.out.println(IndexSum[0] + " " + IndexSum[1]);


    }

    private static int[] InputArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++)
            array[i] = (int) (Math.random() * 100);
        return array;
    }

    private static int[] FindMaxSum(int[] array) {
        int sum = 0;
        int index = 0;
        int[] SumOfArray = new int[98];
        int[] IndexSum = new int[2];
        for (int i = 0; i < array.length - 3; i++) {
            sum = array[i] + array[i + 1] + array[i + 2];
            SumOfArray[i] = sum;
        }
        int elem = SumOfArray[0];
        for (int i = 0; i < SumOfArray.length - 1; i++) {
                if (elem < SumOfArray[i]) {
                    elem = SumOfArray[i];
                    index = i;
                }

        }
            IndexSum[0] = index;
            IndexSum[1] = elem;
            return IndexSum;
        }
    }
