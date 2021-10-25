package main.java.Exceptions;

//子父类异常
//父类异常范围要比子类异常范围大
public class Test07 {
    public static void main(String[] args) {

    }
}


class Parent {
    public void show01() throws NullPointerException,ClassNotFoundException {

    }

    public void show02() throws IndexOutOfBoundsException {

    }

    public void show03() throws IndexOutOfBoundsException {

    }

    public void show04() {

    }
}

class Child extends Parent {
    @Override
    public void show01() throws NullPointerException, ClassNotFoundException {
        super.show01();
    }

    @Override
    public void show02() throws ArrayIndexOutOfBoundsException {
        super.show02();
    }

    @Override
    public void show03() {
        super.show03();
    }

    @Override
    public void show04() {
        //只能捕获
        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}