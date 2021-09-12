package main.designPattern.Factory;


public class FactoryMethod {

    public static void main(String[] args) {
        Factory factoryA = new FactoryA();
        Factory factoryB = new FactoryB();
        factoryA.creatProduct().print();
        factoryB.creatProduct().print();

        Phone iphone = new FactoryA().creatProduct();
        Phone huaweiphone = new FactoryB().creatProduct();
        iphone.print();
        huaweiphone.print();
    }

}

/**
 * 抽象工厂类
 * 可定义为接口，扩展性更好
 */
abstract class Factory {
    public abstract Phone creatProduct();
}

/**
 * 具体工厂A
 */
class FactoryA extends Factory {
    @Override
    public Phone creatProduct() {
        return new Iphone();
    }
}

/**
 * 具体工厂B
 */
class FactoryB extends Factory {
    @Override
    public Phone creatProduct() {
        return new Huaweiphone();
    }
}

/**
 * 抽象产品类
 * 可定义为接口，扩展性更好
 */
abstract class Phone {
    public abstract void print();
}

/**
 * 具体产品类A
 */
class Iphone extends Phone {

    @Override
    public void print() {
        System.out.println("product iphone");
    }
}

/**
 * 具体产品类B
 */
class Huaweiphone extends Phone {

    @Override
    public void print() {
        System.out.println("product huaweiphone");
    }
}