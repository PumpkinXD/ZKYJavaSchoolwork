package io.github.pumpkinxd.examples.example4interfaces;

public class Penguin extends Bird {
    @Override
    public String what() {
        return "A Penguin";
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
        return "walking or swimming";
    }
}
