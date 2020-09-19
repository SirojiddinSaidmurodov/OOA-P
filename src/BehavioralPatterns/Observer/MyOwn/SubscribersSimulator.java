package BehavioralPatterns.Observer.MyOwn;

class SubscribersSimulator {
    public static void main(String[] args) {
        Magazine magazine = new Magazine();
        Magazine.InnerObservable playboy = magazine.getInnerObservable();
        new Subscriber(playboy, "Sergey");
        new Subscriber(playboy, "Dilafruz");
        new Subscriber(playboy, "Andrew");

        playboy.postMagazine("Influence of Java on mind");
        playboy.postMagazine("Russian producer works on Rush-Hour 4 without Jacky Chan");
        playboy.postMagazine("Zverev finally changes his sex!");
    }
}
