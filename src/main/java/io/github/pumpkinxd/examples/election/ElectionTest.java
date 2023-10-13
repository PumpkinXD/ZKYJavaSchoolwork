package io.github.pumpkinxd.examples.election;

import java.util.Scanner;

public interface ElectionTest {
    public static void main(String[] args) {
        int voters=10;
        Election election=new Election();
        election.addACandidate("A");
        election.addACandidate("B");
        election.addACandidate("C");
        election.addACandidate("D");
        election.displayAllCandidates();

        //voting part
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < voters; i++) {
            election.displayAllCandidatesWithVotes();
            System.out.print("\ntype candidate's ID to vote:");
            try {
                election.addAVote(scanner.nextInt());
                System.out.println("\nThanks for voting");
            }
            catch (IndexOutOfBoundsException ioobe){
                System.out.println("\nNo such candidate, Your vote is considered invalid");
            }finally {
                System.out.println();
            }

        }

        election.displayWinner();


    }
}
