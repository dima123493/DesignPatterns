package singletone;

public class ProgramLogger {
    private static ProgramLogger programLogger;
    private static String logFile = "this is a log file of the program ";

    public static synchronized ProgramLogger getProgramLogger() {
        if (programLogger == null) {
            return new ProgramLogger();
        }
        return programLogger;
    }

    private ProgramLogger() {

    }

    public void addLogInfo(String logInfo) {
        logFile += logInfo;
    }

    public void showLogInfo() {
        System.out.println(logFile);
    }
}