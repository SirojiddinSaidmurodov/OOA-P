package StructuralPatterns.Facade.HeadFirst;

class HomeTheater {
    public static void main(String[] args) {
        PopcornPopper popper = new PopcornPopper();
        TheaterLights lights = new TheaterLights();
        Screen screen = new Screen();
        Projector projector = new Projector();
        DvdPlayer dvdPlayer = new DvdPlayer();
        Amplifier amp = new Amplifier();


        popper.on();
        popper.off();

        lights.dim(10);

        screen.down();

        projector.on();
        projector.setInput(dvdPlayer);
        projector.wideScreenMode();

        amp.on();
        amp.setDvdPlayer(dvdPlayer);
        amp.setSurround();
        amp.setVolume(15);

        dvdPlayer.on();
        dvdPlayer.play("Supreme of Borne");
    }
}
