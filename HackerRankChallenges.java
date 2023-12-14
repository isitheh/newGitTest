
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
public class HackerRankChallenges {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Warm Up Challenges
        sockMerchantTester(); //Challenge 1
        countingValleysTester(); //Challenge 2
        jumpingOnCloudsTester(); //Challenge 3
        repeatedStringTester();  //Challenge 4
		
        //Arrays Challenges
        twoDArraysDSTester(); //Challenge 1
        rotLeftTester(); //Challenge 2
        minimumBribesTester(); //Challenge 3
        minimumSwapsTest(); //Challenge 4
        
        //Practice Questions Hackerrank.com 
        fizzBuzzTester(); //55 min
        
        //Standard bank test Question 1
        maxSubstring("baca");	//Solution passed all test cases.
        
        //CoderByte Prep Challenges
        QuestionsMarksTester();  //Challenge 1
    }
    
    private static void sockMerchantTester() {
        int n = 7;
        List<Integer> ar = new ArrayList();
        ar.add(1);
        ar.add(2);
        ar.add(1);
        ar.add(2);
        ar.add(1);
        ar.add(3);
        ar.add(2);
        System.out.println("HackerRank Challenge 1 - Number umber Of Sock Pairs = " + sockMerchant(n, ar));
    }
    
    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    private static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        int numberOfPairs = 0;
        HashMap<Integer, Integer> rep = new HashMap();
        for (int i = 0; i < ar.size(); i++) {
            int count = 0;
            for(int j = 0; j < ar.size(); j++){
                if(Objects.equals(ar.get(i), ar.get(j))){
                    count++;
                }
            }
            rep.put(ar.get(i), count);
        }
        for(int key: rep.keySet()) {
            numberOfPairs += Math.floor(rep.get(key) / 2);
        }
        //Return how many pairs can be formed.
        return numberOfPairs;
    }
    
    private static void countingValleysTester() {
        int steps = 8;
        String path = "DDUUUUDD";
        System.out.println("HackerRank Challenge 2 - Number of Hiked Valleys = "
            + countingValleys(steps, path));
    }

    /*
    * Complete the 'countingValleys' function below.
    *
    * The function is expected to return an INTEGER.
    * The function accepts following parameters:
    *  1. INTEGER steps
    *  2. STRING path
    */
    public static int countingValleys(int steps, String path) {
        // Write your code here
        int hikedValleys = 0;
        int countUpDown = 0;
        char[] charArr = path.toCharArray();
        for(char c: charArr) {
            if(c == 'U') {
                countUpDown++;
            } else { //(c == 'U')
                countUpDown--;
                if(countUpDown == -1) {
                    //Entered a valley
                    hikedValleys++;
                }                
            }
        }
        return hikedValleys;
    }
	
    private static void fizzBuzzTester() {
        int n = 15;
        //fizzBuzz(n); //Spamming the output.
    }
    
    /*
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */
    public static void fizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            } else if((i % 3 == 0) && (!(i % 5 == 0))) {
                System.out.println("Fizz");
            } else if((!(i % 3 == 0)) && (i % 5 == 0)) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
	
    /*
        For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of  space-separated integers.
        Sample Input
        2
        0 2 10
        5 3 5
        Sample Output
        2 6 14 30 62 126 254 510 1022 2046
        8 14 26 50 98
    */
    private void PrepareJavaIntroductionJavaLoopsII () 
    {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int seriesValue = a; 
            for(int k = 0; k < n; k++)
            {
                seriesValue += (Math.pow(2, k) * b);
                System.out.print(seriesValue + " ");
            }
            System.out.println();
            
        }
        in.close();
    }
	
    /*
        Objective
        In this challenge, we're going to use loops to help us do some simple math.

        Task
        Given an integer, , print its first  multiples. Each multiple  (where ) should be printed on a new line in the form: N x i = result.
        Print  lines of output; each line  (where ) contains the  of  in the form:
        N x i = result.

        Sample Input: 2
        Sample Output
        2 x 1 = 2
        2 x 2 = 4
        2 x 3 = 6
        2 x 4 = 8
        2 x 5 = 10
        2 x 6 = 12
        2 x 7 = 14
        2 x 8 = 16
        2 x 9 = 18
        2 x 10 = 20
    */

    private void printFewMultiples () throws IOException 
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        bufferedReader.close();
        if(N >= 2 && N <= 20) {
            for(int i = 1; i <= 10; i++) {
                int res = N * i;
                System.out.printf("%d x %d = %d\n", N, i, res);
            }
        }
    }
    
    private static void jumpingOnCloudsTester() {
        List<Integer> ar = new ArrayList();
        ar.add(0);
        ar.add(0);
        ar.add(0);
        ar.add(1);
        ar.add(0);
        ar.add(0);
        System.out.println("HackerRank Challenge 3 - Jumping on clouds = "
            + jumpingOnClouds(ar));
    }
    
    /*
     * Complete the 'jumpingOnClouds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY c as parameter.
     */

    public static int jumpingOnClouds(List<Integer> c) {
        // Write your code here
        int minJumpsRequired = 0;
        for(int i = 0; i < c.size();) {
            if((i + 2) <= c.size()) {
                try {
                    if(c.get((i + 2)) != 1) {
                        //Allow a double jump as the furthest possible single jump.
                        i = i + 2;
                    } else {
                        //Allow a single jump as the furthest possible single jump.
                        i = i + 1;
                    }
                    minJumpsRequired++;  
                } catch (IndexOutOfBoundsException ex) {
                   if((i + 1) <= c.size()){
                        //Allow a single jump as the furthest possible single jump.
                        i = i + 1;
                        if(i != c.size()) {
                            minJumpsRequired++;
                        } 
                   }
                }
            } else if((i + 1) <= c.size()){
                //Allow a single jump as the furthest possible single jump.
                i = i + 1;
                if(i != c.size()) {
                    minJumpsRequired++;
                }
            }
        }
        return minJumpsRequired;
    }
    
    private static void repeatedStringTester() {
        String s = "kmretasscityylpdhuwjirnqimlkcgxubxmsxpypgzxtenweirknjtasx"
                + "tvxemtwxuarabssvqdnktqadhyktagjxoanknhgilnm";
        long n = 736778906400L;
        
        System.out.println("HackerRank Challenge 4 - Repeated String = "
            + repeatedString(s, n));
    }
    
    /*
     * Complete the 'repeatedString' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. LONG_INTEGER n
     */

    public static long repeatedString(String s, long n) {
        // Write your code here
        long count_a = 0;

        if((s.lastIndexOf("a")) == -1) {
            //If the string does not contain letter 'a' at all.
            return 0;
        }
        
        if(s.length() == 1) {
            //If the string contains just one char no need to repeat.
            if(s.charAt(0) == 'a') {
                return n;
            } else {
                return 0;
            }
        }

        //Now check how many a's in the original string.
        for(long i = 0; i < s.length(); i++) {
            if(s.charAt((int) i) == 'a') {
                count_a++;
            }
        }
        
        //How many times must repetitions be done?
        long reps = n/s.length();
        count_a = count_a*reps;
        
        //Now cover the remainder.
        long rem = n % s.length();
        for(long i = 0; i < rem; i++) {
            if(s.charAt((int) i) == 'a') {
                count_a++;
            }
        }

        return count_a;
    }
	
    private static void twoDArraysDSTester() {
        List<List<Integer>> arr = new ArrayList<>();
    }
	
    /*
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int hourglassSum(List<List<Integer>> arr) {
        // Write your code here
        int max = 0;

        return max;
    }
    
    private static void rotLeftTester() {
        List<Integer> mOrigArray = new ArrayList<>(); 
        mOrigArray.add(1);
        mOrigArray.add(2);
        mOrigArray.add(3);
        mOrigArray.add(4);
        mOrigArray.add(5);
        int d = 4;
        System.out.println("HackerRank Arrays Challenge 2 - Rotate Left = "
            + rotLeft(mOrigArray, d));
    }
	
    /*
     * Complete the 'rotLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER d
     */

    public static List<Integer> rotLeft(List<Integer> a, int d) {
        // Write your code here
        int n = a.size();
        List<Integer> mRotatedArray = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            mRotatedArray.add(a.get((i+d)% n));
        }
        return mRotatedArray;
    }
    
    private static void minimumBribesTester() {
        List<Integer> q = new ArrayList<>();
        q.add(2);
        q.add(1);
        q.add(5);
        q.add(3);
        q.add(4);
        minimumBribes(q);
    }
    
    /*
     * Complete the 'minimumBribes' function below.
     *
     * The function accepts INTEGER_ARRAY q as parameter.
     */

    public static void minimumBribes(List<Integer> q) {
        // Write your code here
        int bribesCounter = 0;
        for (int k = 0; k < q.size(); k++) {
            if (q.get(k) - 2 > k + 1) {
                System.out.println("Too chaotic");
                return;
            }
            for (int x = k - 1; x >= q.get(k) - 2 && x >= 0; x--) {
                if (q.get(x) > q.get(k)) bribesCounter++;
            }
        }
        System.out.println(bribesCounter);
    }
    
    private static void minimumSwapsTest() {
        int[] arr = {7, 1, 3, 2, 4, 5, 6};
        minimumSwaps(arr);
    }
    
    //Complete the minimumSwaps functions below
    private static int minimumSwaps(int[] arr) {
        System.out.println("Array: " + Arrays.toString(arr));
        int mSwaps = 0;
        List<Integer> mList = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == (i+1)) {
                System.out.println("Value: " + arr[i] + " is in the right position.");
                continue;
            } else {
                System.out.println("Value: " + arr[i] + " is in the wrong position.");
            }
        }
        return mSwaps;
    }
    
    public static String maxSubstring(String s) {
        String maxSubString;
        List<String> mArrStrings;
        mArrStrings = getArrayOfUniqueSubStrings(s);
        List<String> mSortedArrStrings = sortArrayListAlphabetically(
            getOptimalArrayOfUniqueSubStrings(mArrStrings));
        maxSubString = mSortedArrStrings.get(mSortedArrStrings.size() -1);
        System.out.println(maxSubString);
        //Return the last entry of the sorted string array as the maximum string.
        return maxSubString;
    }

    /*
        Get all the substrings of the main string.
        add them to the strings array.
    */
    private static List<String> getArrayOfUniqueSubStrings(String s) {
        List<String> mArrStrings = new ArrayList<>();
        for(int i = 0; i <= s.length(); i++) {
            for(int j = (i + 1); j <= s.length(); j++) {
                mArrStrings.add(s.substring(i, j));
            }
        }
        return mArrStrings;
    }
    
    /*
        Make sure that the array of strings is optimal 
        and there are no repeating entries.
    */
    private static List<String> getOptimalArrayOfUniqueSubStrings(List<String> mArrString) {
        Set <String> mSet = new LinkedHashSet<>(mArrString);
        List<String> mOptimalArrStrings = new ArrayList<>(mSet);
        return mOptimalArrStrings;
    }
    
    /*
        Sort the string array alphabetically.
    */
    private static List<String> sortArrayListAlphabetically(List<String> mStrArr) {
        List<String> mSortedArrStrings = mStrArr;
        Collections.sort(mSortedArrStrings);
        return mSortedArrStrings;
    }
    
    private static void QuestionsMarksTester() {
        //String str = "arrb6???4xxbl5???eee5";
        String str = "aa6?9";
        QuestionsMarks(str);
    }
    /*
        Questions Marks
        Have the function QuestionsMarks(str) take the str string parameter, 
        which will contain single digit numbers, letters, and question marks, 
        and check if there are exactly 3 question marks between every pair of 
        two numbers that add up to 10. If so, then your program should return 
        the string true, otherwise it should return the string false. If there 
        aren't any two numbers that add up to 10 in the string, then your 
        program should return false as well.

        For example: if str is "arrb6???4xxbl5???eee5" then your program should 
        return true because there are exactly 3 question marks between 6 and 4, 
        and 3 question marks between 5 and 5 at the end of the string.
    */
    public static String QuestionsMarks(String str) {
        // code goes here  
        String mResultStr = "true";
        //Check if the two numbers add up to 10 from left to right.
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))) {
                int secVal = Character.getNumericValue(str.charAt(i));
                int firstVal = 10 - secVal;
                int qCounter = 0;
                for(int x = (i + 1); x < str.length(); x++) {
                    if(Character.isDigit(str.charAt(x))) {
                        if(Character.getNumericValue(str.charAt(x)) 
                            == firstVal) {
                            if(qCounter == 3) {
                                mResultStr = "true";
                            } else {
                                return "false";
                            }
                        }
                    } else {
                        if(str.charAt(x) == '?') {
                            qCounter++;
                        }
                    }
                }
            }
        }
        System.out.println("return mResultStr = " + mResultStr);
        return mResultStr;
    }
}