package de.mcdermott.dailycoding.challange001;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <b>Task:</b>
 * <p>Given a list of numbers and a number k, return whether any two numbers from the list add up to k.</p>
 * <p>For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.</p>
 * <p>Bonus: Can you do this in one pass?</p>
 */
public class DailyCoding001 {
    private static final int[] input = {10, 15, 3, 7};
    private static final int k = 17;

    public static void main(String[] args) {
        System.out.println(Arrays.toString(input) + " & k=" + k + ": " + execute(input, k));
        System.out.println(Arrays.toString(input) + " & k=" + k + ": " + executeSinglePass(input, k));
    }

    private static boolean execute(int[] input, int k) {
        for (int val1 : input)
            for (int val2 : input)
                if (val1 + val2 == k)
                    return true;

        return false;
    }

    private static boolean executeSinglePass(int[] input, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < input.length; i++) {
            if (map.containsKey(k - input[i]))
                return true;

            map.put(input[i], i);
        }

        return false;
    }
}
