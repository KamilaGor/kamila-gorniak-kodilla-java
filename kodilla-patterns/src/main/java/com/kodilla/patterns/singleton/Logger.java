package com.kodilla.patterns.singleton;

public final class Logger {
	private static Logger loggerInstnce = null; //referencja do instancji klasy
	private String lastLog = "";

	private Logger() {
	}
	public static Logger getInstance() {
		if (loggerInstnce == null) {
			loggerInstnce = new Logger();
		}
		return loggerInstnce;
	}

	public void log(String log) {
		lastLog = log;
		System.out.println("Log: [" + log + "]");
	}
	public String getLastLog() {
		return lastLog;
	}
}
