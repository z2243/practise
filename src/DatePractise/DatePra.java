package DatePractise;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DatePra {
    public static void main(String[] args) {
        //本程序可以显示当前月的日历
        LocalDate date = LocalDate.now();
        // 2022-12-31
        // System.out.println(date.toString());
        // 12
        int month = date.getMonthValue();
        // 31
        int today = date.getDayOfMonth();
        // today - ? = 2022-12-? 比如 today - 5 = 2022-12-05
        date = date.minusDays(today - 1);
        // 2022-12-01 拿到本月的第一天，制作日历必须从月头开始
        // System.out.println(date.toString());
        // 要知道月头是星期几才能进行
        DayOfWeek weekday = date.getDayOfWeek();
        // 1 = Monday.. 7 = Sunday
        int value = weekday.getValue();
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        // 如果不是周一，日历的第一行需要缩进
        for (int i = 1; i < value; i++) {
            System.out.print("    ");
        }
        // 循环跳出的条件是当前日期的月份已经到了下一个月了
        while (date.getMonthValue() == month) {
            System.out.printf("%3d",date.getDayOfMonth());
            // 如果和今天一致,要用星号标记
            if (date.getDayOfMonth() == today) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            // 跳到下一天去
            date = date.plusDays(1);
            // 如果下一天到了周一 就换行
            if (date.getDayOfWeek().getValue() == 1) {
                System.out.println();
            }
        }
        // 如果是周一，不换行也可以美观
        if (date.getDayOfWeek().getValue() != 1) {
            System.out.println();
        }
    }
}
