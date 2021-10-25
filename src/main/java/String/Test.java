package main.java.String;

public class Test {
    public static void main(String[] args) {
//        test01();
//        test02();
//        test03();
        test04();
    }

    public static void test01() {
        System.out.println("---test01---");
        String s0 = "hello";
        String s1 = "hello";
        String s2 = "he" + "llo";
        System.out.println(s0 == s1);
        System.out.println(s1 == s2);
    }

    public static void test02() {
        System.out.println("---test02---");
        String s0 = "hello";
        String s1 = new String("hello");
        String s2 = "he" + new String("llo");
        System.out.println(s0 == s1);
        System.out.println(s0 == s2);
        System.out.println(s1 == s2);
    }

    public static void test03() {
        System.out.println("---test03---");
        String s0 = "hello";
        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println(s0 == s1);
        System.out.println(s1 == s2);

        //intern方法可以扩充存在于class文件的常量池(运行期被jvm装载) 如果有相同的unicode字符串常量则返回 无则增加并返回新增的引用
        s1 = s1.intern();
        s2 = s2.intern();
        System.out.println(s0 == s1);
        System.out.println(s1 == s2);
    }

    public static void test04() {
        //intern是在常量池中增加并返回引用 并不是原先的引用
        System.out.println("---test04---");
        String s0 = new String("hello");
        String s1 = s0.intern();
        System.out.println(s1 == s0);
        System.out.println(s1 == s0.intern());
    }
}
