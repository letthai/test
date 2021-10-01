package week2;

import edu.princeton.cs.algs4.*;

public class TwoSum {
    public static void main(String[] args){
        In in = new In("D:\\algs4-data\\4Kints.txt");
        int[] a = in.readAllInts();
        int b = a.length;
        for(int i = 0; i < b; i++){
            for(int j = i+1; j < b; j++){
                if(a[i] + a[j] == 0) StdOut.println(a[i] + " " +a[j]);
            }
        }
    }
}
