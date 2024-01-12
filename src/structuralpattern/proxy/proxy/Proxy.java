package structuralpattern.proxy.proxy;

import structuralpattern.proxy.service.Image;
import structuralpattern.proxy.service.RealImage;

public class Proxy implements Image {
    private Image realImage;
    private String url;

    public Proxy(String url) {
        this.url = url;
        System.out.println("Image unloaded: " + this.url);
    }

    @Override
    public void showImage() {
        if (realImage == null) {
            realImage = new RealImage(this.url);
        } else {
            System.out.println("Image already existed: " + this.url);
        }
        realImage.showImage();
    }
}
