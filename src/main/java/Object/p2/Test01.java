package main.java.Object.p2;

import main.java.Object.p1.Parent;

public class Test01 {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.printPublic();

        Child child = new Child();
        child.printPublic();
    }
}
