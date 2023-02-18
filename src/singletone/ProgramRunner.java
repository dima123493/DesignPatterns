package singletone;

public class ProgramRunner {
    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().addLogInfo("1");
        ProgramLogger.getProgramLogger().addLogInfo("2");
        ProgramLogger.getProgramLogger().addLogInfo("3");

        ProgramLogger.getProgramLogger().showLogInfo();
    }
}