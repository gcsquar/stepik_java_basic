package com.company;

public class chapTwoSolved {
    /**
     * Merges two given sorted arrays into one
     *
     * @param a1 first sorted array
     * @param a2 second sorted array
     * @return new array containing all elements from a1 and a2, sorted
     */
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int first_it = 0;
        int second_it = 0;
        int merged_it = 0;
        int[] result = new int[a1.length + a2.length];
        // System.out.println(result.length);
        while ((first_it < a1.length) || (second_it < a2.length)) {
            if (first_it >= a1.length) {
                result[merged_it++] = a2[second_it++];
            } else if (second_it >= a2.length) {
                result[merged_it++] = a1[first_it++];
            }
            else if (a1[first_it] < a2[second_it]) {
                result[merged_it++] = a1[first_it++];
            } else {
                result[merged_it++] = a2[second_it++];
            }
        }
        return result; // your implementation here
    }


}
