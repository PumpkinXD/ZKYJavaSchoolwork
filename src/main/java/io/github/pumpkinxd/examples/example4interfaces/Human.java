package io.github.pumpkinxd.examples.example4interfaces;

public class Human extends Mammal {
    @Override
    public String what() {
        return "A person";
    }

    @Override
    public int getlegs() {
        return 2;
    }

    @Override
    public String makesound() {
        return "\"speach\"";
    }

    @Override
    public String move() {
        return "the way a person moves";
    }
}
