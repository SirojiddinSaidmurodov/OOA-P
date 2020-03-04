package Observer.MyOwn;

import java.util.Observable;
import java.util.Observer;
import java.util.Random;

class Subscriber implements Observer {
    Observable observable;
    String content;
    String name;

    public Subscriber(Observable observable, String name) {
        this.observable = observable;
        this.name = name;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Magazine) {
            Magazine magazine = (Magazine) o;
            this.content = magazine.getRelease();
            makeReview();
        }
    }

    public void makeReview() {
        String[] opinions = {"perfect", "good", "not bad", "crazy", "awesome", "amazing"};
        Random random = new Random();
        System.out.println(name + " thinks that article \"" + content + "\" is " + opinions[random.nextInt(opinions.length)]);
    }
}
