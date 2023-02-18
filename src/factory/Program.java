package factory;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperPySpecialty("java");
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
    }

    static DeveloperFactory createDeveloperPySpecialty(String specialty) {
        if (specialty.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("c++")) {
            return new CppDeveloperFactory();
        } else {
            throw new RuntimeException("There is no such specialty");
        }
    }
}