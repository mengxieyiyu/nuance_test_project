package com.test;

/**
 * pair for integers
 */
public class PairInteger implements Pair<Integer, Integer> {
    private Integer first;
    private Integer second;

    PairInteger(Integer start, Integer length) {
        first = start;
        second = length;
    }

    public Integer getFirst() {
        return first;
    }

    public Integer getSecond() {
        return second;
    }
}
