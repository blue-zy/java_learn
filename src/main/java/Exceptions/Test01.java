package main.java.Exceptions;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//异常处理方式
public class Test01 {
    public static void main(String[] args) throws ParseException {
//        test01();
        test02();
    }


    public static void test01() throws ParseException {
        //抛出异常 交给jvm处理 jvm处理方式就是中断
        System.out.println("hello");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = simpleDateFormat.parse("1000-2222");
        System.out.println("中断了 无法打印");
    }

    public static void test02() {
        //捕获异常 手动处理异常
        System.out.println("hello");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = simpleDateFormat.parse("1000-2222");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("不会中断了 可以打印");
    }
}
