package creationalpattern.abstractfactory.product2;

public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}
