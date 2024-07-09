// You are given n pairs of number in every pair
// the first number is always smaller than the second number
// a pair(c,d ) can come after pair(a,b) if b< c.
// find the longgest chain which can be formed from a given set of pairs

import java.util.*;
public class MaxLengthChain {
    public static void main(String args[]) {
        int pairs[][] = {{5, 24}, {39, 60}, {5, 28}, {27, 40}, {50, 90}};

        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int chainLen = 1;
        int chainEnd = pairs[0][1]; // Last selected pair end // chain end

        for(int i = 1; i<pairs.length; i++) {
            if(pairs[i][0] > chainEnd) {
                chainLen++;
                chainEnd = pairs[i][1];
            }
        }
        System.out.println("max length of chain = " + chainLen);
    }
}
