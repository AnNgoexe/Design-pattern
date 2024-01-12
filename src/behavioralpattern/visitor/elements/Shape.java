package behavioralpattern.visitor.elements;

import behavioralpattern.visitor.visitors.Visitor;

public interface Shape {
    void move(int x, int y);

    void draw();

    String accept(Visitor visitor);
}
