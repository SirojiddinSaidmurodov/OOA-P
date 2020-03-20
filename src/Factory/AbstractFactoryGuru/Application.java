package Factory.AbstractFactoryGuru;

class Application {
    private GUIFactory factory;
    private Button button;
    private CheckBox checkBox;

    Application(GUIFactory f) {
        factory = f;
    }

    void createUI() {
        button = factory.createButton();
        checkBox = factory.createCheckBox();
    }

    void paint() {
        button.paint();
        checkBox.paint();
    }
}
