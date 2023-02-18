package abstractFactory.projects;

import abstractFactory.Developer;
import abstractFactory.ProjectManager;
import abstractFactory.ProjectTeamFactory;
import abstractFactory.Tester;
import abstractFactory.banking.BankingTeamFactory;

public class BankingProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeam = new BankingTeamFactory();
        Developer developer = projectTeam.getDeveloper();
        Tester tester = projectTeam.getManualTester();
        ProjectManager pm = projectTeam.getProjectManager();

        System.out.println("Creating website");
        developer.writeCode();
        tester.testWebsite();
        pm.manageProject();
    }
}