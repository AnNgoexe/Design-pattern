package creationalpattern.abstractfactory;

import creationalpattern.abstractfactory.factories.GUIFactory;
import creationalpattern.abstractfactory.factories.MacOSFactory;
import creationalpattern.abstractfactory.factories.WindowsFactory;

public class Main {
    private static Application configureApplication() {
        GUIFactory factory;

        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }

        Application app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
