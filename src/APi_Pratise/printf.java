package APi_Pratise;

import java.util.Date;

public class printf {
    public static void main(String[] args) {
        String name = "A";
        int age = 18;
        //Hello,A,Next year,you'll be 18
        System.out.printf("Hello,%s,Next year,you'll be %d\n",name,age);
        float salary = 50.231F;
        //Hello,A,Next year,your salary will be 50.23 会自动四舍五入
        System.out.printf("Hello,%s,Next year,your salary will be %.2f",name,salary);
        String message = String.format("Hello,%s,Next year,you'll be %d\n",name,age);
        //Hello,A,Next year,you'll be 18
        System.out.println("\n"+message);
        //The month is 12   //m表示显示两位数字的月
        System.out.printf("The month is %tm",new Date());
        System.out.printf("\n%1s %2tB %2$te,%2$tY","Due date:",new Date());
    }
}
