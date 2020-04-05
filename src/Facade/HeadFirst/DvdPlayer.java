package Facade.HeadFirst;

class DvdPlayer {
    Amplifier amplifier;

    public void setAmplifier(Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    public void on() {
        System.out.println("DVD-player on");
    }

    public void off() {
        System.out.println("DVD-player off");
    }

    public void eject() {
        System.out.println("DVD-player ejecting disk");
    }

    public void play(String movie) {
        System.out.println("DVD-player playing \"" + movie + "\"");
    }

    public void pause() {

    }
}
