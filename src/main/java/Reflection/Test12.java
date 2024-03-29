package main.java.Reflection;

import java.lang.annotation.*;
import java.lang.reflect.Field;

//反射操作注解
public class Test12 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class c1 = Class.forName("main.java.Reflection.Student2");

        //通过反射获得注解
        Annotation[] annotations = c1.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }

        //获得注解的value的值
        TableStudent tableStudent = (TableStudent) c1.getAnnotation(TableStudent.class);
        String value = tableStudent.value();
        System.out.println(value);

        //获得类指定的注解
        Field f = c1.getDeclaredField("name");
        FieldStudent fieldStudent = f.getAnnotation(FieldStudent.class);
        System.out.println(fieldStudent.columnName());
        System.out.println(fieldStudent.type());
        System.out.println(fieldStudent.length());

    }
}

@TableStudent("db_student")
class Student2 {
    @FieldStudent(columnName = "db_id", type = "int", length = 10)
    private int id;
    @FieldStudent(columnName = "db_age", type = "int", length = 10)
    private int age;
    @FieldStudent(columnName = "db_name", type = "varchar", length = 3)
    private String name;

    public Student2() {
    }

    public Student2(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

//类名的注解
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface TableStudent {
    String value();
}


//属性的注解
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface FieldStudent {
    String columnName();

    String type();

    int length();
}