
package hackerrankchallenges;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

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
        slowestKeyPressTester();        //Challenge 2
    }
    
	private static void crashingStonesTester() {
        int[] arr = new int [] {1, 2, 3, 6, 7, 7};
        System.out.println("HackerRank Challenge 1.0 - Crashing Stones = "
            + crashingStones(arr));
        System.out.println("HackerRank Challenge 1.1 - Crashing Stones = "
            + crashingStonesStack(arr));
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
    private static int crashingStonesStack(int[] arr) {
        Arrays.sort(arr);
        Stack<Integer> mStack = new Stack<>();
        for(int i = 0; i < arr.length; i++) {
            mStack.push(arr[i]);
        }
        while(mStack.size() > 1) {
           int val1 = mStack.pop();
           int val2 = mStack.pop(); 
           if(val1 != val2) {
              int diff = Math.abs(val1 - val2);
              mStack.push(diff);
           }
        }
        if(mStack.size() == 1) {
            return arr[0];
        } else {
            return 0;
        }
    }
    
    private static void slowestKeyPressTester() {
        List<List<Integer>> keyTimes = new ArrayList<>();
        List<Integer> mList1 = new ArrayList<>();
        mList1.add(0);
        mList1.add(2);
        List<Integer> mList2 = new ArrayList<>();
        mList2.add(1);
        mList2.add(5);
        List<Integer> mList3 = new ArrayList<>();
        mList3.add(0);
        mList3.add(9);
        List<Integer> mList4 = new ArrayList<>();
        mList4.add(2);
        mList4.add(15);
        keyTimes.add(mList1);
        keyTimes.add(mList2);
        keyTimes.add(mList3);
        keyTimes.add(mList4);
        System.out.println("HackerRank Challenge 2 - Slowest Key Press = "
            + slowestKeyPress(keyTimes));
    }
    
    /*
        Engineers have redesigned a keypad used by ambulance drivers in urban
        areas. Inorder to determine which key takes the longest time to press, 
        the keypad is tested by a driver. Given the results of that test,
        determine which key takes the longest to press.
    
        Example:
        keyTimes = [[0, 2], [1, 5], [0, 9], [2, 15]] 
    
        Elements in keyTimes[i][0] represent encoded characters in the range 
        asciii[a-z] where a = 0, b =..., z = 25. Second element, keyTimes[i][1]
        represents the time the key is pressed since the start of the test. 
        The elements will be given in ascending time order. In the example, keys
        pressed, in order are 0102 (encoded as abac at times 5, 9, 15. From the 
        start time, it took 2 - 0 = 2 to press the first key, 5 -2 = 3 to press 
        the second, and so on. The longest time it took to press a key was key 2
        or 'c' at 15 - 9 = 6.
    */
    private static int slowestKeyPress(List<List<Integer>> keyTimes) {
        System.out.println(keyTimes);
        int ResultantTime = 0;
        char ResultantKey = 'x';
        String allLettersConcat = "";
        for(int i = 0; i < keyTimes.size(); i++) {
            int mKey = keyTimes.get(i).get(0);
            ResultantKey = mapKeyToAsci(mKey);
            int mTime = 0;
            if(i == 0) {
                mTime = keyTimes.get(i).get(1);
            } else {
                mTime = keyTimes.get(i).get(1) 
                    - keyTimes.get(i-1).get(1);
            }
            if(mTime > ResultantTime) {
                ResultantTime = mTime;
            }
            allLettersConcat += ResultantKey;
        }
        System.out.println("All Letters: " + allLettersConcat);
        System.out.println("ResultantKey: " + ResultantKey);
        return ResultantTime;
    }
    
    private static char mapKeyToAsci(int mKey) {
        switch(mKey) {
            case 0 -> {
                return 'a';
            }
            case 1 -> {
                return 'b';
            }
            case 2 -> {
                return 'c';
            }
            case 3 -> {
                return 'd';
            }
            case 4 -> {
                return 'e';
            }
            case 5 -> {
                return 'f';
            }
            case 6 -> {
                return 'g';
            }
            case 25 -> {
                return 'z';
            }
            //Add all letters of the alphabet here.
            default -> {
               return '?'; 
            }   
        }
    }
}