package structuralpattern.facade.facade2;

public class Blackberry implements Mobile {
    private String model;

    private double price;

    private String features;

    public Blackberry(String model, double price, String features) {
        this.model = model;
        this.price = price;
        this.features = features;
    }

    @Override
    public void modelNo() {
        System.out.println("Blackberry Model No: " + this.model);
    }

    @Override
    public void price() {
        System.out.println("Price: " + this.price);
    }

    @Override
    public void displayFeatures() {
        System.out.println("Features: " + this.features);
    }
}

