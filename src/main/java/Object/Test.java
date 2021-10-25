package main.java.Object;

public class Test {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();

    }

}

class Father implements Cloneable{
    public int a1;
    protected int a2;

    public Father() {

    }

    public Father(int a1, int a2) {
        this.a1 = a1;
        this.a2 = a2;
    }

}

class Son1 extends Father{

    public Son1(int a1, int a2) {
        super(a1, a2);
    }
}

enum Size{SMALL, LARGE};

interface FatherInterface {
    int a = 1;
}

interface SonInterface extends FatherInterface {
    int a = 2;
}

class OuterClass {
    int a = 1;

    OuterClass() {
        System.out.println();
    }
    class InnerClass {
        int a = 1;
        InnerClass() {
            System.out.println(a);
        }
    }
}