package io.github.pumpkinxd.examples.example4interfaces;

public class Goose extends Bird {
    @Override
    public String what() {
        return "A Goose";
    }

    @Override
    public int getlegs() {
        return super.getlegs();
    }

    @Override
    public String makesound() {
        return "Honk";
    }

    @Override
    public String move() {
        return "flying or swimming or walk";
    }
}
