package LogicalStatement;

import java.util.Scanner;

public class LogicalStatement {
    public static void main(String[] args) {
        //用while语句以及in输入方法，实现一个功能
        //获取用户希望得到的总存款数目goal，以及每年可以存入多少钱payment，以及钱款的年利率rate
        //从第一年开始，计算用户今年的总存款，判断是否达到用户的goal，如果没到达就继续存，达到了就结束
        Scanner in = new Scanner(System.in);
        System.out.println("How much money do you want?");
        double goal = in.nextDouble();
        System.out.println("How much money do you earn every year?");
        double payment = in.nextDouble();
        System.out.println("Interest rate in(%):");
        double interestRate = in.nextDouble();
        double balance = 0;
        int year = 0;

        //while循环
        while(balance < goal){
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            year++;
        }
        System.out.println("You will have achieved your goal in " + year + " year.");
    }
}
