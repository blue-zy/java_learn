package main.java.Reflection;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        // 一个类在内存中只有一个class对象
        // 一个类被加载后，类的整个结构都会被封装在Class对象中
        Class c1 = Class.forName("main.java.Reflection.User");
        Class c2 = Class.forName("main.java.Reflection.User");
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        Class c3 = main.java.Reflection.User.class;
        Class c4 = int.class;
        System.out.println(c3.hashCode());
    }
}


class User{
    private String name;
    private int id;
    private int age;

    public User() {
    }

    private User(String name) {

    }

    public User(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}