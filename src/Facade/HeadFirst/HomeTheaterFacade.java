package Facade.HeadFirst;

class HomeTheaterFacade {
    Amplifier amplifier;
    Tuner tuner;
    DvdPlayer dvdPlayer;
    CdPlayer cdPlayer;
    Projector projector;
    PopcornPopper popper;
    Screen screen;
    TheaterLights lights;

    public HomeTheaterFacade(Amplifier amplifier,
                             Tuner tuner,
                             DvdPlayer dvdPlayer,
                             CdPlayer cdPlayer,
                             Projector projector,
                             PopcornPopper popper,
                             Screen screen,
                             TheaterLights lights) {
        this.amplifier = amplifier;
        this.tuner = tuner;
        this.dvdPlayer = dvdPlayer;
        this.cdPlayer = cdPlayer;
        this.projector = projector;
        this.popper = popper;
        this.screen = screen;
        this.lights = lights;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch movie...");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setDvdPlayer(dvdPlayer);
        amplifier.setSurround();
        amplifier.setVolume(15);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting theater down...");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amplifier.off();
        dvdPlayer.eject();
        dvdPlayer.off();
    }
}
