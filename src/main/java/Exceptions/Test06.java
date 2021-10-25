package main.java.Exceptions;

//try catch finally
public class Test06 {
    public static int method() {
        int a = 10;
        try {
            throw new Exception();
//            a=20;
//            return a;
        } catch (Exception e) {
            a = 40;
            System.out.println("catch");
            return a;
        } finally {
            a=100;
            System.out.println("finally");
            return a;
        }
//        a=30;
//        System.out.println("after");
//        return a;
    }

    public static void main(String[] args) {
        System.out.println(method());
    }
}
