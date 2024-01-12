package behavioralpattern.visitor.visitors;

import behavioralpattern.visitor.elements.Circle;
import behavioralpattern.visitor.elements.CompoundShape;
import behavioralpattern.visitor.elements.Dot;
import behavioralpattern.visitor.elements.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}
