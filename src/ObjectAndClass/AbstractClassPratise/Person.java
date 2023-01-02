package ObjectAndClass.AbstractClassPratise;

public abstract class Person {
    // 抽象方法
    public abstract String getDescription();
    private String name;
    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
