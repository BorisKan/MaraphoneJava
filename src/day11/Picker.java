package day11;

public class Picker extends Warehouse implements Worker {
    double salary = 0;
    public Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public double getSalary() {
        return salary;
    }
    public void doWork(){
        super.countOrder = super.countOrder + 1;
        this.salary = this.salary + 80;
    }
    public void bonus(){
            this.salary = this.salary * 3;
    }

    @Override
    public void Info() {

    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", warehouse=" + warehouse +
                '}';
    }
}
