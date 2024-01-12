package structuralpattern.facade.facade1;

import structuralpattern.facade.facade2.Blackberry;
import structuralpattern.facade.facade2.Iphone;
import structuralpattern.facade.facade2.Mobile;
import structuralpattern.facade.facade2.Samsung;

public class ShopKeeper {
    private Mobile iphone;

    private Mobile samsung;

    private Mobile blackberry;

    public ShopKeeper() {
        iphone = new Iphone("iPhone 13", 999.99, "iOS, A15 Bionic chip");
        samsung = new Samsung("Galaxy S21", 899.99, "Android, Exynos 2100 chip");
        blackberry = new Blackberry("Key2", 699.99, "Android, Physical Keyboard");
    }

    public void iphoneSale() {
        System.out.println("iPhone details:");
        iphone.modelNo();
        iphone.price();
        iphone.displayFeatures();
    }

    public void samsungSale() {
        System.out.println("Samsung details:");
        samsung.modelNo();
        samsung.price();
        samsung.displayFeatures();
    }

    public void blackberrySale() {
        System.out.println("Blackberry details:");
        blackberry.modelNo();
        blackberry.price();
        blackberry.displayFeatures();
    }
}