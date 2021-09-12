package main.designPattern.Factory;

public class AbstractFactory {
    public static void main(String[] args) {
        FatherFactory sonFactory = new SonFactoryA();
        sonFactory.createProductA().print();
        sonFactory.createProductB().print();

        FatherProductA sonProductA = new SonFactoryA().createProductA();
        FatherProductB sonProductB = new SonFactoryA().createProductB();
        sonProductA.print();
        sonProductB.print();
    }
}

/**
 * 抽象工厂类
 * 用接口扩展更好
 */
abstract class FatherFactory {
    public abstract FatherProductA createProductA();
    public abstract FatherProductB createProductB();
}

/**
 * 具体工厂类
 * 此工厂可以生产不止一种大类产品
 */
class SonFactoryA extends FatherFactory {

    @Override
    public FatherProductA createProductA() {
        return new SonProductA();
    }

    @Override
    public FatherProductB createProductB() {
        return new SonProductB();
    }
}


/**
 * 抽象产品类
 * 用接口扩展更好
 */
abstract class FatherProductA {
    public abstract void print();
}


/**
 * 抽象产品类
 * 用接口扩展更好
 */
abstract class FatherProductB {
    public abstract void print();
}

/**
 * 具体产品类
 */
class SonProductA extends FatherProductA {

    @Override
    public void print() {
        System.out.println("product A");
    }
}

/**
 * 具体产品类
 */
class SonProductB extends FatherProductB {

    @Override
    public void print() {
        System.out.println("product B");
    }
}
