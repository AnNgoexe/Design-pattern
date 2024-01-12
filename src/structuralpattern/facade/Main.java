package structuralpattern.facade;

import structuralpattern.facade.facade1.ShopKeeper;

public class Main {
    public static void main(String[] args) {
        ShopKeeper shopKeeper = new ShopKeeper();

        System.out.println("***** Sale of iPhone *****");
        shopKeeper.iphoneSale();
        System.out.println();

        System.out.println("***** Sale of Samsung *****");
        shopKeeper.samsungSale();
        System.out.println();

        System.out.println("***** Sale of Blackberry *****");
        shopKeeper.blackberrySale();
    }
}
