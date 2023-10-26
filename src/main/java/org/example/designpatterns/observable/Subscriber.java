package org.example.designpatterns.observable;

public class Subscriber implements Observer {

    private String name ;

    private Channel channel;

    public Subscriber(String name){
        this.name=name;
    }
    @Override
    public void update(){
        System.out.println("Name of the subscriber :"+name+"  Video is uploaded");
    }
}
