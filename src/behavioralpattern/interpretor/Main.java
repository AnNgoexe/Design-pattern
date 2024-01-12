package behavioralpattern.interpretor;

import behavioralpattern.interpretor.context.Context;
import behavioralpattern.interpretor.expressions.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void Main(String[] args) {

        List<Context> listAircrafts = new ArrayList<Context>();
        List<Expression> listExpressions = new ArrayList<Expression>();

        listAircrafts.add(new Context("A330"));
        listAircrafts.add(new Context("A330F"));
        listAircrafts.add(new Context("B777"));
        listAircrafts.add(new Context("B777F"));
        listAircrafts.add(new Context("TheCode"));

        listExpressions.add(new CheckExpression());
        listExpressions.add(new BrandExpression());
        listExpressions.add(new ModelExpression());
        listExpressions.add(new TypeExpression());

        for (int ac_index = 0; ac_index < listAircrafts.size(); ac_index++)
        {
            for (int exp_index = 0; exp_index < listExpressions.size(); exp_index++)
            {
                listExpressions.get(exp_index).interpretContext(listAircrafts.get(ac_index));
            }
            System.out.println("-----------------------------------");
        }
    }
}
