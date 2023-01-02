package ObjectAndClass.AbstractClassPratise;

public class EmployeeAndStudentIsAPerson {
    public static void main(String[] args) {
        Person[] people = new Person[2];
        people[0] = new Employee("Peter",4500,2022,9,28);
        people[1] = new Student("Sophie","Chinese");
        for (Person p : people) {
            System.out.println(p.getName() + "," + p.getDescription());
        }
    }
}
