package com.test;

import java.util.List;

public class FibonacciPalindromeImpl implements FibonacciPalindrome {
    /**
     * find pair of fibonacci
     *
     * @param sequence A non-empty sequence of unsigned integers.
     * @return
     */
    public Pair findFibonacciPalindrome(List<Integer> sequence) {
        StringBuilder stringBuilder = new StringBuilder();
        sequence.forEach(e -> stringBuilder.append(e.toString()));
        if (!isPalindrome(stringBuilder.toString())) {
            throw new RuntimeException("整数序列不满足回文条件");
        }

        int start = 0;
        int length = 0;
        int tempIndex = 0;
        int tempLength = 0;

        // a==c, a+b==c, or a==b+c
        if (sequence.size() <= 2) {
//            start = 0;
            length = sequence.size();
        } else {
            for (int i = 0; i < sequence.size() - 2; i++) {
                if (sequence.get(i).intValue() == sequence.get(i + 2).intValue() ||
                        sequence.get(i) + sequence.get(i + 1) == sequence.get(i + 2) ||
                        sequence.get(i) == sequence.get(i + 1) + sequence.get(i + 2)) {
                    tempIndex = i;
                    tempLength = 3;
                    start = tempIndex;
                    length = tempLength;
                }
            }
        }

        return new PairInteger(start, length);
    }

    /**
     * 回文数字判断
     *
     * @param str
     * @return
     */
    public static Boolean isPalindrome(String str) {
        boolean result = false;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
                result = true;
            } else {
                return result;
            }
        }
        return result;
    }
}
