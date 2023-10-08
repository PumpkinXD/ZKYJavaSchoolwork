package io.github.pumpkinxd.examples.example4interfaces;

public class Bird extends Animal {
    @Override
    public int getlegs() {
        return 2;
    }

    @Override
    public String makesound() {
        return "SOUND_BIRD";
    }

    @Override
    public String what() {
        return "A bird";
    }

    @Override
    public String move() {
        return "prob flying";
    }
}
