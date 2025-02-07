package day6.Task3;

import java.util.Random;

public class Teacher {
    String Name;
    String Subject;

    public Teacher(String name, String subject){
        this.Name = name;
        this.Subject = subject;
    }

    public void evaluate(Student stud){
        Random rn = new Random();
        String graduate = " ";
        switch(rn.nextInt(5 - 2 + 1) + 2){
            case 2:
                graduate = "не удовлетворительно";
                break;
            case 3:
                graduate = "удовлетворительно";
                break;
            case 4:
                graduate = "хорошо";
                break;
            case 5:
                graduate = "отлично";
                break;
        }
        System.out.println("Преподаватель " + this.Name + " оценил студента с именем " + stud.getName() + " по предмету " + this.Subject + " На оценку " + graduate);
    }
}
