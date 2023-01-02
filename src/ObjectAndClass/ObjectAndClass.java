package ObjectAndClass;

public class ObjectAndClass {
    public static void main(String[] args) {
        // 我们需要写一个程序计算多名员工同时提高5%或者6%的年工资，以员工为对象，存放
        // 员工的姓名、薪水以及聘用日期
        // 用数组存放员工对象。
        Employee[] staff = new Employee[7];
        staff[0] = new Employee("Carl Cracker", 75000, 2000,5,21);
        staff[1] = new Employee("Harry Hacker", 50000, 2008,8,1);
        staff[2] = new Employee("Tony Tester", 85000, 2012,12,25);
        staff[3] = new Employee();
        staff[4] = new Employee("Joey",40000);
        staff[5] = new Employee(60000);
        // Manager类继承了Employee类，并且有一个bonus属性，Manager的getSalary方法都会将薪水与bonus相加再返回
        Manager manager = new Manager("Austin Yan",80000, 2002, 6, 12);
        manager.setBonus(5000);
        staff[6] = manager;

        // 调用改变状态的方法
//        for (Employee e : staff) {
//            // 每个人工资提高5%
//            e.raiseSalary(5);
//        }
        for (Employee e : staff) {
            System.out.println("name:" + e.getName() + ", id:" + e.getId() + ", salary:" + e.getSalary());
        }
    }
}
