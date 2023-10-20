package io.github.pumpkinxd.examples.DouDiZhuPoker;

import java.util.ArrayList;

public class Player {
    public Player() {
        holding=new ArrayList<>();
    }

    ArrayList<String> holding;
    public void grab(String card){
    holding.add(card);
    }
    public String show(){
        StringBuilder stringBuilder=new StringBuilder();
        for (String card:holding) {
        stringBuilder.append(card).append(" ");
        }
        return stringBuilder.toString();
    }
}

