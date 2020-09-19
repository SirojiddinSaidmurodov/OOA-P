package StructuralPatterns.Facade.HeadFirst;

class TheaterLights {
    public void on() {
        System.out.println("Theater Lights on");
    }

    public void off() {
        System.out.println("Theater Lights off");
    }

    public void dim(int dim) {
        System.out.println("Theater Ceiling Lights dimming " + dim + "%");
    }
}
