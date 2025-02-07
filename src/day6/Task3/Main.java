package day6.Task3;

public class Main {
    public static void main(String[] args) {
        Teacher Bugrov = new Teacher("Бугров.Д.О", "Дискретная математика");
        Student Kan = new Student();
        Kan.setName("Кан.Б.А");
        Bugrov.evaluate(Kan);
    }
}
