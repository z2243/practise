package ArraysP;

import java.util.Arrays;
import java.util.Scanner;

public class LotteryDrawing {
    public static void main(String[] args) {
        // 输入规定一共有几个球，需要拿出几个球，程序把抽出的下标数所放的球数打印出来
        // 球的数字是从1-n,按序排列
        //0.38716513720610113 random函数会给0-1的随机小数
        //System.out.println(Math.random());
        Scanner in = new Scanner(System.in);
        System.out.println("How many numbers do you want to draw?");
        int k = in.nextInt();
        System.out.println("What is the highest number you can draw?");
        int n = in.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = i + 1;
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            // 保证随机出来的数字在1到n之间 不会四舍五入吗？
            double z = Math.random();
            int r = (int)(z * n);
            result[i] = numbers[r];

            //去掉抽出的球数，以防重复抽同一个数字。
            // 这里通过把球数改成第n个球的数字，然后再把第n个球去掉来解决
            numbers[r] = numbers[n-1];
            n--;
        }
        // 按顺序打出抽出的球数
        Arrays.sort(result);
        System.out.println("Bet the following combination. It'll make you rich!");
        for (int r : result) {
            System.out.println(r);
        }
    }
}
