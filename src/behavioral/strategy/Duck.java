package src.behavioral.strategy;

import src.behavioral.strategy.behaviors.fly.FlyBehavior;
import src.oop.Jvm;

public class Duck {

    private FlyBehavior flyBehavior;

    public float variable = 2.00f;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    void performFly(){
        flyBehavior.fly();
    }
    void quack() {
        System.out.println("quacking... ");
    }

     void swim() {
        System.out.println("swimming... ");
    }

     public void display() {
        Jvm.print_to_console("displying...");
    }
}
