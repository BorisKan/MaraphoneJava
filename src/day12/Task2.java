package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        inputNUms(numbers);
        Info(numbers);
    }
    public static void inputNUms(List<Integer> list){
        for (int i = 0; i <= 30; i++) {
            if (i % 2 == 0)
                list.add(i);
        }
        for (int i = 300; i <= 350; i++) {
            if (i % 2 == 0)
                list.add(i);
        }
    }
    public static void Info(List<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
