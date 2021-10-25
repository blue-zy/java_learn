package main.java.Generic;

//泛型通配符使用
public class Test05 {
    public static <T> void showBox(Box<T> box) {
        T first = box.getFirst();
        System.out.println(first);
    }

    public static void showBox2(Box<?> box) {
        Object first = box.getFirst();
        System.out.println(first);
    }

    public static void showBox3(Box<Number> box) {
        Number first = box.getFirst();
        System.out.println(first);
    }

    public static void main(String[] args) {
        Box<Number> box1 = new Box<>();
        box1.setFirst(100);
        showBox(box1);
        showBox2(box1);
        showBox3(box1);


        Box<Integer> box2 = new Box<>();
        box2.setFirst(200);
        showBox(box2);
        showBox2(box2);
        //报错
//        showBox3(box2);
    }
}

class Box<E> {
    private E first;

    public E getFirst() {
        return first;
    }

    public void setFirst(E first) {
        this.first = first;
    }
}
