package main.java.Object;

public class Test02 implements Cloneable {
    public static void main(String[] args) throws CloneNotSupportedException {
        Test02 test02 = new Test02();
        test02.clone();

        //会报错 因为clone是protected方法 而且还与Object类跨包 所以只能自己本身访问
        Test022 test022 = new Test022();
//        test022.clone();
    }
}


class Test022 implements Cloneable{
    public void test() throws CloneNotSupportedException {
        Test022 test022 = new Test022();
        test022.clone();
    }
}