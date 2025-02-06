package day4;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int m = 12;
        int n = 8;
        int[][] mat = new int[m][n];
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                mat[i][j] = (int) (Math.random()*50);
            }
        }
        int sum = 0;
        for (int i = 0; i < mat.length; i++)
            System.out.println(Arrays.toString(mat[i]));
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                sum = mat[i][j] + sum;
            }
            System.out.println(sum);
            }

        System.out.println(FindMaxString(mat));
    }
    private static int FindMaxString(int[][] mat){
        int[] array = new int[mat.length];
        for (int i = 0; i < mat.length; i++){
            array[i] = 0;
        }
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++)
                array[i] = mat[i][j] + array[i];
        }
        int max = array[0];
        int index = 0;
        for (int i = 1; i < mat.length; i++) {
            if (max <= array[i]){
            index = i;
            max = array[i];
        }
        }
        return index;
    }
}
