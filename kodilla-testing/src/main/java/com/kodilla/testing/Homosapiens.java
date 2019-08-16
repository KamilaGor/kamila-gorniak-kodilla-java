package com.kodilla.testing;

public class Homosapiens {
    private String color;
    private int weight;
    private int hight;
    private static boolean stalocieply;

    public Homosapiens (String color, int weight, int hight) {
        this.color = color;
        this.weight = weight;
        this.hight = hight;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }
    public int getHight() {
        return hight;
    }
    public static boolean getStalocieply() {
        return stalocieply;
    }
    public static void main (String[] args){
        Homosapiens kamilaGorniak = new Homosapiens("brown", 66, 180);
        System.out.println(kamilaGorniak.getColor());
        System.out.println(Homosapiens.getStalocieply());
    }
}

