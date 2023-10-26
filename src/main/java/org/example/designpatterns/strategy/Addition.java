package org.example.designpatterns.strategy;

 class Addition implements Strategy{
    @Override
    public int doOperation(int a, int b) {
        return a+b;
    }
}

class Substraction implements  Strategy{

    @Override
    public int doOperation(int a, int b) {
        return a-b;
    }
}

class Multiplication implements  Strategy{

    @Override
    public int doOperation(int a, int b) {
        return a*b;
    }
}

class  Division implements  Strategy{

    @Override
    public int doOperation(int a, int b) {
        return a/b;
    }
}