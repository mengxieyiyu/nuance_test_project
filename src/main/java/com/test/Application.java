package com.test;

import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        // test case
        Integer[] array = {12, 13, 5, 7, 23};
        // convert to List
        List<Integer> params = Arrays.asList(array);

        // 1. the sequence is the same whether read backward or forward
        // 2. either the sequence has fewer than three elements, or every contiguous three-element sequence
        // {a, b, c} in it satisfies at least one of these conditions: a==c, a+b==c, or a==b+c.
        try {
            FibonacciPalindrome fibonacciPalindrome = new FibonacciPalindromeImpl();
            Pair result = fibonacciPalindrome.findFibonacciPalindrome(params);
            System.out.println("response: startIndex:" + result.getFirst() + ", length:" + result.getSecond());
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
