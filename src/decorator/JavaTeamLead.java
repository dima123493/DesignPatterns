package decorator;

public class JavaTeamLead extends DeveloperDecorator {

    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    public String sendWeekReport(){
        return "Java team lead sends a week report";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + sendWeekReport();
    }
}
