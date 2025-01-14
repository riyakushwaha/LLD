package Patterns.Observer.PullModel;

interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);

    void notifyObserver();
}
