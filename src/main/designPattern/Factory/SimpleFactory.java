package main.designPattern.Factory;


/**
 * 工厂类
 * 根据传入参数来创建不同产品
 * 如果产品很多，或者新增产品，则修改工厂类很麻烦
 */
public class SimpleFactory {
    public static Product creatProduct(String type){
        if (type.equals("a")){
            return new ProductA();
        }else if(type.equals("b")){
            return new ProductB();
        }

        return null;
    }

    public static void main(String[] args) {
        Product product1 = SimpleFactory.creatProduct("a");
        Product product2 = SimpleFactory.creatProduct("b");
        product1.print();
        product2.print();
    }

}

/**
 * 产品类
 */
abstract class Product{
    public abstract void print();
}

/**
 * 具体产品类A
 */
class ProductA extends Product{

    @Override
    public void print() {
        System.out.println("product A");
    }
}

/**
 * 具体产品类B
 */
class ProductB extends Product{

    @Override
    public void print() {
        System.out.println("product B");
    }
}