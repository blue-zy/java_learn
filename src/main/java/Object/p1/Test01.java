package main.java.Object.p1;

public class Test01 {
    public static void main(String[] args) {
        Child child = new Child();
        child.printDefault();
        child.printProtected();
        child.printPublic();

        Parent parent = new Parent();
        parent.printPublic();
        parent.printProtected();
        parent.printDefault();
    }
}


