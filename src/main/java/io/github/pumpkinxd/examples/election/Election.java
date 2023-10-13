package io.github.pumpkinxd.examples.election;

import io.github.pumpkinxd.examples.election.info.Candidate;

import java.util.ArrayList;
import java.util.Collections;

public class Election {
    public Election() {
        Candidates = new ArrayList<>();
    }

    ArrayList<Candidate> Candidates;

    public void addACandidate(String name){
        Candidates.add(new Candidate(name));
    }
    public void displayAllCandidates(){
        for (int i = 0; i < Candidates.size(); i++) {
            Candidate c=Candidates.get(i);
            System.out.println("Candidate No."+i+" "+c.getName());
        }
    }
    public void displayAllCandidatesWithVotes(){
        for (int i = 0; i < Candidates.size(); i++) {
            Candidate c=Candidates.get(i);
            System.out.println("Candidate No."+i+" "+c.getName()+" has "+c.getVotes()+" votes");
        }
    }
    public void displayWinner(){
        Candidate winner= Collections.max(Candidates);
        System.out.println("Candidate No."+Candidates.indexOf(winner)+" "+winner.getName()+" won the election with the most votes ("+winner.getVotes()+")");
    }
    public void addAVote(int candidateIndex){
        Candidates.get(candidateIndex).addOneVote();
    }
}
