package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class MovieStoreRunner {
	public static void main(String[] args) {
		String namesOfMovies = MovieStore.getMovies().entrySet().stream()
				.flatMap(movieStore -> movieStore.getValue().stream())
				.collect(Collectors.joining("! ", "", "!"));
		System.out.println(namesOfMovies);
	}
}
