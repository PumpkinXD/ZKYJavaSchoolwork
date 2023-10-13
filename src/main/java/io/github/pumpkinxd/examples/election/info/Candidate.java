package io.github.pumpkinxd.examples.election.info;

public class Candidate implements Comparable<Candidate> {
    String name;
    int votes;


    public Candidate(String name) {
        this.name = name;
        this.votes=0;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public void addOneVote(){
        this.votes++;
    }

    public String getName() {
        return name;
    }

    public int getVotes() {
        return votes;
    }

    @Override
    public int compareTo(Candidate anothercandidate) {
        return Integer.compare(this.votes,anothercandidate.votes);
    }
}
