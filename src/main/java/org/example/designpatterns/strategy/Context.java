package org.example.designpatterns.strategy;

public class Context {
    private Strategy strategy;
    public Context(Strategy strategy){
        this.strategy=strategy;
    }

    public void executeStrategy(int a ,int b){
        int st = strategy.doOperation(a, b);
        System.out.println(st);
    }
}
