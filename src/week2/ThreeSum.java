package week2;

import edu.princeton.cs.algs4.*;

public class ThreeSum {
    public static void main(String[] args) {
        In in = new In();
        int[] a = in.readAllInts();
        int b = a.length;
        for (int i = 0; i < b; i++) {
            for (int j = i + 1; j < b; j++) {
                for (int k = j + 1; k < b; k++) {
                    if (a[i] + a[j] == -(a[k])) StdOut.println(a[i] + " " + a[j] + " " + a[k]);
                }
            }
        }
    }
}
