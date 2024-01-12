package creationalpattern.factorymethod;

import creationalpattern.factorymethod.factories.Dialog;
import creationalpattern.factorymethod.factories.HTMLDialog;
import creationalpattern.factorymethod.factories.WindowsDialog;

public class Main {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    public static void configure() {
        if (System.getProperty("os.name").equals("Windows 11")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HTMLDialog();
        }
    }

    public static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
