// Min Absolute Differnce Pairs
// Given two arrays A and B of equal length n . 
// pair each element of array A to an element in array B
// Such that sum S of absolute differences of all 
// the pairs is minimum

import java.util.*;
public class MinAbsoluteDiff{
    public static void main(String args[]) {
        int A[] = {1, 2, 3};
        int B[] = {2, 1, 3};

        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff = 0;

        for(int i = 0; i<A.length; i++) {
            minDiff += Math.abs(A[i] - B[i]);
        }
        System.out.println(" min absolute diff of pairs = " + minDiff);
    }
}
// time complexity : 0(nlogn)