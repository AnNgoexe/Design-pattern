package structuralpattern.proxy;

import structuralpattern.proxy.proxy.Proxy;

public class Main {
    public static void main(String[] args) {
        System.out.println("Init proxy image: ");
        Proxy proxyImage = new Proxy("http://gpcoder.com/favicon.ico");

        System.out.println("---");
        System.out.println("Call real service 1st: ");
        proxyImage.showImage();

        System.out.println("---");
        System.out.println("Call real service 2nd: ");
        proxyImage.showImage();
    }
}
