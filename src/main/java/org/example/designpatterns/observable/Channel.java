package org.example.designpatterns.observable;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {

    List<Subscriber> subscriberList =new ArrayList<>();

    private String title ;

    @Override
    public void subscribe(Subscriber sub){
        subscriberList.add(sub);
    }

    @Override
    public void unSubscribe(Subscriber sub){
        subscriberList.remove(sub);
    }

    @Override
    public void notifyToTheSubscriber(){
        for(Subscriber sub : subscriberList){
            sub.update();
        }
    }

    @Override
    public void upload(String title){
        this.title =title;
        notifyToTheSubscriber();
    }
}
