package example1;

/**
 * duck作为鸭子的父类,将quack和fly行为抽象成接口，在duck中加入两个接口的实例变量
 * 鸭子子类继承duck，并且在构造方法中利用多态实现quack和fly的不同实现
 */
public abstract class Duck {

    QuackBehavior quackBehavior;

    FlyBehavior flyBehavior;

    public void performQuack(){
        quackBehavior.quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void swim(){
        System.out.println("I'm swimming");
    }

    public abstract void display();

}
