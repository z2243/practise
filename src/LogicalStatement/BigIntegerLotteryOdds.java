package LogicalStatement;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerLotteryOdds {
    public static void main(String[] args) {
        // LotteryOdds的计算里，如果highest draw非常大，会导致结果的分母很大，Long类型可能都装不下
        //用bigInteger会比int和long更合适
        Scanner in = new Scanner(System.in);
        System.out.println("How many numbers do you want to draw?");
        int k = in.nextInt();
        System.out.println("What is the highest number do you draw?");
        int n = in.nextInt();
        BigInteger lotteryOdds = BigInteger.valueOf(1);
        for (int i = 1; i <= k; i++) {
            //乘法用multiply，除法用divide
            lotteryOdds = lotteryOdds.multiply (BigInteger.valueOf(n-i+1)).divide(BigInteger.valueOf(i));
        }
        System.out.println("Your odds are 1 in " + lotteryOdds + ". Good luck!");
    }
}
