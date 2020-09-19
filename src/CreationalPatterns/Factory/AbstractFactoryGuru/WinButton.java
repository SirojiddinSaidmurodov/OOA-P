package CreationalPatterns.Factory.AbstractFactoryGuru;

class WinButton implements Button {

    @Override
    public void paint() {
        System.out.println("Windows Button");
    }
}
