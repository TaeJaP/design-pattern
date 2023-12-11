package example1;

public class MallardDuck extends Duck{

    public MallardDuck() {
        //多态
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm real a mallard duck");
    }
}
