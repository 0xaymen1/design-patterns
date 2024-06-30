package src.behavioral.strategy;

import src.behavioral.strategy.behaviors.fly.FlyWithWings;

public class StrategyPattern {

    public static void main(String[] args) {
        Duck red_duck = new RedDucks();
        red_duck.setFlyBehavior(new FlyWithWings());
        red_duck.performFly();


        System.out.println("///////////////////////////////////////");
        System.out.println("END");
        System.out.println("///////////////////////////////////////");


//        Jvm.print_to_console("JAVA APP STARTED");
//        var duck = new RedDucks();
//        duck.display();
//        duck.swim();
//        duck.change_state();
//        Jvm.print_to_console(duck.variable);
//        duck.quack();
    }
}
