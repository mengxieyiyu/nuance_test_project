package com.test;

import com.test.exception.BusinessException;

import java.util.Arrays;
import java.util.List;

/**
 * 方法入口
 *
 * @author litao
 */
public class Application {
    public static void main(String[] args) {

        //test case 1: 满足条件的双元素序列
//        Integer[] array = {123,321};

        // test case 2: 不满足条件序列
//        Integer[] array = {12, 13, 5,31, 21};

        // test case 3: 满足条件的多元素序列
        Integer[] array = {12, 7, 5, 7, 21, 343, 121, 343, 456, 145};


        // convert to List
        List<Integer> params = Arrays.asList(array);

        // 1. the sequence is the same whether read backward or forward
        // 2. either the sequence has fewer than three elements, or every contiguous three-element sequence
        // {a, b, c} in it satisfies at least one of these conditions: a==c, a+b==c, or a==b+c.
        try {
            FibonacciPalindrome fibonacciPalindrome = new FibonacciPalindromeImpl();
            Pair result = fibonacciPalindrome.findFibonacciPalindrome(params);
            System.out.println("response: startIndex:" + result.getFirst() + ",length of the palindrome:" + result.getSecond());
        } catch (BusinessException be) {
            System.out.println(be.getMsg());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
