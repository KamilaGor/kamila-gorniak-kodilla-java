package com.kodilla.patterns.singleton;

public final class Logger {
	private static Logger loggerInstance = null; //referencja do instancji klasy
	private String lastLog = "";

	private Logger() {
	}
	public static synchronized Logger getInstance() {
		if (loggerInstance == null) {
			loggerInstance = new Logger();
		}
		return loggerInstance;
	}

	public void log(String log) {
		lastLog = log;
		System.out.println("Log: [" + log + "]");
	}
	public String getLastLog() {
		return lastLog;
	}
}
