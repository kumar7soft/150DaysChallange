package org.example.designpatterns.observable;

public class Youtube {

    public static void main(String[] args){

        Channel channel =new Channel();
        Subscriber kumar = new Subscriber("Kumar");
        Subscriber swamy = new Subscriber("Swamy");
        channel.subscribe(kumar);
        channel.subscribe(swamy);
        channel.upload("Learning Video");

    }
}
