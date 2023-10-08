package io.github.pumpkinxd.examples.example4interfaces;

public class Mammal extends Animal  {
    @Override
    public int getlegs() {
        return 4;
    }

    @Override
    public String makesound() {
        return "noise_from_a_mammal";
    }

    @Override
    public String what() {
        return "a mammal";
    }

    @Override
    public String move() {
        return "mammal_relocating";
    }
}
