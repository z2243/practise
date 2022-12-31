package ArraysP;

public class MultidimensionalArrayLotteryOdds {
    public static void main(String[] args) {
        // 用一个二维数组，第i行第j列存储从i个球中拿j个球的结果数量lotteryOdds
        // i和j都从0开始，i的最大值为10，这个二维数组必须呈三角形模样
        final int NMax = 10;
        int[][] lotteryOdds = new int[NMax][];
        // 打造一个三角形, 初始化每一行有多少列
        for (int i = 0; i < NMax; i++) {
            lotteryOdds[i] = new int[i+1];
        }
        // 遍历二维数组，计算从i中拿j个球的lotteryOdds
        for (int i = 0; i < NMax; i++) {
            for (int j = 0; j < lotteryOdds[i].length; j++) {
                int lotteryO = 1;
                // k必须从1开始,而且等于j的数必须参与计算
                // 因为抽取结果数量公式等于 i*(i-1)*(i-2)...*(i-j+1) / 1*2*3*...*j
                // 有k=1 才有 i。有k=j 才有（i-j+1）
                for (int k = 1; k <= j; k++) {
                    lotteryO = lotteryO * (i - k + 1) / k;
                }
                lotteryOdds[i][j] = lotteryO;
            }
        }
        for (int[] i : lotteryOdds) {
            for (int j : i) {
                System.out.printf("%4d",j);
            }
            System.out.println();
        }
    }
}
