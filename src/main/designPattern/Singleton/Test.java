package main.designPattern.Singleton;

public class Test {
    public static void main(String[] args) {
        System.out.println(classLoaderTest1.a);
    }
}

class classLoaderTest1{

    public static int a = 100;
    static {
        System.out.println("classLoaderTest1");
    }
    private static class classLoaderTest1Holder {
        static {
            System.out.println("classLoaderTest1Holder");
        }
//        private static final classLoaderTest1 INSTANCE = new classLoaderTest1();
                private static final classLoaderTest1 INSTANCE = null;

    }

    private classLoaderTest1(){

    }

    public static final classLoaderTest1 getInstance(){
        return classLoaderTest1Holder.INSTANCE;
    }
}


