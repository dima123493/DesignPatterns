package decorator;

public class SeniorJavaDeveloper extends DeveloperDecorator{

    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String makeCodeReview(){
        return "Makes code review...";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeCodeReview();
    }
}
