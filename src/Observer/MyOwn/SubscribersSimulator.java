package Observer.MyOwn;

public class SubscribersSimulator {
    public static void main(String[] args) {
        Magazine playboy = new Magazine();
        new Subscriber(playboy, "Sergey");
        new Subscriber(playboy, "Dilafruz");
        new Subscriber(playboy, "Andrew");

        playboy.postMagazine("Influence of Java on mind");
        playboy.postMagazine("Russian producer works on Rush-Hour 4 without Jacky Chan");
        playboy.postMagazine("Zverev finally changes his sex!");
    }
}
