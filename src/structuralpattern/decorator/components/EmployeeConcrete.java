package structuralpattern.decorator.components;

import java.util.Date;

public class EmployeeConcrete implements Employee {
    private String name;

    public EmployeeConcrete(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void join(Date joinDate) {
        System.out.println(this.getName() + " joined on " + formatDate(joinDate));
    }

    @Override
    public void terminate(Date terminateDate) {
        System.out.println(this.getName() + " terminated on " + formatDate(terminateDate));
    }

    @Override
    public void doTask() {
        System.out.println(this.getName() + " worked.");
    }
}
