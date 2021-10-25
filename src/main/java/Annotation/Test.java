package main.java.Annotation;

import main.java.Collections.List;

import java.util.ArrayList;

public class Test {

    @Override
    public String toString() {
        return super.toString();
    }

    @Deprecated
    public static void test(){
        System.out.println("Deprecated");
    }

    @SuppressWarnings("all")
    public void test02(){
    }

    public static void main(String[] args) {
        test();
    }
}
