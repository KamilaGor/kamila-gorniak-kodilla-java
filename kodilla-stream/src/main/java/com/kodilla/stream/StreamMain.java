package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String [] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("aaaAAA", (decoratingText) -> decoratingText.substring(3, 6));
        poemBeautifier.beautify("bbb", (decoratingText) -> decoratingText.toUpperCase());
        poemBeautifier.beautify("ccc", (decoratingText -> decoratingText.concat("ABC")));
        poemBeautifier.beautify("DDD", (decoratingText -> decoratingText.toLowerCase()) );
        poemBeautifier.beautify("eee", (decoratingText -> decoratingText.replace('e', 'E')));
        poemBeautifier.beautify("fffFFF", (decoratingText -> decoratingText.replaceFirst("fff", "FFF")));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
