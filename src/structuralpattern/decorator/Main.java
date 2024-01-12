package structuralpattern.decorator;

import structuralpattern.decorator.components.Employee;
import structuralpattern.decorator.components.EmployeeConcrete;
import structuralpattern.decorator.decorators.Manager;
import structuralpattern.decorator.decorators.TeamLeader;

public class Main {

    public static void main(String[] args) {
        System.out.println("NORMAL EMPLOYEE: ");
        Employee employee = new EmployeeConcrete("GPCoder");
        employee.showBasicInformation();
        employee.doTask();

        System.out.println("\nTEAM LEADER: ");
        Employee teamLeader = new TeamLeader(employee);
        teamLeader.showBasicInformation();
        teamLeader.doTask();

        System.out.println("\nMANAGER: ");
        Employee manager = new Manager(employee);
        manager.showBasicInformation();
        manager.doTask();

        System.out.println("\nTEAM LEADER AND MANAGER: ");
        Employee teamLeaderAndManager = new Manager(teamLeader);
        teamLeaderAndManager.showBasicInformation();
        teamLeaderAndManager.doTask();
    }
}
