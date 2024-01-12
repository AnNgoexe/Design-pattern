package behavioralpattern.interpretor.expressions;

import behavioralpattern.interpretor.context.Context;

public class BrandExpression implements Expression {
    @Override
    public void interpretContext(Context context) {
        if (context.getIsAircraft()) {
            if (context.getFirstChar().equals("A"))
                System.out.println("Brand is Airbus");
            else if (context.getFirstChar().equals("B"))
                System.out.println("Brand is Boeing");
        } else {
            System.out.println("Brand could not be interpreted");
        }
    }
}
