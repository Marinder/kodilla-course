package com.kodilla.patterns2.observer.homework;

public interface HomeworkObservable {
    void registerObserver(HomeworkObserver HomeworkObserver);
    void notifyObservers();
    void removeObserver(HomeworkObserver HomeworkObserver);
}
