package ObjectAndClass;

public class Test {
    public static void main(String[] args) {
        // 测试可不可以通过方法改变传进去的参数从而改变基本数据类型的值——不可以
        // 必须有返回值代替原值才能改变。
        System.out.println("Testing tripleValue");
        double persent = 10;
        System.out.println("before: persent = " + persent);
        tripleValue(persent);
        System.out.println("after: persent = " + persent);
        // 同理，方法也改变不了作为参数传进来的对象状态/对象引用

    }

    private static void tripleValue(double persent) {
        persent *= 3;
        System.out.println("End of method: x = " + persent);
    }
}
