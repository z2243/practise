package ObjectAndClass;

import java.time.LocalDate;
import java.util.Random;

public class Employee {
    private static int nextId;

    private int id;
    private String name;
    private Double salary;
    // 这里用LocalDate是因为LocalDate没有更改器方法，而Date有更改器方法setTime，会破坏封装性
    private LocalDate hireDay;
    // 静态初始化代码块 static initialization block
    static //关键字 初始化常量 nextID
    {
        // 构造一个新的随机数生成器
        Random generator = new Random();
        // 确定常量nextID是1-10000的随机数
        nextId = generator.nextInt(10000);
    }
    // 非静态初始化代码块 initialization block
    {
        // 拿到常量作为id，并改变常量，如果有下一个对象创建，保证和刚刚创建的对象的id不一致
        id = nextId;
        nextId++;
    }
    // 构造方法
    public Employee(String n, double s, int year, int month, int day){
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }
    // 重载多个构造方法
    public Employee(){}
    public Employee(double salary){
        // 调用本类中有两个参数的构造器
        this("Employee #" + nextId, salary);
    }
    public Employee(String name, double salary){
        this.salary = salary;
        this.name = name;
    }

    public int getId() {
        return id;
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
