package creationalpattern.factorymethod.factories;

import creationalpattern.factorymethod.products.Button;

public abstract class Dialog {
    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
