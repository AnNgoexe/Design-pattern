package creationalpattern.abstractfactory.factories;

import creationalpattern.abstractfactory.product2.Button;
import creationalpattern.abstractfactory.product1.Checkbox;

public interface GUIFactory {
    Button createButton();

    Checkbox createCheckbox();
}
