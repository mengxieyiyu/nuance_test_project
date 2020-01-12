package com.test;

import com.test.Enums.ErrorEnum;
import com.test.exception.BusinessException;

import java.util.List;

/**
 * 斐波那契回文数算法实现
 *
 * @author litao
 */
public class FibonacciPalindromeImpl implements FibonacciPalindrome {
    /**
     * find pair of fibonacci
     *
     * @param sequence A non-empty sequence of unsigned integers.
     * @return
     */
    public Pair findFibonacciPalindrome(List<Integer> sequence) throws Exception {
        int start = 0;
        int length = 0;
        int tempIndex = 0;
        int tempLength = 0;

        // 元素小于等于2
        if (sequence.size() <= 2) {
            StringBuilder stringBuilder = new StringBuilder();
            sequence.forEach(e -> stringBuilder.append(e.toString()));
            if (!isPalindrome(stringBuilder.toString())) {
                throw new BusinessException(ErrorEnum.NOT_PALINDROME);
            }

            length = stringBuilder.length();
        } else {
            // 元素大于2
            for (int i = 0; i < sequence.size() - 2; i++) {
                if (sequence.get(i).intValue() == sequence.get(i + 2).intValue() ||
                        sequence.get(i) + sequence.get(i + 1) == sequence.get(i + 2) ||
                        sequence.get(i) == sequence.get(i + 1) + sequence.get(i + 2)) {
                    tempIndex = i;

                    StringBuilder stringBuilder = new StringBuilder(sequence.get(i).toString()).append(sequence.get(i + 1).toString()).append(sequence.get(i + 2).toString());
                    tempLength = stringBuilder.length();
                    // 判断序列是否是回文 且 是否是最长的序列
                    if (isPalindrome(stringBuilder.toString()) && length < tempLength) {
                        start = tempIndex;
                        length = tempLength;
                    }
                }
            }

            // 找不到符合规则的序列
            if (length == 0) {
                throw new BusinessException(ErrorEnum.NOT_FIND);
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
    private static Boolean isPalindrome(String str) {
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
