package org.example.designpatterns.strategy;

public class StrategyPatternDemo {

    public static void main(String[] args){

        Context context = new Context(new Addition());
        context.executeStrategy(10,10);
    }
}
