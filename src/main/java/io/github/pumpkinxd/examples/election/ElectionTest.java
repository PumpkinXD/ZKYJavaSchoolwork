package io.github.pumpkinxd.examples.election;

public interface ElectionTest {
    public static void main(String[] args) {
        int voters=10;
        Election election=new Election();
        election.addACandidate("A");
        election.addACandidate("B");
        election.addACandidate("C");
        election.addACandidate("D");
        election.displayAllCandidates();
    }
}
