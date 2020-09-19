package CreationalPatterns.Factory.AbstractFactoryGuru;

class WinCheckBox implements CheckBox {

    @Override
    public void paint() {
        System.out.println("Windows CheckBox");
    }
}
