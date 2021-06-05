package cat.itb.martamacias7e4.dam.m03.uf4.generalexam.twitter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenerateTweets {
    public static void main(String[] args) {
        Tweet tweet1 = new Tweet("iamdevloper", "07 de gener", "Remember, a few hours of trial and error can save you several minutes of looking at the README");
        tweet1.print();

        Tweet tweet2 = new Tweet("softcatala", "29 de març", "Avui mateix, #CommonVoiceCAT segueix creixent \uD83D\uDE80:\n\uD83D\uDDE3️ 856 hores enregistrades\n✅725 de validades.\nSi encara no has participat, pots fer-ho aquí!");
        tweet2.print();

        PollTweet pollTweet3 = new PollTweet("musicat", "02 d'abril", "Quina cançó t'agrada més?", new ArrayList<>(4));
        pollTweet3.options.add("Comèdia dramàtica - La Fúmiga");
        pollTweet3.options.add("In the night - Oques Grasses");
        pollTweet3.options.add("Una Lluna a l'Aigua - Txarango");
        pollTweet3.options.add("Esbarzers - La Gossa Sorda");
        pollTweet3.votes = new int[4];
        pollTweet3.vote(0);
        pollTweet3.vote(0);
        pollTweet3.vote(0);
        pollTweet3.vote(1);
        pollTweet3.vote(1);
        pollTweet3.vote(2);
        pollTweet3.vote(2);
        pollTweet3.vote(3);
        pollTweet3.vote(3);
        pollTweet3.vote(3);
        pollTweet3.vote(3);
        pollTweet3.print();

        Tweet tweet4 = new Tweet("ProgrammerJokes", "05 d'abril", "Q: what's the object-oriented way to become weathy?\n\nA: Inheritance");
        tweet4.print();
    }
}
