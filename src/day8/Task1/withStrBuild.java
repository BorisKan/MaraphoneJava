package day8.Task1;

public class withStrBuild {
    public static void main(String[] args) {
       StringBuilder str = new StringBuilder();
        System.out.println(output(str));
    }
    public static long output( StringBuilder str){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 20001; i++)
            str.append(i + " ");
        System.out.println(str);
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}
