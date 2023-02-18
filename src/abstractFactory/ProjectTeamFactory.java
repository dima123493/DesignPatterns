package abstractFactory;

public interface ProjectTeamFactory {
    Developer getDeveloper();

    Tester getManualTester();

    ProjectManager getProjectManager();
}