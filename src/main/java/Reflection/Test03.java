package main.java.Reflection;

//测试class实例的创建方式
public class Test03 {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Student();
        System.out.println("this person is" + person.name);

        // 1.通过对象获得
        Class c1 = person.getClass();
        System.out.println(c1.hashCode());

        // 2.forname
        Class c2 = Class.forName("main.java.Reflection.Student");
        System.out.println(c2.hashCode());

        // 3.类名.class
        Class c3 = Student.class;
        System.out.println(c3.hashCode());

        // 4.基本内置类型的包装类都有一个Type属性
        Class c4 = Integer.TYPE;
        System.out.println(c4);

        // 获得父类类型
        Class c5 = c1.getSuperclass();
        System.out.println(c5);

        Class c6 = c5.getSuperclass();
        System.out.println(c6);
    }
}


class Person{
    String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Student extends Person {
    public Student() {
        this.name = "学生";
    }
}

class Teacher extends Person {
    public Teacher() {
        this.name = "老师";
    }
}