package day9.Task1;

public class Human {
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public Human(String Name){
        this.name = Name;
    }
    public void printInfo(){
        System.out.println("Этот человек с именем" + this.name);
    }
}

