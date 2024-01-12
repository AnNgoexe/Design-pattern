package behavioralpattern.interpretor.expressions;

import behavioralpattern.interpretor.context.Context;

public class TypeExpression implements Expression {
    public void interpretContext(Context context) {
        if (context.getIsAircraft()) {
            String acModel = context.getModel();
            if (context.getLength() == 5 && context.getLastChar().equals("F")) {
                System.out.println("Aircraft type is Cargo/Freighter");
            } else {
                System.out.println("Aircraft type is Passenger Transportation");
            }
        } else {
            System.out.println("Type could not be interpreted");
        }
    }
}
