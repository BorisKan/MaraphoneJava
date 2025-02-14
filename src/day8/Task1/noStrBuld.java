package day8.Task1;

public class noStrBuld {
    public static void main(String[] args) {
        String str = new String();
        System.out.println(output(str));
    }
    public static long output(String string){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 20001; i++) {
            string = string.concat(Integer.toString(i)) + " ";
        }
        System.out.println(string);
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}
