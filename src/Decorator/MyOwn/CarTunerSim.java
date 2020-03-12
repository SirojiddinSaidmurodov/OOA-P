package Decorator.MyOwn;

class CarTunerSim {
    public static void main(String[] args) {
        Porsche911 porsche911 = new Porsche911();
        System.out.println(porsche911);
        System.out.println(new TurboCharging(new LiteUp(new ReplaceEngine(porsche911))));
    }
}
