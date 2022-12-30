package Unicode;

import java.util.stream.IntStream;

public class UnicodePractise {
    public static void main(String[] args) {
        String sentence = "⏰时钟";
        int i = sentence.codePointAt(0);
        char c = sentence.charAt(0);
        System.out.println(c);//? 输出字符
        System.out.println(i);//55296 输出码点
        //用于确定指定字符(Unicode代码点)是否在补充字符范围内
        System.out.println(Character.isSupplementaryCodePoint(i));//false //表示55926不在‘补充字符’的范围内
        //将sentence的码点作为流返回
        IntStream stream = sentence.codePoints();
        int[] array = stream.toArray();
        System.out.println(array);//[I@3b9a45b3 为什么数组可以打印这么个东西出来？
        //从码点数组的第1位开始 创建3个字符
        String newString1 = new String(array,0,3);
        System.out.println(newString1);//⏰时钟
        //从码点数组的第2位开始 创建2个字符
        String newString2 = new String(array,1,2);
        System.out.println(newString2);//时钟
    }
}