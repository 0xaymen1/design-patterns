package src.behavioral.strategy.behaviors.fly;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("flying with wings <<<<");
    }
}
