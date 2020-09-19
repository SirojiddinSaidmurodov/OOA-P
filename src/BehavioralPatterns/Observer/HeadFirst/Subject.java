package BehavioralPatterns.Observer.HeadFirst;

interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
