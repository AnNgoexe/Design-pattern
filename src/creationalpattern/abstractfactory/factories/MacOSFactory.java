package creationalpattern.abstractfactory.factories;

import creationalpattern.abstractfactory.product2.Button;
import creationalpattern.abstractfactory.product2.MacOSButton;
import creationalpattern.abstractfactory.product1.Checkbox;
import creationalpattern.abstractfactory.product1.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
