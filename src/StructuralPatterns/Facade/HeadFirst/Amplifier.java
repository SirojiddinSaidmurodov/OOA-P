package StructuralPatterns.Facade.HeadFirst;

class Amplifier {
    Tuner tuner;
    DvdPlayer dvdPlayer;
    CdPlayer cdPlayer;

    public void setDvdPlayer(DvdPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
        System.out.println("Setting up DVD-player");
    }

    public void setCdPlayer(CdPlayer cdPlayer) {
        this.cdPlayer = cdPlayer;
    }

    public void setSurround() {
        System.out.println("Setting up 5.1-surround sound on");
    }

    public void setVolume(int volume) {
        System.out.println("Setting volume to " + volume);
    }

    public void on() {
        System.out.println("Amplifier on");
    }

    public void off() {
        System.out.println("Amplifier off");
    }

    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
    }

}
