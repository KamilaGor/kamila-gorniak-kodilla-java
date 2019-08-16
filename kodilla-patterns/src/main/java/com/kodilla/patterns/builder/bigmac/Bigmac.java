package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class Bigmac {
	private final String bun; //opcja sezam
	private final int burgers;
	private final String sauce; //standard, 1000 wysp, barbecue
	private final List<String> ingredients;

	public static class BigmacBuilder {
		private String bun; //opcja sezam
		private int burgers;
		private String sauce; //standard, 1000 wysp, barbecue
		private List<String> ingredients = new ArrayList<>();

		public BigmacBuilder bun(String bun) {
			this.bun = bun;
			return this;
		}

		public BigmacBuilder burgers(int burgers) {
			this.burgers = burgers;
			return this;
		}

		public BigmacBuilder sauce(String sauce) {
			this.sauce = sauce;
			return this;
		}

		public BigmacBuilder ingredient(String ingredient) { // w przykładzie nazwa settera ingredient(String ingredient)
			ingredients.add(ingredient);
			return this;
		}

		public Bigmac make() {
			return new Bigmac(bun, burgers, sauce, ingredients);
		}
	}
	private Bigmac(final String bun, final int burgers, final String sauce, List<String> ingredients) {
		this.bun = bun;
		this.burgers = burgers;
		this.sauce = sauce;
		this.ingredients = new ArrayList<>(ingredients );
	}

	public String getBun() {
		return bun;
	}

	public int getBurgers() {
		return burgers;
	}

	public String getSauce() {
		return sauce;
	}

	public List<String> getIngredients() {
		return ingredients;
	}

	@Override
	public String toString() {
		return "Bigmac{" +
				"bun='" + bun + '\'' +
				", burgers=" + burgers +
				", sauce='" + sauce + '\'' +
				", ingredients=" + ingredients +
				'}';
	}
}
