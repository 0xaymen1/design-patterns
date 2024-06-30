package src.behavioral.strategy;

import src.oop.Jvm;

public class RedDucks extends Duck {

    public void change_state(){
        super.variable++;
    }
    @Override
    public void swim() {
        Jvm.print_to_console("swimming\uD83C\uDFCA");
    }

}
