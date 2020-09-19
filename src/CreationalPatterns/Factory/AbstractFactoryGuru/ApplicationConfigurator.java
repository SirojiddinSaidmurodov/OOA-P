package CreationalPatterns.Factory.AbstractFactoryGuru;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ApplicationConfigurator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input your OS: ");
        String config = reader.readLine();
        GUIFactory factory = null;
        if (config.equals("Mac")) {
            factory = new MacFactory();
        } else if (config.equals("Win")) {
            factory = new WinFactory();
        }
        Application application = new Application(factory);
        application.createUI();
        application.paint();
    }
}
