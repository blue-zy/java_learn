package main.designPattern.Factory;


/**
 * 工厂类
 * 根据传入参数来创建不同产品
 * 如果产品很多，或者新增产品，则修改工厂类很麻烦
 */
public class SimpleFactory {
    public static Product1 creatProduct(String type){
        if (type.equals("a")){
            return new Product1A();
        }else if(type.equals("b")){
            return new Product1B();
        }

        return null;
    }

    public static void main(String[] args) {
        Product1 product1 = SimpleFactory.creatProduct("a");
        Product1 product2 = SimpleFactory.creatProduct("b");
        product1.print();
        product2.print();
    }

}

/**
 * 抽象产品类
 * 可定义为接口，扩展性更好
 */
abstract class Product1{
    public abstract void print();
}

/**
 * 具体产品类A
 */
class Product1A extends Product1{

    @Override
    public void print() {
        System.out.println("product A");
    }
}

/**
 * 具体产品类B
 */
class Product1B extends Product1{

    @Override
    public void print() {
        System.out.println("product B");
    }
}