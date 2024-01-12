package creationalpattern.prototype.products;

public class Circle extends Shape {
    protected int radius;

    public Circle() {

    }

    public Circle(Circle target) {
        super(target);
        if (target != null) {
            this.radius = target.radius;
        }
    }

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object otherShape) {
        if (!(otherShape instanceof Circle) || !super.equals(otherShape)) {
            return false;
        }
        Circle circle = (Circle) otherShape;
        return circle.radius == this.radius;
    }
}
