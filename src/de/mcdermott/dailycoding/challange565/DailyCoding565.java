package de.mcdermott.dailycoding.challange565;

import java.util.Arrays;

/**
 * <b>Task:</b>
 * <p>Given an integer list where each number represents the number of hops you can make, determine whether you can
 * reach to the last index starting at index 0.</p>
 * <p>For example, [2, 0, 1, 0] returns True while [1, 1, 0, 1] returns False.</p>
 */
public class DailyCoding565 {
    private static final int[][] input;

    static {
        input = new int[2][];
        input[0] = new int[]{2, 0, 1, 0};
        input[1] = new int[]{1, 1, 0, 1};
    }

    public static void main(String[] args) {
        for (int[] values : input)
            System.out.println(Arrays.toString(values) + ": " + execute(values));
    }

    private static boolean execute(int[] input) {
        for (int i = 0; i < input.length; ) {
            if (input[i] == 0)
                return false;

            i += input[i];

            if (i == input.length - 1)
                return true;
        }

        return false;
    }
}
