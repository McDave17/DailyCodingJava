package de.mcdermott.dailycoding.challenge002;

import java.util.Arrays;

/**
 * <b>Task:</b>
 *
 * <p>Given an array of integers, return a new array such that each element at index i of the new array is the product
 * of all the numbers in the original array except the one at i.</p>
 *
 * <p>For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input
 * was [3, 2, 1], the expected output would be [2, 3, 6].</p>
 *
 * <p>Follow-up: what if you can't use division?</p>
 */
public class DailyCoding002 {

    private static final int[] input1 = {1, 2, 3, 4, 5};
    private static final int[] input2 = {3, 2, 1};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(input1) + ": " + Arrays.toString(execute(input1)));
        System.out.println(Arrays.toString(input2) + ": " + Arrays.toString(execute(input2)));
    }

    private static int[] execute(int[] input) {
        int[] rt = new int[input.length];
        int total = Arrays.stream(input).filter(val -> val != 0).reduce(1, (a, b) -> a * b);

        for (int i = 0; i < input.length; i++) {
            rt[i] = input[i] != 0 ? total / input[i] : total;
        }

        return rt;
    }
}
