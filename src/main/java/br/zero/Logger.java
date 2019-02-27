package br.zero;

public class Logger {

    private static void log(String level, String message) {
        System.out.println(String.format("[%s] %s", level, message));
    }

    private static  void log(String level, String messageFormat, Object... params) {
        log(level, String.format(messageFormat, params));
    }

    public static void all(String messageFormat, Object... params) {
        log("ALL_", messageFormat, params);
    }

    public static void debug(String messageFormat, Object... params) {
        log("DEBG", messageFormat, params);
    }

    public static void info(String messageFormat, Object... params) {
        log("INFO", messageFormat, params);
    }
}
