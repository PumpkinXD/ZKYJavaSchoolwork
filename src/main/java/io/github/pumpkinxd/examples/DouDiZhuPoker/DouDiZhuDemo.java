package io.github.pumpkinxd.examples.DouDiZhuPoker;

public class DouDiZhuDemo {
    static Player[] players;
    static PokerCardsStack pokerCardsStack;

    public static void main(String[] args) {
        players=new Player[3];
        pokerCardsStack=new PokerCardsStack();
        pokerCardsStack.shuffle();
        for (int i = 0; i < players.length; i++) {
            players[i]=new Player();
        }
        for (int i = 0; i < 51; i++) {
            players[i%3].grab(pokerCardsStack.pop());
        }
        String[] facedowns=new String[3];
        for (int i = 0; i < facedowns.length; i++) {
            facedowns[i]= pokerCardsStack.pop();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Player "+(i+1)+" have:"+players[i].show()+'\n');
        }
        System.out.println("Facedown cards are:"+facedowns[0]+","+facedowns[1]+" and "+facedowns[2]);
        //todo:write smh to decide which player becomes the landlord(aka dizhu)
    }
}
