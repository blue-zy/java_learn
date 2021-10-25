package main.java.Generic;

import java.util.Comparator;
import java.util.TreeSet;

//类型通配符下限2
public class Test08 {
    public static void main(String[] args) {
        TreeSet<Cat> treeSet = new TreeSet<>(new Comparator2());
        //报错子类
//        TreeSet<Cat> treeSet = new TreeSet<>(new Comparator3());
        //不报错父类
//        TreeSet<Cat> treeSet = new TreeSet<>(new Comparator1());

        treeSet.add(new Cat("cat1", 20));
        treeSet.add(new Cat("cat2", 22));
        treeSet.add(new Cat("cat3", 23));
        treeSet.add(new Cat("cat4", 14));
        for (Cat cat : treeSet) {
            System.out.println(cat);
        }
    }
}


class Comparator1 implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.name.compareTo(o2.name);
    }
}

class Comparator2 implements Comparator<Cat> {

    @Override
    public int compare(Cat o1, Cat o2) {
        return o1.age - o2.age;
    }
}

class Comparator3 implements Comparator<MiniCat> {

    @Override
    public int compare(MiniCat o1, MiniCat o2) {
        return o1.level - o2.level;
    }
}