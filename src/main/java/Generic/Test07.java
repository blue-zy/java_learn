package main.java.Generic;

import sun.plugin2.os.windows.FLASHWINFO;

import java.util.ArrayList;
import java.util.List;

//类型通配符的上下限
public class Test07 {

    //设置上限为Cat 则可以传入Cat及其子类
    public static void showAnimal(ArrayList<? extends Cat> list) {
//        list.add(new Object());
        //由于采用设置上限 不确定集合到底是什么
        //下列均报错
//        list.add(new Animal());
//        list.add(new Cat());
//        list.add(new MiniCat());
        for (Object o : list) {
            System.out.println(o);
        }

        for (int i = 0; i < list.size(); i++) {
            Cat cat = list.get(i);
            System.out.println(cat);
        }
    }

    //设置下限为Cat
    public static void showAnimal2(List<? super Cat> list) {
//        list.add(new Cat());
        //报错
//        list.add(new Animal());
//        list.add(new MiniCat());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        ArrayList<Cat> cats = new ArrayList<>();
        ArrayList<MiniCat> miniCats = new ArrayList<>();

        //上限测试
        //此时传入animals报错
//        showAnimal(animals);
//        showAnimal(cats);
//        showAnimal(miniCats);

        //下限测试
        showAnimal2(animals);
        showAnimal2(cats);
        //报错
//        showAnimal2(miniCats);
    }
}


class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Cat extends Animal {

    public int age;

    public Cat(String name, int age) {
        super(name);
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class MiniCat extends Cat {

    public int level;

    public MiniCat(String name, int age, int level) {
        super(name, age);
        this.level = level;
    }

    @Override
    public String toString() {
        return "MiniCat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", level=" + level +
                '}';
    }
}