package org.example;

import java.util.Iterator;
import java.util.Random;
import java.util.function.Consumer;

public class Randoms implements Iterable<Integer> {
    private int minValue;
    private int maxValue;
    private Random random = new Random( );

    public Randoms(int minValue, int maxValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>( ) {


            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return random.nextInt((maxValue - minValue) + 1) + minValue;
            }
        };
    }
}
