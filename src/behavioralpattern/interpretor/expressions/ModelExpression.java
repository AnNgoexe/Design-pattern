package behavioralpattern.interpretor.expressions;

import behavioralpattern.interpretor.context.Context;

public class ModelExpression implements Expression {
    public void interpretContext(Context context) {
        if (context.getIsAircraft()) {
            System.out.println("Model is : " + context.getModel().substring(1, 4));
        } else {
            System.out.println("Model could not be interpreted");
        }
    }
}
