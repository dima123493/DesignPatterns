package decorator;

public class JavaDeveloper implements Developer{
    @Override
    public String makeJob() {
        return "Writes Java code...";
    }
}
