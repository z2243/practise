package ObjectAndClass;

import java.time.LocalDate;

public class Employee {
    private String name;
    private Double salary;
    // 这里用LocalDate是因为LocalDate没有更改器方法，而Date有更改器方法setTime，会破坏封装性
    private LocalDate hireDay;
    // 构造方法
    public Employee(String n, double s, int year, int month, int day){
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }
    // 改变状态的方法

    public void raiseSalary(double persent) {
        double raise = salary * persent / 100;
        salary += raise;
    }
}
