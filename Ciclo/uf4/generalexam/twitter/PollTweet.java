package cat.itb.martamacias7e4.dam.m03.uf4.generalexam.twitter;

import java.util.List;

public class PollTweet extends Tweet{
    List<String> options;
    int[] votes;
    int totalVotes;

    public PollTweet(String usuari, String data, String text, List<String> options) {
        super(usuari, data, text);
        this.options = options;
        votes = new int[options.size()];
        totalVotes = 0;
    }
    public void vote(int index){
        votes[index] ++;
        totalVotes ++;
    }
    @Override
    public void print() {
        System.out.printf("@%s · %s %n%s%n", usuari, data, text);
        for (int i=0; i< options.size();i++){
            System.out.printf("- (%d/%d) %s%n", votes[i], totalVotes, options.get(i));
        }
        System.out.println();
    }
}
