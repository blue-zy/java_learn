package main.java.Exceptions;

import java.io.FileNotFoundException;

//异常处理方式
//编译期异常
public class Test03 {

    public static void readFile(String fileName) throws FileNotFoundException {
        if (!fileName.equals("c:\\\\a.txt")) {
            //抛出的是编译期异常 所以必须处理
            //要么抛出 要么捕获
            throw new FileNotFoundException("dir error");
        }
        System.out.println("dir right");
    }

    public static void readFile2(String fileName) {
        if (!fileName.equals("c:\\\\a.txt")) {
            //抛出的是编译期异常 所以必须处理
            //要么抛出 要么捕获
            try {
                throw new FileNotFoundException("dir error");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        System.out.println("由于捕获了 程序不会中断");
    }

    public static void main(String[] args) {
        //调用了一个声明抛出异常的方法 必须处理异常
        //要么抛出 要么捕获
//        readFile("a.txt");

        //调用的方法没有声明抛出异常 表示这个方法里面已经处理过了
//        readFile2("1");

    }
}
