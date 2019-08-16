package com.kodilla.patterns.builder.checkers;

public class Figure { // bazowa klasa dla figur
	public static final String WHITE = "WHITE";
	public static final String BLACK = "BLACK";
	final private String color;

	public Figure(String color) { //właściwość kolor moze przyjmować wartości: WHITE/BLACK, jeśli inny kolor to wyskoczy błąd
		if(color.equals(WHITE) || color.equals(BLACK)) {
			this.color = color;
		}else {
			throw new IllegalStateException("Figures of checkers should be BLACK or WHITE!");
		}
	}
	public String getColor() {
		return color;
	}
}
