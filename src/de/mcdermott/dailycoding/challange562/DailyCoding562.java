package de.mcdermott.dailycoding.challange562;

import java.util.Arrays;

/**
 * <b>Task:</b>
 * <p>Given an array of integers, return a new array such that each element at index i of the new array is the product
 * of all the numbers in the original array except the one at i.</p>
 * <p>For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24].
 * If our input was [3, 2, 1], the expected output would be [2, 3, 6].</p>
 */
public class DailyCoding562 {
    private static final int[][] input;

    static {
        input = new int[3][];
        input[0] = new int[]{1, 2, 3, 4, 5, 2};
        input[1] = new int[]{3, 2, 1};
        input[2] = new int[]{3, 2, 1, 9};
    }

    public static void main(String[] args) {
        for (int[] values : input)
            System.out.println(Arrays.toString(calculate(values)));
    }

    private static int[] calculate(int[] input) {
        int[] rt = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            rt[i] = 1;

            for (int j = 0; j < input.length; j++) {
                if (i == j)
                    continue;

                rt[i] *= input[j];
            }
        }

        return rt;
    }
}
