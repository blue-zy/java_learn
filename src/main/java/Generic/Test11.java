package main.java.Generic;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test11 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Person> personClass = Person.class;
        Constructor<Person> constructor = personClass.getConstructor();
        Person person = constructor.newInstance();

        //没用泛型时
        Class personClass2 = Person.class;
        Constructor constructor2 = personClass.getConstructor();
        Object o = constructor2.newInstance();
    }
}

class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
