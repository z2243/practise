package Unicode;

public class UnicodePractise {
    public static void main(String[] args) {
        String sentence = "\uD800时钟";
        int i = sentence.codePointAt(0);
        char c = sentence.charAt(0);
        System.out.println(c);//? 输出字符
        System.out.println(i);//55296 输出码点
        //用于确定指定字符(Unicode代码点)是否在补充字符范围内
        System.out.println(Character.isSupplementaryCodePoint(i));//false //表示55926不在‘补充字符’的范围内

    }
}