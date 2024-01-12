package creationalpattern.abstractfactory.product1;

public class MacOSCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox.");
    }
}
