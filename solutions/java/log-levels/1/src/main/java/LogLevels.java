public class LogLevels {
    
    public static String message(String logLine) {
        String[] MyLogLine = logLine.split(":",2);
        return MyLogLine[1].trim();
    }

    public static String logLevel(String logLine) {
        String[] MyLogLine = logLine.split("[\\[\\]:]");
        return MyLogLine[1].toLowerCase();
    }

    public static String reformat(String logLine) {
        String[] MyLogLine = logLine.split("[\\[\\]:]");
        return MyLogLine[3].trim()+" ("+MyLogLine[1].toLowerCase()+")";
    }
}
