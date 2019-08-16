package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String decoratingText, PoemDecorator poemDecorator){
        String theText = poemDecorator.decorate(decoratingText);
        System.out.println("Embellished text: " + theText);
    }
}
