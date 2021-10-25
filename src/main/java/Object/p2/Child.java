package main.java.Object.p2;

import main.java.Object.p1.Parent;


public class Child extends Parent {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.printPublic();

        Child child = new Child();
        child.printPublic();
        child.printProtected();


        Child2 child2 = new Child2();
    }
}

