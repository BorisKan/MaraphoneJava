package day9.Task1;

class Student extends Human {
    private String Group;

    public Student(String name, String group){
        super(name);
        this.Group = group;
    }
    public void printInfoStud(){
        super.printInfo();
        System.out.println("Этот студент с именем " + this.name);
    }
}
