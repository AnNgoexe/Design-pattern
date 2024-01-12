package behavioralpattern.interpretor.expressions;

import behavioralpattern.interpretor.context.Context;

public class CheckExpression implements Expression {
    public void interpretContext(Context context) {
        String aircraftModel = context.getModel();
        if (aircraftModel.startsWith("A") || aircraftModel.startsWith("B")) {
            if (aircraftModel.length() == 4 || aircraftModel.length() == 5) {
                context.setIsAircraft(true);
                System.out.println(aircraftModel + " is an aircraft...");
            } else {
                context.setIsAircraft(false);
                System.out.println(aircraftModel + " is not aircraft...");
            }
        } else {
            context.setIsAircraft(false);
            System.out.println(aircraftModel + " is not aircraft...");
        }
    }
}
