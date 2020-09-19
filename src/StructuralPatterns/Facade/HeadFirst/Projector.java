package StructuralPatterns.Facade.HeadFirst;

class Projector {
    DvdPlayer dvdPlayer;

    public void on() {
        System.out.println("Projector on");
    }

    public void off() {
        System.out.println("Projector off");
    }

    public void tvMode() {
        System.out.println("Projector in TV mode");
    }

    public void wideScreenMode() {
        System.out.println("Projector in wide screen mode");
    }

    public void setInput(DvdPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
    }
}
