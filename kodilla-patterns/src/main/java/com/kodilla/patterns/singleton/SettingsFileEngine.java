package com.kodilla.patterns.singleton;

public final class SettingsFileEngine {
	private static SettingsFileEngine settingsFileEngineInstance = null;//pole statyczne przechowujące referencję do instancji klasy;
	private String fileName = "";

	private SettingsFileEngine() { // jawne wyspecyfikowanie konstruktora plus oznaczenie go private
	}
	public static SettingsFileEngine getInstance() { //static- możemy wywołać bez obiektu;
		if(settingsFileEngineInstance == null) { //spr czy pole jest zainicjowane, jeśli nie
			settingsFileEngineInstance = new SettingsFileEngine(); //to create new obiekt i przypisuje go do pola
		}
		return settingsFileEngineInstance; //instatncja jest zwracana wywołującemu metodę
	}
	public String getFileName() {
		return fileName;
	}

	public void open(final String fileName) {
		this.fileName = fileName;
		System.out.println("Opening the settings file");
	}

	public void close() {
		this.fileName = "";
		System.out.println("Closing the settings file");
	}

	public boolean loadSettings() {
		System.out.println("Loading settings from file");
		return true;
	}

	public boolean saveSettings() {
		System.out.println("Saving settings to file");
		return true;
	}
}