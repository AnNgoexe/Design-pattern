package creationalpattern.abstractfactory.factories;

import creationalpattern.abstractfactory.product2.Button;
import creationalpattern.abstractfactory.product2.WindowsButton;
import creationalpattern.abstractfactory.product1.Checkbox;
import creationalpattern.abstractfactory.product1.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
