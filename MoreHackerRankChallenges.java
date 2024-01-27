
package hackerrankchallenges;

import java.io.*;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author Sithembiso SamaJobe
 */
public class MoreHackerRankChallenges {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		//On The Job HackerRank Practice
		crashingStonesTester();		//Challenge 1
    }
    
	private static void crashingStonesTester() {
        int[] arr = new int [] {1, 2, 3, 6, 7, 7};
        System.out.println("HackerRank Challenge 1 - Crashing Stones = "
            + crashingStones(arr));
    }
    
    /*
        Each day a quary-worker is given a pile of stones and told to reduce the
        larger stones into smaller stones. The worker must smash the stones to-
        gether to reduce them, and is told to always pick up the largest two 
        stones are of equal weight, they both disintegrate entirely. If one is
        larger, the smaller one is disintegrated and the larger one is reduced 
        by the weight of the smaller one. Eventually, there is either one stone
        left that cannot be broke, or all of the stones have been smashed. Dete-
        rmine the weight of the last stone, or return 0 if there is none left.
        
        Example: weights = [1, 2, 3, 6, 7, 7]
    
        The workers always start with the two largest stones. in this case, the 
        two largest stones have equal weights of 7 so they both disintegrate 
        when smashed. Next, the worker smashes weights 3 and 6. The snaller one
        is destroyed and the larger weight 6 -3 = 3 units. Then, weights 3 and 2
        are smashed together, which leaves a stone of weight 1. This is smashed
        with the last remaining stone of weight 1. There are no stones left, so
        the remaining stone weight is 0.
       
    */
    private static int crashingStones(int[] arr) {
        Arrays.sort(arr);
        List<Integer> mArr = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            mArr.add(arr[i]);
        }
        int mLen = mArr.size();
        while(mLen > 1) {
            int compareValue_1 = mArr.get(mArr.size() - 1);
            int compareValue_2 = mArr.get(mArr.size() - 2);
            if(mArr.contains(compareValue_1)) {
                mArr.remove(mArr.indexOf(compareValue_1));
            }
            if(mArr.contains(compareValue_2)) {
                mArr.remove(mArr.indexOf(compareValue_2));
            }
            int diffVal = 0;
            if(compareValue_1 != compareValue_2) {
                diffVal = Math.abs(compareValue_2 - compareValue_1);
                mArr.add(diffVal);
            }
            Collections.sort(mArr);
            mLen = mArr.size();
        }
        if(arr.length == 1) {
            return arr[0];
        } else {
            return 0;
        }
    }
}