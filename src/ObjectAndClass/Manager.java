package ObjectAndClass;

public class Manager extends Employee{
    private double bonus;
    public Manager(String n, double s, int year, int month, int day){
        super(n, s, year, month, day);
        bonus = 0;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public Double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }
}
