package day11;

class Courier extends Warehouse implements Worker{
    double salary = 0;
    public Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public double getSalary() {
        return salary;
    }

    public void doWork(){
        super.balance = super.balance + 1000;
        this.salary = this.salary + 100;
    }
    public void bonus(){
            this.salary = this.salary * 3;
    }

    @Override
    public void Info() {
        System.out.println("count order" + super.countOrder);
        System.out.println("balance" + super.balance);
    }
}
