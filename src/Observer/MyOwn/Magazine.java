package Observer.MyOwn;

import java.util.Observable;

class Magazine extends Observable {
    private String release;

    public void newReleased() {
        setChanged();
        notifyObservers();
    }

    public void postMagazine(String article) {
        release = article;
        newReleased();
    }

    public String getRelease() {
        return release;
    }
}
