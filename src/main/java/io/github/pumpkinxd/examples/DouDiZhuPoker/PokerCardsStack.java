package io.github.pumpkinxd.examples.DouDiZhuPoker;

import java.util.*;

public class PokerCardsStack {

    public PokerCardsStack() {
        cards=new ArrayList<>();
        cards.add("Red Joker");
        cards.add("Black Joker");
        String[] suits={"Heart ","Diamond ","Spade ","Club "};
        for (String suit:suits) {
            for (int i = 0; i < 13; i++) {
                switch (i){
                    case 0:
                        cards.add(suit+'K');
                        break;
                    case 1:
                        cards.add(suit+'A');
                        break;
                    case 11:
                        cards.add(suit+'J');
                        break;
                    case 12:
                        cards.add(suit+'Q');
                        break;
                    default:
                        cards.add(suit+i);
                }

            }
        }
        Collections.shuffle(cards);
        //System.out.println(cards);
        //System.out.println(cards.size());
    }

    ArrayList<String> cards;
    public void shuffle(){
        if (cards != null) {
            Collections.shuffle(cards);
        }
    }
    public String pop(){
        String card=new String(cards.get(cards.size()-1));
        cards.remove(cards.size()-1);
        return card;
    }
    public void push(String card){
        cards.add(card);
    }
    public int howmanycardsarethere(){return cards.size();}



    public static void main(String[] args) {
        PokerCardsStack stack=new PokerCardsStack();

    }
}
