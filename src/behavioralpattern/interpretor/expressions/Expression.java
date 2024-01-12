package behavioralpattern.interpretor.expressions;

import behavioralpattern.interpretor.context.Context;

public interface Expression {
    public void interpretContext(Context context);
}
