package io.github.pumpkinxd.examples.example4interfaces;

public class Dog extends Mammal {
    @Override
    public int getlegs() {
        return super.getlegs();
    }

    @Override
    public String makesound() {
        return "woof";
    }

    @Override
    public String what() {
        return "A Dog";
    }

    @Override
    public String move() {
        return "the_way_dog_moves";
    }
}
