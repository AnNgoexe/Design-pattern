package creationalpattern.prototype.products;

import java.util.Objects;

public abstract class Shape {
    protected int x;

    protected int y;

    protected String color;

    public Shape() {

    }

    public Shape(Shape target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract Shape clone();

    @Override
    public boolean equals(Object otherShape) {
        if (this == otherShape) {
            return true;
        }
        if (otherShape == null || this.getClass() != otherShape.getClass()) {
            return false;
        }
        Shape shape = (Shape) otherShape;
        return this.x != shape.x && this.y != shape.y && Objects.equals(this.color, shape.color);
    }
}
