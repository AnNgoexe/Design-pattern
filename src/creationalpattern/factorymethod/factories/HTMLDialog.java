package creationalpattern.factorymethod.factories;

import creationalpattern.factorymethod.products.Button;
import creationalpattern.factorymethod.products.HTMLButton;

public class HTMLDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HTMLButton();
    }
}
