package com.kodilla.patterns.builder.pizza;

import java.util.ArrayList;
import java.util.List;

public final class Pizza {
	private final String bottom;
	private final String sauce;
	private final List<String> ingredients;

	public static class PizzaBuilder { //klasa wewnętrzna (INNER CLASS), dostęp do niej bez konieczności tworzenia obiektu klasy Pizza (static)
		private String bottom;
		private String sauce;
		private List<String> ingredients = new ArrayList<>();

		public PizzaBuilder bottom(String bottom) { //setter
			this.bottom = bottom;
			return this; // zwracany jest this - więc kaskadowo można łączyć wywołania setterów;
		}

		public PizzaBuilder sauce(String sauce) { //setter
			this.sauce = sauce;
			return this;// zwracany jest this - więc kaskadowo można łączyć wywołania setterów;
		}

		public PizzaBuilder ingredient(String ingredient) { //setter
			ingredients.add(ingredient);
			return this;// zwracany jest this - więc kaskadowo można łączyć wywołania setterów;
		}

		public Pizza build() { //tworzy obiekt Pizza (konstruktor kl.Pizza jest prywatny) więc to jedyny sposób (użycie klasy PizzaBuilder)
			return new Pizza(bottom, sauce, ingredients);
		}
	}

	private Pizza(final String bottom, final String sauce, List<String> ingredients) {
		this.bottom = bottom;
		this.sauce = sauce;
		this.ingredients = new ArrayList<>(ingredients);
	}

	public String getBottom() {
		return bottom;
	}

	public String getSauce() {
		return sauce;
	}

	public List<String> getIngredients() {
		return ingredients;
	}

	@Override
	public String toString() {
		return "Pizza{" +
				"bottom='" + bottom + '\'' +
				", sauce='" + sauce + '\'' +
				", ingredients=" + ingredients +
				'}';
	}
}
