package ObjectAndClass;

public class ObjectAndClass {
    public static void main(String[] args) {
        // 我们需要写一个程序计算多名员工同时提高5%或者6%的年工资，以员工为对象，存放
        // 员工的姓名、薪水以及聘用日期
        // 用数组存放员工对象。
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Carl Cracker", 75000, 2000,5,21);
        staff[1] = new Employee("Harry Hacker", 50000, 2008,8,1);
        staff[2] = new Employee("Tony Tester", 85000, 2012,12,25);

        // 调用改变状态的方法
        for (Employee e : staff) {
            // 每个人工资提高5%
            e.raiseSalary(5);
        }
        for (Employee e : staff) {
            System.out.println("name:" + e.getName() + ", salary:" + e.getSalary() + ", hireDay:"+ e.getHireDay());
        }
    }
}
