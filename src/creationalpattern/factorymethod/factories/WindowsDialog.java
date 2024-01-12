package creationalpattern.factorymethod.factories;

import creationalpattern.factorymethod.products.Button;
import creationalpattern.factorymethod.products.WindowsButton;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
