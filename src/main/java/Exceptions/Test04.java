package main.java.Exceptions;

import java.io.IOException;
import java.sql.SQLException;

//捕获异常1
public class Test04 {

    public static void read(String name) throws IOException {
        if (!name.equals("c:\\\\a.txt")) {
            throw new IOException("file name error");
        }
    }

    public static void main(String[] args) {
        try {
            read("a");
        } catch (IOException e) {
//            System.out.println("catch code");
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        } catch (Exception e) {
            //多个catch 后面的catch的范围必须比前面的大
        }

        System.out.println("后续代码");
    }
}
