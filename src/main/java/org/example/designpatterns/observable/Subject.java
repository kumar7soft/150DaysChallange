package org.example.designpatterns.observable;

public interface Subject {
    void subscribe(Subscriber sub);

    void unSubscribe(Subscriber sub);

    void notifyToTheSubscriber();

    void upload(String title);
}
