package LogicalStatement;

import java.util.Scanner;

public class LotteryOdds {
    public static void main(String[] args) {
        //计算Lottery彩票的几率odds
        //意思是，n个球里，只有1个球会中奖，你抽k个球出来，抽到中奖的几率是多大？
        //几率计算：从n个数字里抽取k个球，中奖几率是n*(n-1)*(n-2)*...*(n-k+1) / 1*2*3*...*k
        Scanner in = new Scanner(System.in);
        System.out.println("How many numbers do you want to draw?");
        int k = in.nextInt();
        System.out.println("What is the highest number you can draw?");
        int n = in.nextInt();

        int lotteryOdds = 1;
        for(int i = 1; i <= k; i++){
            lotteryOdds = lotteryOdds * (n - i + 1) / i;
            //假设n是5，k是3
            // lotteryOdds = 1 * 5 / 1 = 5
            // lotteryOdds = 5 * 4 / 2 = 10 => (5 - 1 + 1) / 1 * (5 - 2 + 1) / 2
            // => 5*(5-2+1)*(5-3+1) / 1*2*3
        }
        // 就算是15个里面抽6个，概率也好低！1/5005！
        System.out.println("Your odds are 1 in " + lotteryOdds + ".Good luck!");
    }
}
