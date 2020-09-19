package StructuralPatterns.Facade.HeadFirst;

class HomeTheaterSimple {
    public static void main(String[] args) {
        PopcornPopper popper = new PopcornPopper();
        TheaterLights lights = new TheaterLights();
        Screen screen = new Screen();
        Projector projector = new Projector();
        DvdPlayer dvdPlayer = new DvdPlayer();
        Amplifier amp = new Amplifier();
        Tuner tuner = new Tuner();
        CdPlayer cdPlayer = new CdPlayer();

        HomeTheaterFacade facade = new HomeTheaterFacade(
                amp,
                tuner,
                dvdPlayer,
                cdPlayer,
                projector,
                popper,
                screen,
                lights);
        facade.watchMovie("Supreme of Borne");
        System.out.println("************* A few moments later **************");
        facade.endMovie();
    }
}
