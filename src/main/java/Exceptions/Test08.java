package main.java.Exceptions;

//自定义异常
//一般两个构造方法
public class Test08 {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        throw new RegisterException2();
    }
}


//继承自Exception就是编译时异常
class RegisterException extends Exception {

    public RegisterException() {
    }

    public RegisterException(String message) {
        super(message);
    }
}

//继承自RuntimeException就是运行时异常
class RegisterException2 extends RuntimeException {

    public RegisterException2() {
    }

    public RegisterException2(String message) {
        super(message);
    }
}