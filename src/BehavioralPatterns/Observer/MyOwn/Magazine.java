package BehavioralPatterns.Observer.MyOwn;

import java.util.Observable;

class Magazine {
    String release;
    private final InnerObservable innerObservable;

    public InnerObservable getInnerObservable() {
        return innerObservable;
    }

    public Magazine() {
        innerObservable = new InnerObservable();
    }

    public String getRelease() {
        return innerObservable.getRelease();
    }

    public void postMagazine(String article) {
        release = article;
        innerObservable.postMagazine(article);
    }

    public void newRelease() {
        innerObservable.newReleased();
    }


    public class InnerObservable extends Observable {
        String release;

        public void newReleased() {
            setChanged();
            notifyObservers(Magazine.this);
        }

        public void postMagazine(String article) {
            release = article;
            newReleased();
        }

        public String getRelease() {
            return release;
        }
    }
}
