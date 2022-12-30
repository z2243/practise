package APi_Pratise;

import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        //do while写一个程序，计算使用者当前的金额数量，询问有这么多钱是否选择退休，退休则结束循环
        //不退休则继续赚钱。注意：初始余额为0，开始攒钱的年头也为0
        //三个输入值，每年得到的钱款payment，上一年所剩的余额balance，利率interestRate
        //余额的收益=余额 * 利率 / 100
        Scanner in = new Scanner(System.in);
        System.out.println("How much money do you earn every year?");
        double payment = in.nextDouble();
        System.out.println("Interest rate in(%):");
        double interestRate = in.nextDouble();
        double balance = 0;
        int year = 0;

        //我们需要在while里判断用户输入的内容，而do后面又是一个模块，所以要在外层先声明一个字符串
        String input;
        do {
            //计算今年能攒多少钱，余额+年入payment再算利率下的年收益
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            year++;
            System.out.printf("After %d year(s), your balance is %.2f %n",year,balance);
            System.out.print("Ready to retire?(Y/N)");
            input = in.next();
        }
        while (input.equals("N"));
    }
}
