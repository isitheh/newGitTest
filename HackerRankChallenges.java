
package hackerrankchallenges;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        sockMerchantTester();           //Challenge 1
        countingValleysTester();        //Challenge 2
        jumpingOnCloudsTester();        //Challenge 3
        repeatedStringTester();         //Challenge 4
		
        //Arrays Challenges
        twoDArraysDSTester();           //Challenge 1
        rotLeftTester();                //Challenge 2
        minimumBribesTester();          //Challenge 3
        minimumSwapsTest();             //Challenge 4
        
        //Practice Questions Hackerrank.com 
        fizzBuzzTester(); //55 min
        
        //Standard bank test Question 1
        maxSubstring("baca");	//Solution passed all test cases.
        
        //CoderByte Prep Challenges
        QuestionsMarksTester();             //Challenge 1
        BracketMatcherTester();             //Challenge 2  
        BracketCombinationsTester();        //Challenge 3
        MinWindowSubstringTester();         //Challenge 4
        CodelandUsernameValidationTester(); //Challenge 5
        TreeConstructorTester();            //Challenge 6
        FindIntersectionTest();             //Challenge 7
        FirstReverseTester();               //Challenge 8
        LongestWordTester();                //Challenge 9
        ArithGeoTester();                   //Challenge 10
        ArrayAdditionITester();             //Challenge 11
        ConsecutiveTester();                //Challenge 12
        CountingMinutesTester();            //Challenge 13
        KUniqueCharactersTester();          //Challenge 14
        StringReductionTester();            //Challenge 15
        NumberEncodingTester();             //Challenge 16
        StringReducerTester();              //Challenge 17
        PowersofTwoTester();                //Challenge 18
        ProductDigitsTester();              //Challenge 19
        OtherProductsTester();              //Challenge 20
        MovingMedianTester();               //Challenge 21	
        PrimeMoverTester();                 //Challenge 22	
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
                //System.out.println("Value: " + arr[i] + " is in the right position.");
                continue;
            } else {
                //System.out.println("Value: " + arr[i] + " is in the wrong position.");
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
        System.out.println("CoderByte Challenge 1 - Questions Marks: " + QuestionsMarks(str));
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

    private static void BracketMatcherTester() {
        String str = "the color re(d))()(()";
        System.out.println("CoderByte Challenge 2 - Bracket Matcher: " + BracketMatcher(str));
    }
    
    /*
        Have the function BracketMatcher(str) take the str parameter being 
        passed and return 1 if the brackets are correctly matched and each one 
        is accounted for. Otherwise return 0. For example: if str is 
        "(hello (world))", then the output should be 1, but if str is 
        "((hello (world))" the the output should be 0 because the brackets do 
        not correctly match up. Only "(" and ")" will be used as brackets. 
        If str contains no brackets return 1.
    */
    private static String BracketMatcher(String str) {
        // code goes here  
        if(!str.contains("(") || !str.contains(")")) {
            //If str contains no brackets return 1.
            return "1";
        }
        
        long countOpenBracket = str.chars().filter(mChar -> mChar == '(').count();
        long countCloseBracket = str.chars().filter(mChar -> mChar == ')').count();
        if(countOpenBracket == countCloseBracket) {
            int openBrace = 0;
            int closeBrace = 0;
            for(int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == '(') openBrace++;
                if(str.charAt(i) == ')') closeBrace++;
                if(closeBrace > openBrace) {
                    //If at any point we encounter a closing bracket before an opening bracket
                    return "0";
                }
            }
            return "1";
        } else {
            //If str contains more opening than closing brackets return 0.
            //If str contains more closing than opening brackets return 0.
            return "0";
        }
    }
    
    private static void BracketCombinationsTester() {
        int num = 8;
        System.out.println("CoderByte Challenge 3 - Bracket Combinations: " + BracketCombinations(num));
    }
    
    /*
        Bracket Combinations
        Have the function BracketCombinations(num) read num which will be an 
        integer greater than or equal to zero, and return the number of valid 
        combinations that can be formed with num pairs of parentheses. 
        For example, if the input is 3, then the possible combinations of 
        3 pairs of parenthesis, namely: ()()(), are ()()(), ()(()), (())(), 
        ((())), and (()()). There are 5 total combinations when the input is 3, 
        so your program should return 5.
    */
    private static int BracketCombinations(int num) {
        // code goes here  
        //Given num number of pairs of brackets, how many combinations of brackets an be formed?
        if(num == 0) return 1;
        if(num == 1) return 1;
        if(num == 2) return 2;
        int result = (int) (factorial(num * 2)/(factorial(num + 1) * factorial(num)));
        return result;
    }

    private static long factorial(int n) {
        long factorialValue = 1;
        for(int i = 1; i <= n; i++) {
          factorialValue = factorialValue*i;
        }
        return factorialValue;
    }

    private static void MinWindowSubstringTester() {
        System.out.println("CoderByte Challenge 4 - Min Window Substring: " + MinWindowSubstring(new String[] {"aaffhkksemckelloe", "fhea"}));
        MinWindowSubstring(new String[] {"aaffhkksemckelloe", "fhea"});
    }
    
    /*
        Min Window Substring
        Have the function MinWindowSubstring(strArr) take the array of strings 
        stored in strArr, which will contain only two strings, the first 
        parameter being the string N and the second parameter being a string K 
        of some characters, and your goal is to determine the smallest substring
        of N that contains all the characters in K. For example: if strArr is 
        ["aaabaaddae", "aed"] then the smallest substring of N that contains the
        characters a, e, and d is "dae" located at the end of the string. 
        So for this example your program should return the string dae.

        Another example: if strArr is ["aabdccdbcacd", "aad"] then the smallest 
        substring of N that contains all of the characters in K is "aabd" which 
        is located at the beginning of the string. Both parameters will be 
        strings ranging in length from 1 to 50 characters and all of K's 
        characters will exist somewhere in the string N. Both strings will 
        only contains lowercase alphabetic characters.
    */
    
    private static String MinWindowSubstring(String[] strArr) {
        // code goes here 
        //String array - strArr contains only two strings
        String mainString = strArr[0];
        String searchString = strArr[1];
        HashMap<Integer, String> charIndex = new HashMap<>();
        List<String> mNonRepeatChar = new ArrayList<>();
        List<String> mRepeatChar = new ArrayList<>();
        Integer baseIndex = 0;
        List<Integer> subStringValidArray = new ArrayList<>();

        for(int i = 0; i < mainString.length(); i++) {
            for(int k = 0; k < searchString.length(); k++) {
                if(mainString.charAt(i) == searchString.charAt(k)) {
                    if(!charIndex.containsKey(i)) {
                        if(!charIndex.containsValue(String.valueOf(mainString.charAt(i)))) {
                            mNonRepeatChar.add(String.valueOf(mainString.charAt(i)));
                        } else {
                            mNonRepeatChar.remove(String.valueOf(mainString.charAt(i)));
                            mRepeatChar.add(String.valueOf(mainString.charAt(i)));
                        }
                        charIndex.put(i, String.valueOf(mainString.charAt(i)));
                    }
                }
            }  
        }

        for(Map.Entry<Integer, String> entry : charIndex.entrySet()) {
            for(int j = 0; j < mNonRepeatChar.size(); j++) {
                if((mNonRepeatChar.get(j)).equals(entry.getValue())) {
                    baseIndex = entry.getKey();
                    break;
                }
            }
        }

        subStringValidArray.add(baseIndex);
        for (int x = 0; x < mRepeatChar.size(); x++) {
            //In the main array, get the one closet to the base index.
            List<Integer> repeatCharsIndex = new ArrayList<>();
            for(Map.Entry<Integer, String> mEntry : charIndex.entrySet()) {
              if(mEntry.getValue().equals(mRepeatChar.get(x))) {
                repeatCharsIndex.add(mEntry.getKey());
                mEntry.getValue();
              }
            }
            //Get which value is closest to base index
            int distance = Math.abs(repeatCharsIndex.get(0) - baseIndex);
            int index = 0;
            for (int k = 1; k < repeatCharsIndex.size(); k++) {
                int kDistance = Math.abs(repeatCharsIndex.get(k) - baseIndex);
                if(kDistance < distance) {
                    index = k;
                    distance = kDistance;
                }
            }
            int validIndex = repeatCharsIndex.get(index);
            if(!subStringValidArray.contains(validIndex)) {
                subStringValidArray.add(validIndex);
            }
        }

        int min = subStringValidArray.get(0);
        for(int n = 0; n < subStringValidArray.size(); n++) {
            if(min > subStringValidArray.get(n)) {
              min = subStringValidArray.get(n);
            }
        }

        int max = subStringValidArray.get(0);
        for(int n = 0; n < subStringValidArray.size(); n++) {
            if(max < subStringValidArray.get(n)) {
              max = subStringValidArray.get(n);
            }
        }

        String mMinSubString = mainString.substring(min, (max + 1));
        return mMinSubString;
    }
    
    private static void CodelandUsernameValidationTester() {
        System.out.println("CoderByte Challenge 5 -  CodelandUsername Validation: " + 
            CodelandUsernameValidation("u__hello_world123"));
    }
    
    /*
        Codeland Username Validation
        Have the function CodelandUsernameValidation(str) take the str parameter
        being passed and determine if the string is a valid username according 
        to the following rules:

        1. The username is between 4 and 25 characters.
        2. It must start with a letter.
        3. It can only contain letters, numbers, and the underscore character.
        4. It cannot end with an underscore character.

        If the username is valid then your program should return the string 
        true, otherwise return the string false.
    */     
    private static String CodelandUsernameValidation(String str) {
        // code goes here  
        if(Character.isLetter(str.charAt(0))) {
            //Username starts with a letter
            if(str.length() > 3 && str.length() < 26) {
                //The username is between 4 and 25 characters.
                if(str.charAt(str.length() - 1) != '_') {
                    //It cannot end with an underscore character..
                    int mStringLen = str.length();
                    int counter = 0;
                    for(int i = 0; i < mStringLen; i++) {
                        if(Character.isLetter(str.charAt(i))) counter++;
                        if(Character.isDigit(str.charAt(i))) counter++;
                        if(str.charAt(i) == '_') counter++;
                    }
                    if(counter == mStringLen) {
                        //The string contains only letters, numbers and underscore
                        //All valid conditions have been met.
                        return "true";
                    } else {
                        //Not all valid conditions have been met.
                        return "false";
                    }
                }  else {
                    //The username ends with an underscore character.
                    return "false";
                }
            } else {
                //The username is not between 4 and 25 characters.
                return "false";
            }
        } else {
          //Username does not start with a letter
          return "false";
        }
    }

    private static void TreeConstructorTester() {
        System.out.println("CoderByte Challenge 6 -  Tree Constructor: " + 
                TreeConstructor(new String[] {"(2,5)", "(2,6)"}));
    }
    /*
        Have the function TreeConstructor(strArr) take the array of strings 
        stored in strArr, which will contain pairs of integers in the following 
        format: (i1,i2), where i1 represents a child node in a tree and the 
        second integer i2 signifies that it is the parent of i1.Your program 
        should, in this case, return the string true because a valid binary tree
        can be formed. If a proper binary tree cannot be formed with the integer
        pairs, then return the string false. All of the integers within the tree
        will be unique, which means there can only be one node in the tree with 
        the given integer value.
    */
    private static String TreeConstructor(String[] strArr) {
        // code goes here
        List<String> allChildren = new ArrayList<>();
        for (String strArr1 : strArr) {
            List<String> mKeysArray = new ArrayList<>();
            List<String> mValuesArray = new ArrayList<>();
            String mString = strArr1;
            mString = mString.replace("(", "").replace(")", "");
            String[] mArr = mString.split(",");
            if(!mKeysArray.contains(mArr[1])) {
                mKeysArray.add(mArr[1]);
                for (String xString : strArr) {
                    xString = xString.replace("(", "").replace(")", "");
                    String[] xArr = xString.split(",");
                    if(mArr[1].equals(xArr[1])) {
                        if(!mValuesArray.contains(xArr[0])) {
                            mValuesArray.add(xArr[0]);
                        } else {
                            return "false";
                        }
                    }
                }
                if(!allChildren.contains(mArr[0])) {
                    allChildren.add(mArr[0]);
                } else {
                    return "false";
                }
            } if(mValuesArray.size() > 2) {
                return "false";
            }
        }
        return "true";
    }
    
    private static void FindIntersectionTest() {
        System.out.println("CoderByte Challenge 7 -  Find Intersection: " + 
            FindIntersection(new String[] {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"}));
    }
    
    /*
        Have the function FindIntersection(strArr) read the array of strings 
        stored in strArr which will contain 2 elements: the first element will 
        represent a list of comma-separated numbers sorted in ascending order, 
        the second element will represent a second list of comma-separated 
        numbers (also sorted). Your goal is to return a comma-separated string 
        containing the numbers that occur in elements of strArr in sorted order.
        If there is no intersection, return the string false.
    */
    private static String FindIntersection(String[] strArr) {
        // strArr will always contain 2 elements.    
        //Create 2 comma seperated string arrays.
        String[]  mArr1 = strArr[0].split(","); //First element of strArr
        String[]  mArr2 = strArr[1].split(","); //Second element of strArr
        String mReturnArray = "";
        for(int i = 0; i < mArr1.length; i++) {
          for(int j = 0; j < mArr2.length; j++) {
            if((mArr1[i].replace(" ", "")).
                equals(mArr2[j].replace(" ", ""))) {
              //Add intersecting value to the comma seperated string.
              mReturnArray += mArr1[i] + ",";
            }
          }
        }
        if(mReturnArray.isEmpty()) {
          return "false";
        }
        mReturnArray = mReturnArray.substring(0, mReturnArray.length() - 1);
        return mReturnArray;
    }
    
    private static void FirstReverseTester() {
        System.out.println("CoderByte Challenge 8 -  First Reverse: " + 
            FirstReverse("Coderbyte"));
    }
    
    /*
        First Reverse
        Have the function FirstReverse(str) take the str parameter being passed 
        and return the string in reversed order. For example: if the input 
        string is "Hello World and Coders" then your program should return 
        the string sredoC dna dlroW olleH.
    */
    private static String FirstReverse(String str) {
        // code goes here  
        String mReversedStr = "";
        for(int i = (str.length() - 1); i >= 0; i--) {
            mReversedStr += str.charAt(i);
        }
        return mReversedStr;
    }
    
    private static void LongestWordTester() {
        System.out.println("CoderByte Challenge 9 -  Longest Word: " + 
            LongestWord("Hello world123 567"));
    }
    
    /*
        Longest Word
        Have the function LongestWord(sen) take the sen parameter being passed
        and return the longest word in the string. If there are two or more 
        words that are the same length, return the first word from the string 
        with that length. Ignore punctuation and assume sen will not be empty. 
        Words may also contain numbers, for example "Hello world123 567"
    */
    private static String LongestWord(String sen) {
        //Seperate strings using spaces
        //List of punctuations = "`~!@#$%^&*()_+{}|:<>?-=[]/,";
        String mLongestWord;
        int lengthLongWord;
        sen = sen.replace("&", " ").replace("!", " ").replace("?", " ").replace(",", " ")
            .replace("-", " ").replace("=", " ").replace("^", " ").replace("`", " ").replace(";", " ")
            .replace("~", " ").replace("@", " ").replace("#", " ").replace("$", " ").replace("%", " ")
            .replace(":", " ").replace(";", " ").replace("<", " ").replace(">", " ").replace("[", " ")
            .replace("]", " ").replace("{", " ").replace("}", " ").replace("/", " ").replace("\\", " ");
        String[] strArr = sen.split(" ");
        lengthLongWord = strArr[0].length();
        mLongestWord = strArr[0];
        for(int i = 1; i < strArr.length; i++) {
            if(strArr[i].length() > lengthLongWord) {
                lengthLongWord = strArr[i].length();
                mLongestWord = strArr[i];
            }
        }
        return mLongestWord;
    }
	
    private static void ArithGeoTester() {
        System.out.println("CoderByte Challenge 10 -  Arith Geo: " + 
            ArithGeo(new int[] {1,2,3,4}));
    }
    
    /*
        Arith Geo
        Have the function ArithGeo(arr) take the array of numbers stored in arr 
        and return the string "Arithmetic" if the sequence follows an arithmetic
        pattern or return "Geometric" if i ern. If the 
        sequence doesn't follow either pattern return -1. An arithmetic sequence 
        is one where the difference between each of the numbers is consistent, 
        where as in a geometric sequence, each term after the first is multiplied 
        by some constant or common ratio. Arithmetic example: [2, 4, 6, 8] and 
        Geometric example: [2, 6, 18, 54]. Negative numbers may be entered as 
        parameters, 0 will not be entered, and no array will contain all the 
        same elements.
    */
    private static String ArithGeo(int[] arr) {
        //Get the number of array entries
        int arrLen = arr.length;
        //Push all diff values into a List
        List<Integer> mDiffArray = new ArrayList<>();
        //Push all multiDiff values into a List
        List<Integer> multiDiffArray = new ArrayList<>();
        for(int i = (arrLen -1); i > 0; i--) {
            int diff = arr[i] - arr[i-1];
            mDiffArray.add(diff);
            int multiDiff = arr[i]/arr[i-1];
            multiDiffArray.add(multiDiff);
        }
        if(mDiffArray.stream().distinct().count() <= 1) {
            return "Arithmetic";
        } else if(multiDiffArray.stream().distinct().count() <= 1) {
            return "Geometric";
        } else {
            return "-1";
        }
    }
    
    private static void ArrayAdditionITester() {
        System.out.println("CoderByte Challenge 11 -  Array Addition I: " + 
            ArrayAdditionI(new int[] {1,2,3,4}));
    }
    
    /*
        Array Addition I
        Have the function ArrayAdditionI(arr) take the array of numbers stored 
        in arr and return the string true if any combination of numbers in the 
        array (excluding the largest number) can be added up to equal the 
        largest number in the array, otherwise return the string false. 
        For example: if arr contains [4, 6, 23, 10, 1, 3] the output should 
        return true because 4 + 6 + 10 + 3 = 23. The array will not be empty, 
        will not contain all the same elements, and may contain negative numbers.
    */
    private static String ArrayAdditionI(int[] arr) {
        //Get and remove the largest number in the array
        Arrays.sort(arr);
        int mLargestNumber = arr[(arr.length - 1)];
        Arrays.copyOf(arr, (arr.length - 1));
        int mSum = 0;
        for(int i = 0; i < arr.length; i++) {
            mSum += arr[i];
        }

        if(mSum == mLargestNumber) {
            return "true";
        } else if(mSum < mLargestNumber) {
            return "false";
        } else if(mSum > mLargestNumber) {
            //Remove some array elements
        }
        return "false";
    }
    private static void ConsecutiveTester() {
        System.out.println("CoderByte Challenge 12 -  Consecutive: " + 
            Consecutive(new int[] {-2,10,4}));
    }
    /*
        Consecutive
        Have the function Consecutive(arr) take the array of integers stored in 
        arr and return the minimum number of integers needed to make the 
        contents of arr consecutive from the lowest number to the highest 
        number. For example: If arr contains [4, 8, 6] then the output should 
        be 2 because two numbers need to be added to the array (5 and 7) to 
        make it a consecutive array of numbers from 4 to 8. Negative numbers 
        may be entered as parameters and no array will have less than 2 elements.
    */
    private static int Consecutive(int[] arr) {
        int mCounter = 0;
        List<Integer> mArrList = new ArrayList<>();
        // Sort the array  
        Arrays.sort(arr);
        //Get smallest value
        int smallest = arr[0];
        int largest = arr[(arr.length - 1)];
        int sizeArr = arr.length;
        //Move array elements into a List array.
        for(int x = 0; x < sizeArr; x++) {
          mArrList.add(arr[x]);
        }
        //Check if array contains value
        for(int i = smallest; i <= largest; i++) {
          if(!mArrList.contains(i)) {
            mCounter++;
          }
        }
        return mCounter;
    }
    
    private static void CountingMinutesTester()  {
        try {
            System.out.println("CoderByte Challenge 13 -  Counting Minutes: " +
                    CountingMinutes("2:03pm-1:39pm"));
        } catch (ParseException ex) {
            Logger.getLogger(HackerRankChallenges.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /*
        Counting Minutes
        Have the function CountingMinutes(str) take the str parameter being 
        passed  which will be two times (each properly formatted with a colon 
        and am or pm) separated by a hyphen and return the total number of 
        minutes between the two times. The time will be in a 12 hour clock 
        format. For example: if str is 9:00am-10:00am then the output should be 
        60. If str is 1:00pm-11:00am the output should be 1320.
    
        1. For input "12:30pm-12:00am" the output was incorrect. The correct output is 690
        2. For input "2:03pm-1:39pm" the output was incorrect. The correct output is 1416
        3. For input "2:08pm-2:00am" the output was incorrect. The correct output is 712
        4. For input "2:00pm-3:00pm" the output was incorrect. The correct output is 60
        5. For input "11:00am-2:10pm" the output was incorrect. The correct output is 190
        6. For input "12:31pm-12:34pm" the output was incorrect. The correct output is 3
        7. For input "5:00pm-5:11pm" the output was incorrect. The correct output is 11
    */
    public static Long CountingMinutes(String str) throws ParseException {
        String[] timesArr = str.split("-");
        String mTime1 = timesArr[0];
        String mTime2 = timesArr[1];
        Date mDate1 = (new SimpleDateFormat("hh:mma")).parse(mTime1);
        Date mDate2 = (new SimpleDateFormat("hh:mma")).parse(mTime2);
        if (mDate2.before(mDate1)) {
          mDate2 = new Date(mDate2.getTime() + TimeUnit.DAYS.toMillis(1));
        }
        return (mDate2.getTime() - mDate1.getTime()) / 60000 ;
    }
    
    private static void KUniqueCharactersTester() {
        System.out.println("CoderByte Challenge 14 - K Unique Characters: " + 
            KUniqueCharacters("2aabbcbbbadef"));
    }
    /*
        K Unique Characters
        Have the function KUniqueCharacters(str) take the str parameter being 
        passed and find the longest substring that contains k unique characters,
        where k will be the first character from the string. The substring will 
        start from the second position in the string because the first character
        will be the integer k. For example: if str is "2aabbacbaa" there are 
        several substrings that all contain 2 unique characters, namely: 
        ["aabba", "ac", "cb", "ba"], but your program should return "aabba" 
        because it is the longest substring. If there are multiple longest 
        substrings, then return the first substring encountered with the 
        longest length. k will range from 1 to 6.
    */
    private static String KUniqueCharacters(String str) {
        //Get vakue k
        int k = Character.getNumericValue(str.charAt(0)); 
        String mSubStr = str.substring(1);
        //Get all substrings with k unique letters
        List<String> mUniqueLetterStringArray = new ArrayList<>();
        String buildString = "";
        int counter = 0;
        for(int i = 0; i < mSubStr.length(); i++) {
          String mCharacter = mSubStr.substring(i, (i+1));
          if(!(buildString.contains(mCharacter))) {
            if(counter < k) {
              counter++;
            } else {
              mUniqueLetterStringArray.add(buildString);
              buildString = "";
              counter = 0;
              i--;
              mCharacter = mSubStr.substring(i, (i+1));
              counter++;
            }
          }
          buildString = buildString.concat(mCharacter);
        }
        mUniqueLetterStringArray.add(buildString);
        //Go through the array of substrings and pick the longest substring
        String returnString = mUniqueLetterStringArray.get(0);
        for(String mStr: mUniqueLetterStringArray) {
          if(mStr.length() > returnString.length()) {
            returnString = mStr;
          }
        }
        return returnString;
    }
    
    private static void StringReductionTester() {
        System.out.println("CoderByte Challenge 15 - String Reduction: " + 
            StringReduction("2aabbcbbbadef"));
    }
    
    /*
        String Reduction
        Have the function StringReduction(str) take the str parameter being 
        passed and return the smallest number you can get through the following 
        reduction method. The method is: Only the letters a, b, and c will be 
        given in str and you must take two different adjacent characters and 
        replace it with the third. For example "ac" can be replaced with "b" but
        "aa" cannot be replaced with anything. This method is done repeatedly 
        until the string cannot be further reduced, and the length of the 
        resulting string is to be outputted.

        For example: if str is "cab", then "ca" can be reduced to "b" and you 
        get "bb" (you can also reduce it to "cc"). The reduction is done so the
        output should be 2. If str is "bcab", "bc" reduces to "a", so you have 
        "aab", then "ab" reduces to "c", and the final string "ac" is reduced 
        to "b" so the output should be 1.
    */
    private static String StringReduction(String str) {
        // code goes here  
        return str;
    }
    
    private static void NumberEncodingTester() {
        System.out.println("CoderByte Challenge 16 - Number Encoding: " + 
            NumberEncoding("abc"));
    }
    /*
        Number Encoding
        Have the function NumberEncoding(str) take the str parameter and encode 
        the message according to the following rule: encode every letter into 
        its corresponding numbered position in the alphabet. Symbols and spaces 
        will also be used in the input. For example: if str is "af5c a#!" then 
        your program should return 1653 1#!.
    */
    private static String NumberEncoding(String str) {
        // code goes here  
        int encodedStr;
        String mBuiltString = "";
        for(int i = 0; i < str.length(); i++) {
            if(Character.isLetter(str.charAt(i))) {
              encodedStr = getNumericalEquivalent(str.charAt(i));
              mBuiltString += encodedStr;
            } else {
              mBuiltString += str.charAt(i);
            }
        }
        return mBuiltString;
    }
    
    private static int getNumericalEquivalent(char mChar) {
        return switch (mChar) {
            case 'a' -> 1;
            case 'b' -> 2;
            case 'c' -> 3;
            case 'd' -> 4;
            case 'e' -> 5;
            case 'f' -> 6;
            case 'g' -> 7;
            case 'h' -> 8;
            case 'i' -> 9;
            case 'j' -> 10;
            case 'k' -> 11;
            case 'l' -> 12;
            case 'm' -> 13;
            case 'n' -> 14;
            case 'o' -> 15;
            case 'p' -> 16;
            case 'q' -> 17;
            case 'r' -> 18;
            case 's' -> 19;
            case 't' -> 20;
            case 'u' -> 21;
            case 'v' -> 22;
            case 'w' -> 23;
            case 'x' -> 24;
            case 'y' -> 25;
            case 'z' -> 26;
            default -> 0;
        };
    }
    
    private static void StringReducerTester() {
        System.out.println("CoderByte Challenge 17 - String Reducer: " + 
            StringReducer("abcabc"));
    }
    
    /*
        String Reduction
        Have the function StringReduction(str) take the str parameter being 
        passed and return the smallest number you can get through the following 
        reduction method. The method is: Only the letters a, b, and c will be 
        given in str and you must take two different adjacent characters and 
        replace it with the third. For example "ac" can be replaced with "b" 
        but "aa" cannot be replaced with anything. This method is done 
        repeatedly until the string cannot be further reduced, and the 
        length of the resulting string is to be outputted.

        For example: if str is "cab", then "ca" can be reduced to "b" and you 
        get "bb" (you can also reduce it to "cc"). The reduction is done so the
        output should be 2. If str is "bcab", "bc" reduces to "a", so you have 
        "aab", then "ab" reduces to "c", and the final string "ac" is reduced 
        to "b" so the output should be 1.
    */
    private static int StringReducer(String str) {
        while(true){
            String string = str;
            string = string.replaceFirst("ab", "c");
            string = string.replaceFirst("ac", "b");
            string = string.replaceFirst("ba", "c");
            string = string.replaceFirst("bc", "a");
            string = string.replaceFirst("ca", "b");
            string = string.replaceFirst("cb", "a");
            return string.length();
        }
    }
    private static void PowersofTwoTester() {
        System.out.println("CoderByte Challenge 18 - Powers Of Two: " + 
            PowersofTwo(8));
    }
    /*
        Powers of Two
        Have the function PowersofTwo(num) take the num parameter being passed 
        which will be an integer and return the string true if it's a power of 
        two. If it's not return the string false. For example if the input is 
        16 then your program should return the string true but if the input is 
        22 then the output should be the string false.
    */
    private static String PowersofTwo(int num) {
        if(num == 2) {
            return "true";
        }
        double resultSqr = Math.sqrt(num);
        double resultCube = Math.cbrt(num);
        if((resultSqr % 2) == 0 || (resultCube % 2) == 0) {
          return "true";
        } 
        return "false";
    }
    
    private static void ProductDigitsTester() {
        System.out.println("CoderByte Challenge 19 - Product Digits: " + 
            ProductDigits(24));
    }
    /*
        Product Digits
        Have the function ProductDigits(num) take the num parameter being passed
        which will be a positive integer, and determine the least amount of 
        digits you need to multiply to produce it. For example: if num is 24 
        then you can multiply 8 by 3 which produces 24, so your program should 
        return 2 because there is a total of only 2 digits that are needed. 
    
        Another example: if num is 90, you can multiply 10 * 9, so in this case 
        your program should output 3 because you cannot reach 90 without using 
        a total of 3 digits in your multiplication.
    */
    private static int ProductDigits(int num) {
        int divisor = 9;
        int result = 1;
        while ((result * divisor) != num) {
          divisor--;
          result = num / divisor;
        }
        int resLen = String.valueOf(result).length();
        int divLen = String.valueOf(divisor).length();
        return (resLen + divLen);
    }
    
    private static void OtherProductsTester() {
        System.out.println("CoderByte Challenge 20 - Other Products: " + 
            OtherProducts(new int[] {1,4,6,19,3}));
    }
    
    /*
        Other Products
        Have the function OtherProducts(arr) take the array of numbers stored 
        in arr and return a new list of the products of all the other numbers 
        in the array for each element. For example: if arr is [1, 2, 3, 4, 5] 
        then the new array, where each location in the new array is the product 
        of all other elements, is [120, 60, 40, 30, 24]. The following 
        calculations were performed to get this answer: [(2*3*4*5), (1*3*4*5), 
        (1*2*4*5), (1*2*3*5), (1*2*3*4)]. You should generate this new array 
        and then return the numbers as a string joined by a 
        hyphen: 120-60-40-30-24. The array will contain at most 10 elements 
        and at least 1 element of only positive integers.
        1. For input new int[] {1,4,6,19,3} the output was incorrect. 
        The correct output is 1368-342-228-72-456

        2. For input new int[] {1,2,4,8,16} the output was incorrect. 
        The correct output is 1024-512-256-128-64
    */
    private static String OtherProducts(int[] arr) {
        // code goes here  
        List<Integer> mProductArray = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            String mProduct = "";
            int mProductValue = 1;
            int skipIndex = i;
            for(int j = 0; j < arr.length; j++) {
                if(j != skipIndex) {
                    mProduct = mProduct.concat((String.valueOf(arr[j]) + ","));
                    String [] mProdArr = mProduct.split(",");
                    if(mProdArr.length == (arr.length - 1)) {
                        for(int x = 0; x < mProdArr.length; x++) {
                            mProductValue *= Integer.valueOf(mProdArr[x]);
                        }
                        mProduct = mProduct.substring(0, (mProduct.length() - 1));
                        mProductArray.add(mProductValue);
                    }
                } 
            }
        }
        String buildString = "";
        for(int k = 0; k < mProductArray.size(); k++) {
          buildString += String.valueOf(mProductArray.get(k) + "-");
        }
        buildString = buildString.substring(0, buildString.length() - 1);
        return buildString;
    }
    
    private static void MovingMedianTester() {
        System.out.println("CoderByte Challenge 21 - Moving Median: " + 
            MovingMedian(new int[] {3, 0, 0, -2, 0, 2, 0, -2}));
    } 
    /*
        Moving Median
        Have the function MovingMedian(arr) read the array of numbers stored in 
        arr which will contain a sliding window size, N, as the first element 
        in the array and the rest will be a list of numbers. Your program should
        return the Moving Median for each element based on the element and its 
        N-1 predecessors, where N is the sliding window size. The final output 
        should be a string with the moving median corresponding to each entry 
        in the original array separated by commas.

        Note that for the first few elements (until the window size is reached), 
        the median is computed on a smaller number of entries. For example: if 
        arr is [3, 1, 3, 5, 10, 6, 4, 3, 1] then your program should output 
        "1,2,3,5,6,6,4,3"
    */
    private static int MovingMedian(int[] arr) {
        // code goes here  
        return arr[0];
    }

    private static void PrimeMoverTester() {
        System.out.println("CoderByte Challenge 22 - Prime Mover: " +
            PrimeMover(16));
    }
    /*
        Prime Mover
        Have the function PrimeMover(num) return the numth prime number.  The 
        range will be from 1 to 10^4. For example: if num is 16 the output 
        should be 53 as 53 is the 16th prime number.
    */
    public static int PrimeMover(int num) {
        // code goes here 
        List<Integer> mPrimesOnly = new ArrayList<>();
        int maxNum = 10000;
        for(int i = 1; i <= maxNum; i++) {
          if(i == 0 || i == 1) {
            continue;
          }
          boolean isPrime = true; //Treat as
          for(int x = 2; x <= (i/2); ++x) {
            if(i % x == 0) {
              isPrime = false;
              break;
            } 
          }
          if(isPrime) {
            mPrimesOnly.add(i);
          }
        }
        int result = mPrimesOnly.get(num - 1);
        return result;
    }
}