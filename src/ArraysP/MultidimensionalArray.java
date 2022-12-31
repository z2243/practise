package ArraysP;

public class MultidimensionalArray {
    public static void main(String[] args) {
        // 通过多维数组，存储10%-15%的不同利率下，十年的存款增长情况
        // 第0年的存款都是10000元
        // 最开始的利率是10%
        final double STARTRATE = 10;
        // 一共要算六个不同利率下的存款增长情况
        final int NRATES = 6;
        // 要算十年的增长情况
        final int NYEARS = 10;
        // 存放六个利率的数组
        double[] interestRate = new double[NRATES];
        for (int i = 0; i < NRATES; i++) {
            interestRate[i] = (STARTRATE + i) / 100;
        }
        //double[0][0]指第0年10%利率的存款为多少
        double[][] balances = new double[NYEARS][NRATES];
        //我们第0年存款全部是10000
        for (int i = 0; i < NRATES; i++) {
            balances[0][i] = 10000;
        }
        // 从第1年开始计算不同的存款增长数目
        for (int i = 1; i < NYEARS; i++) {
            for (int j = 0; j < NRATES; j++) {
                // 拿到上一年，该利率下的存款
                double oldBalance = balances[i-1][j];
                // 算上一年在这个存款下的收益是多少
                double interest = oldBalance * interestRate[j];
                // 存款加上一年的收益，就是本年的存款额
                balances[i][j] = oldBalance + interest;
            }
        }
        // 打印出利率情况 10%-15%
        for (int i = 0; i < NRATES; i++) {
            System.out.printf("%.0f%%\n",100*interestRate[i]);
        }
        // 打印二维数组balances
        for (double[] a : balances) {
            for (double b : a) {
                System.out.printf("%10.2f",b);
            }
            // 每输出完一行就换行
            System.out.println();
        }
    }
}
