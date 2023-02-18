package abstractFactory.projects;

import abstractFactory.Developer;
import abstractFactory.ProjectManager;
import abstractFactory.ProjectTeamFactory;
import abstractFactory.Tester;
import abstractFactory.website.WebsiteTeamFactory;

public class WebsiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeam = new WebsiteTeamFactory();
        Developer developer = projectTeam.getDeveloper();
        Tester tester = projectTeam.getManualTester();
        ProjectManager pm = projectTeam.getProjectManager();

        System.out.println("Creating website");
        developer.writeCode();
        tester.testWebsite();
        pm.manageProject();
    }
}