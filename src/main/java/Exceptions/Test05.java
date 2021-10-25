package main.java.Exceptions;

import java.io.IOException;

//finally
public class Test05 {

    public static void read(String name) throws IOException {
        if (!name.equals("c:\\\\a.txt")) {
            throw new IOException("file name error");
        }
    }

    public static void main(String[] args) {
        try {
//            read("c:\\\\a.txt");
            read("a");
            System.out.println("try after exception");
            return ;
        } catch (IOException e) {
//            e.printStackTrace();
            System.out.println("catch");

        } finally {
            //无论是否出现异常都会执行
            //一般用于资源释放
            System.out.println("finally");
            return;
        }

//        System.out.println("after");
    }
}
