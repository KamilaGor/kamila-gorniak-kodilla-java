package com.kodilla.patterns.singleton;

public class Logger {
	private String lastLog = "";

	public Logger() {
	}

	public void log(String log) {
		lastLog = log;
		System.out.println("Log: [" + log + "]");
	}
	public String getLastLog() {
		return lastLog;
	}
}
