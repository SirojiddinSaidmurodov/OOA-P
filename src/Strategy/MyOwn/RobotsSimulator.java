package Strategy.MyOwn;

class RobotsSimulator {
    public static void main(String[] args) {
        Robot carrier = new PackageCarrier();
        carrier.display();
        carrier.performMoveTo("Storage");
        carrier.performWorkOn("Coca-cola");
        Robot soldier = new ArmyBot();
        soldier.display();
        System.out.println("Make the world on peace");
        soldier.setWorkBehavior(new Clean());
        soldier.performWorkOn("Room");
    }
}
