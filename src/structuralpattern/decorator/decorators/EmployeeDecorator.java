package structuralpattern.decorator.decorators;

import structuralpattern.decorator.components.Employee;

import java.util.Date;

public abstract class EmployeeDecorator implements Employee {
    protected Employee employee;

    protected EmployeeDecorator(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String getName() {
        return employee.getName();
    }

    @Override
    public void join(Date joinDate) {
        employee.join(joinDate);
    }

    @Override
    public void terminate(Date terminateDate) {
        employee.terminate(terminateDate);
    }
}
