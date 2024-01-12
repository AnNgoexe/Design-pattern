package creationalpattern.abstractfactory.product1;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox.");
    }
}
