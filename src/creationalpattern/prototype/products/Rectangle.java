package creationalpattern.prototype.products;

public class Rectangle extends Shape {
    public int width;

    public int height;

    public Rectangle() {

    }

    public Rectangle(Rectangle target) {
        super(target);
        if (target != null) {
            this.width = target.width;
            this.height = target.height;
        }
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object otherShape) {
        if (!(otherShape instanceof Rectangle) || !super.equals(otherShape)) {
            return false;
        }
        Rectangle shape2 = (Rectangle) otherShape;
        return shape2.width == width && shape2.height == height;
    }
}
