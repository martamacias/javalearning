package cat.itb.martamacias7e4.dam.m03.uf1.iterative.practice;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

/**
 * Random function for easy testing.
 */
public class ItbRandomizer {
    static Random random = new Random();
    static LinkedList<Integer> nextInts = new LinkedList<>();

    /**
     * Returns a pseudorandom, uniformly distributed {@code int} value
     * between 0 (inclusive) and the specified value (exclusive), drawn from
     * this random number generator's sequence.
     *
     * @param bound the upper bound (exclusive).  Must be positive.
     * @return
     */
    public static int nextInt(int bound){
        if(!nextInts.isEmpty())
            return nextInts.removeFirst();
        else
            return random.nextInt(bound);
    }

    public static void setNextInts(Integer... nextInts) {
        ItbRandomizer.nextInts = new LinkedList<Integer>(Arrays.asList(nextInts));
    }
}