package com.snbc.designer;

/**
 * 工厂模式讲解
 * <p>
 * author: zhougaoxiong
 * date: 2021/6/8,14:06
 * projectName:Temp1
 * packageName:com.snbc.apptest
 */
class Factory {


    public abstract class Product {
        public abstract void method();
    }

    public class CreateProductA extends Product {
        @Override
        public void method() {
            System.out.println("CreateProductA");
        }
    }

    public class CreateProductB extends Product {
        @Override
        public void method() {
            System.out.println("CreateProductB");
        }
    }

    /**
     * 普通工厂模式,每一个子类自己实现
     */
    public abstract class Factoryy {
        public abstract Product createProduct();
    }

    public class FactoryyA extends Factoryy {

        @Override
        public Product createProduct() {
            return new CreateProductA();
        }
    }

    public class FactoryyB extends Factoryy {

        @Override
        public Product createProduct() {
            return new CreateProductB();
        }
    }

    //客户端,要生产东西
    public class Client {
        public void main(String[] args) {
            FactoryyA factoryyA = new FactoryyA();
            Product product = factoryyA.createProduct();
            product.method();

            FactoryyB factoryyB = new FactoryyB();
            Product productB = factoryyB.createProduct();
            productB.method();
        }
    }

    /**
     * 改进式工厂模式
     * <p>
     * 注意此处和上边的对比:
     * 1.上边是一个工厂生产一种产品,自己规定好,创建好自己的类,繁琐.
     * 2.这里是运用了泛型,一个子类都可以生产很多种类型的产品,这就是泛型的好处,简洁,动态
     * 3.其实可以把具体实现类中的方法写到抽象的父类中的
     */
    public abstract class Factoryyy {
        public abstract <T extends Product> T createProduct(Class<T> cls);
    }

    public class CreateFactory extends Factoryyy {
        @Override
        public <T extends Product> T createProduct(Class<T> cls) {
            Product product = null;
            try {
                product = (Product) Class.forName(cls.getName()).newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return (T) product;
        }
    }

    //客户端,要生产东西
    public class Clientt {
        public void main(String[] args) {
            CreateFactory createFactory = new CreateFactory();

            CreateProductA product = createFactory.createProduct(CreateProductA.class);
            product.method();

            CreateProductB productB = createFactory.createProduct(CreateProductB.class);
            productB.method();
        }
    }

}
