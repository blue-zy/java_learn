package main.designPattern.Factory;


public class FactoryMethod {

    public static void main(String[] args) {
        AbstractFactory2 factory2A = new Factory2A();
        AbstractFactory2 factory2B = new Factory2B();
        factory2A.creatProduct().print();
        factory2B.creatProduct().print();

        Product2 product2A = new Factory2A().creatProduct();
        Product2 product2B = new Factory2B().creatProduct();
        product2A.print();
        product2B.print();
    }

}

/**
 * 抽象工厂类
 * 可定义为接口，扩展性更好
 */
abstract class AbstractFactory2 {
    public abstract Product2 creatProduct();
}

/**
 * 具体工厂A
 */
class Factory2A extends AbstractFactory2 {
    @Override
    public Product2 creatProduct() {
        return new Product2A();
    }
}

/**
 * 具体工厂B
 */
class Factory2B extends AbstractFactory2 {
    @Override
    public Product2 creatProduct() {
        return new Product2B();
    }
}

/**
 * 抽象产品类
 * 可定义为接口，扩展性更好
 */
abstract class Product2 {
    public abstract void print();
}

/**
 * 具体产品类A
 */
class Product2A extends Product2 {

    @Override
    public void print() {
        System.out.println("product A");
    }
}

/**
 * 具体产品类B
 */
class Product2B extends Product2 {

    @Override
    public void print() {
        System.out.println("product B");
    }
}