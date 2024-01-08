package hackerrankchallenges;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Objects;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sithembiso SamaJobe
 */
public class CoderbyteChallenges {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
        PalindromeTwoTester();              //Challenge 23	
        RemoveBracketsTester();             //Challenge 24	
        StringPeriodsTester();              //Challenge 25	
        RunLengthTester();                  //Challenge 26	
        StepWalkingTester();                //Challenge 27	
        MultipleBracketsTester();           //Challenge 28	
        LargestRowColumnTest();             //Challenge 29
        StringZigzagTester();               //Challenge 30
        ClosestEnemyIITester();             //Challenge 31  
        FibonacciCheckerTester();           //Challenge 32
        PalindromeTester();                 //Challenge 33
        ReversePolishNotationTester();      //Challenge 34
        PalindromicSubstringTester();       //Challenge 35
        MaxSubarrayTester();                //Challenge 36
        ParallelSumsTester();               //Challenge 37
        MaximalSquareTester();              //Challenge 38
        SymmetricTreeTester();              //Challenge 39
        TwoSumTester();			    //Challenge 40
        PreorderTraversalTester();          //Challenge 41
        EquivalentKeypressesTester();       //Challenge 42
        BitmapHolesTester();                //Challenge 43
        TrappingWaterTester();              //Challenge 44
        PlusMinusTester();		    //Challenge 45
        FizzBuzzTester();                   //Challenge 46
        HDistanceTester();                  //Challenge 47
        DifferentCasesTester();             //Challenge 48
        RectangleAreaTester();              //Challenge 49
        PrimeTimeTester();                  //Challenge 50
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
        for (String mArr11 : mArr1) {
            for (String mArr21 : mArr2) {
                if ((mArr11.replace(" ", "")).
                        equals(mArr21.replace(" ", ""))) {
                    //Add intersecting value to the comma seperated string.
                    mReturnArray += mArr11 + ",";
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
            Logger.getLogger(CoderbyteChallenges.class.getName()).log(Level.SEVERE, null, ex);
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
    private static Long CountingMinutes(String str) throws ParseException {
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
        String formSubstring = "";
        List<String> mStringList = new ArrayList<>();
        int uniqueChars = 0;
        for(int i = 0; i < mSubStr.length(); i++) {
            if(uniqueChars < k) {
                if(!formSubstring.contains(String.valueOf(mSubStr.charAt(i)))) {
                  uniqueChars++;
                }
                formSubstring += String.valueOf(mSubStr.charAt(i));
                if(i == (mSubStr.length() -1)) {
                  //End of string just save the substring
                  mStringList.add(formSubstring);
                }
            } else if(uniqueChars == k) {
            if(formSubstring.contains(String.valueOf(mSubStr.charAt(i)))) {
                formSubstring += String.valueOf(mSubStr.charAt(i));
                if(i == (mSubStr.length() -1)) {
                  //End of string just save the substring
                  mStringList.add(formSubstring);
                }
            } else {
                mStringList.add(formSubstring);
                formSubstring = "";
                uniqueChars = 0;
                i = i - 2;
            }
          }
        }

        String mLongestSubStr = mStringList.get(0);
        for(String mStr: mStringList) {
          if(mStr.length() > mLongestSubStr.length()) {
            mLongestSubStr = mStr;
          }
        }
        return mLongestSubStr;
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
        "1,2,3,5,6,6,4,3".
    */
    private static List<Integer> MovingMedian(int[] arr) {
        // code goes here
        int arraySize_N = arr[0];
        List<Integer> resMedianArray = new ArrayList<>();
        int[] mArr = arr; 
        for(int x = 1; x < arr.length; x++) {
            mArr[x-1] = arr[x];
        }
        //Now work with mArr
        int mArray[] = Arrays.copyOf(mArr, (mArr.length -1));
        //Now work with mArray
        for(int i = 0; i < mArray.length; i++) {
            resMedianArray.add(getNextSubArray(i, mArray, arraySize_N));
            if(resMedianArray.size() == arraySize_N) {
                Collections.reverse(resMedianArray);
            }
        }
        return resMedianArray;
    }

    private static int getNextSubArray(int startPos, int[] anArray, int arraySize) {
        List<Integer> resultSubArray = new ArrayList<>();
        int resMedian = 0;
        int stopPos = 0;
        if(startPos < arraySize) {
            stopPos = arraySize - startPos;
            for(int i = 0; i < stopPos; i++) {
                try {
                  resultSubArray.add(anArray[i]);
                } catch (ArrayIndexOutOfBoundsException ex) {

                }
            }
        } else {
            stopPos = startPos;
            startPos = (stopPos + 1) - arraySize;
            for(int i = startPos; i <= stopPos; i++) {
                resultSubArray.add(anArray[i]);
            }
        }
        Collections.sort(resultSubArray);
        if(resultSubArray.size() == 1) {
            resMedian = resultSubArray.get(0);
        } if(resultSubArray.size() == 2) {
            resMedian = (resultSubArray.get(0) + resultSubArray.get(1))/2;
        } else if(resultSubArray.size() % 2 == 0) {
            int mid = 0 + (resultSubArray.size() - 1)/2;
            resMedian = (resultSubArray.get(mid) + resultSubArray.get(mid+1))/2;
        } else {
            int mid = 0 + (resultSubArray.size() - 1)/2;
            resMedian = resultSubArray.get(mid);
        }
        return resMedian;
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
	
    private static void PalindromeTwoTester() {
        System.out.println("CoderByte Challenge 23 - Palindrome Two: " +
            PalindromeTwo("Anne, I vote more cars race Rome-to-Vienna"));
    }

    /*
        Palindrome Two
        Have the function PalindromeTwo(str) take the str parameter being passed 
        and return the string true if the parameter is a palindrome, 
        (the string is the same forward as it is backward) otherwise return the
        string false. The parameter entered may have punctuation and symbols 
        but they should not affect whether the string is in fact a palindrome. 
        For example: "Anne, I vote more cars race Rome-to-Vienna" should 
        return true.
    */
    public static String PalindromeTwo(String str) {
        // code goes here
        String charsOnlyReversedString = "";
        String newOriginalString = "";
        for(int i = 0; i < str.length(); i++) {
            //Remove all non digit and non letter char
            if(Character.isDigit(str.charAt(i)) || Character.isLetter(str.charAt(i)))  {
                newOriginalString += str.charAt(i);
            }
        }

        for(int k = (newOriginalString.length() - 1); k >= 0; k--) {
            charsOnlyReversedString += newOriginalString.charAt(k);
        }

        if(newOriginalString.equalsIgnoreCase(charsOnlyReversedString)) {
            return "true";
        } else {
            return "false";
        }
    }
    
    private static void RemoveBracketsTester() {
        System.out.println("CoderByte Challenge 24 - Remove Brackets: " +
            RemoveBrackets(")((()"));
    }
    
    /*
        Remove Brackets
        Have the function RemoveBrackets(str) take the str parameter being 
        passed, which will contain only the characters "(" and ")", and 
        determine the minimum number of brackets that need to be removed to 
        create a string of correctly matched brackets. For example: if str is 
        "(()))" then your program should return the number 1. The answer could
        potentially be 0, and there will always be at least one set of matching 
        brackets in the string.
    */
    private static int RemoveBrackets(String str) {
        // code goes here 
        String mLeftBacket = "";
        String mRightBacket = "";
        for(int i = 0; i < str.length(); i++) {
          if(str.charAt(i) == '(') {
            mLeftBacket += str.charAt(i);
          } else if(str.charAt(i) == ')') {
            mRightBacket += str.charAt(i);
          }
        } 
        return Math.abs(mLeftBacket.length() - mRightBacket.length());
    }
    
    private static void RunLengthTester() {
        System.out.println("CoderByte Challenge 26 - Run Length: " +
            RunLength("wwwggopp"));
    }
    
    /*
        Run Length
        Have the function RunLength(str) take the str parameter being passed and
        return a compressed version of the string using the Run-length encoding 
        algorithm. This algorithm works by taking the occurrence of each 
        repeating character and outputting that number along with a single 
        character of the repeating sequence. For example: "wwwggopp" would 
        return 3w2g1o2p. The string will not contain any numbers, punctuation, 
        or symbols.
    */
    private static String RunLength(String str) {
        // code goes here 
        int mCharCount = 1; 
        String buildString = "";
        int i;
        for(i = 1; i < str.length(); i++) {
            if(str.charAt(i) == str.charAt(i-1)) {
                mCharCount++;
            } else {
                buildString += mCharCount + String.valueOf(str.charAt(i-1));
                mCharCount = 1;
            }
        }
        buildString += mCharCount + String.valueOf(str.charAt(i-1));
        return buildString;
    }

    private static void StepWalkingTester() {
        System.out.println("CoderByte Challenge 27 - Step Walking: " +
            StepWalking(6));
    }
    /*
        Step Walking
        Have the function StepWalking(num) take the num parameter being 
        passed which will be an integer between 1 and 1,000 that represents 
        the number of stairs you will have to climb. You can climb the set 
        of stairs by taking either 1 step or 2 steps, and you can combine 
        these in any order. So for example, to climb 3 steps you can either 
        do: (1 step, 1 step, 1 step) or (2, 1) or (1, 2). So for 3 steps we 
        have 3 different ways to climb them, so your program should return 
        3. Your program should return the number of combinations of climbing
        num steps.
    */
    private static int StepWalking(int num) {
        // code goes here  
        int result = 0;
        if((num >= 1) && (num <= 1000)) {
          if (num == 1) return 1;
          if (num == 2) return 2;
          if (num == 3) return 3;
          if (num == 4) return 5;
          result = StepWalking(num -1) + StepWalking(num -2);
        }  
        return result;
    }
    
    private static void MultipleBracketsTester() {
        System.out.println("CoderByte Challenge 28 - Multiple Brackets: " +
            MultipleBrackets("((hello [world])"));
    }
    
    /*
        Multiple Brackets
        Have the function MultipleBrackets(str) take the str parameter being 
        passed and return 1 #ofBrackets if the brackets are correctly matched 
        and each one is accounted for. Otherwise return 0. For example: if str 
        is "(hello [world])(!)", then the output should be 1 3 because all the
        brackets are matched and there are 3 pairs of brackets, but if str is 
        "((hello [world])" the the output should be 0 because the brackets do 
        not correctly match up. Only "(", ")", "[", and "]" will be used as 
        brackets. If str contains no brackets return 1.
    */
    private static String MultipleBrackets(String str) {
        //String does not contain brackets  
        int openRoundBraces = 0;
        int openSquareBraces = 0;
        int closeRoundBraces = 0;
        int closeSquareBraces = 0;
        if(!str.contains("(") || !str.contains(")")) {
            if(!str.contains("[") || !str.contains("]")) {
                return "0";
            }
        }

        long countOpenRoundBrackets = str.chars().filter(mChar -> mChar == '(').count();
        long countClosingRoundBrackets = str.chars().filter(mChar -> mChar == ')').count();
        long countOpenSquareBrackets  = str.chars().filter(mChar -> mChar == '[').count();
        long countClosingSquareBrackets =  str.chars().filter(mChar -> mChar == ']').count();

        if((countOpenRoundBrackets == countClosingRoundBrackets) && 
            (countOpenSquareBrackets == countClosingSquareBrackets)) {
            for(int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == '(') openRoundBraces++;
                if(str.charAt(i) == ')') closeRoundBraces++;

              if(closeRoundBraces > openRoundBraces) {
                //If at any point we encounter a closing bracket before an opening one return 0
                return "0";
              }

              if(str.charAt(i) == '(') openSquareBraces++;
              if(str.charAt(i) == ')') closeSquareBraces++;
              if(closeSquareBraces > openSquareBraces) {
                //If at any point we encounter a closing bracket before an opening one return 0
                return "0";
              }
            }
            String resStr = "1 " + String.valueOf(countOpenSquareBrackets + countOpenRoundBrackets);
            return resStr;
        } else {
          //If the string contains more opening than closing brackets or vice versa, return failed state
          return "0";
        }
    }
  
    private static void LargestRowColumnTest() {
        System.out.println("CoderByte Challenge 29 - Largest Row Column: " +
            LargestRowColumn(new String[] {"345", "326", "221"}));
    }
    
    /*
        Largest Row Column
        Have the function LargestRowColumn(strArr) read the strArr parameter 
        being passed which will be a 2D matrix of some arbitrary size filled 
        with positive integers. Your goal is to determine the largest number 
        that can be found by adding up three digits in the matrix that are 
        within the same path, where being on the same path means starting 
        from one of the elements and then moving either up, down, left, or 
        right onto the next element without reusing elements. One caveat though, 
        and that is when you calculate the sum of three digits, you should split 
        the sum into two digits and treat the new digits as a row/column position 
        in the matrix. So your goal is actually to find the sum of three digits 
        that sums to the largest position in the matrix without going out of the
        bounds. For example: if strArr is ["345", "326", "221"] then this looks 
        like the following matrix:
        3 4 5
        3 2 6
        2 2 1
        The solution to this problem is to sum the bolded elements, 4 + 2 + 6, 
        which equals 12. Then you take the solution, 12, and split it into two 
        digits: 1 and 2 which represents row 1, column 2 in the matrix. This is 
        the largest position you can get in the matrix by adding up 3 digits so 
        your program should return 12. If you for example added up 4 + 5 + 6 in 
        the matrix you would get 15 which is larger than 12, but row 1, column 5 
        is out of bounds. It's also not possible with the current matrix to sum 
        to any of the following numbers: 20, 21, 22. If you find a sum that is 
        only a single digit, you can treat that as row 0, column N where N is 
        your sum.
    */
    private static int LargestRowColumn(String[] strArr) {
        // Generate the integer matrix from given string array 
        int mSizeOrigArray = strArr.length;
        int mSizeEachArray = strArr[0].length();
        int[][] mMatrix = generateTheMatrix(strArr, mSizeOrigArray, mSizeEachArray);
        int maxMatrixPath = 0;
        for(int i = 0; i < mSizeOrigArray; i++) {
            for(int j = 0; j < mSizeEachArray; j++) {
              //Given the computed Matrix, calculate the longest path.
              maxMatrixPath = Math.max(maxMatrixPath, calcMaxPath(mMatrix, i, j, 0));
            }
        }
        return maxMatrixPath;
    }

    private static int[][] generateTheMatrix(String[] strArr, int mSizeOrigArray, int mSizeEachArray) {
      int[][] mMatrix = new int[mSizeOrigArray][mSizeEachArray];
      for(int i = 0; i < mSizeOrigArray; i++) {
          String[] mArr = strArr[i].split("");
          for(int j = 0; j < mSizeEachArray; j++) {
              mMatrix[i][j] = Integer.parseInt(mArr[j]);
          }
      }
      return mMatrix;
    }

    private static int calcMaxPath(int[][] mMatrix, int row, int col, int counter) {
        int curVal = mMatrix[row][col];
        //Side -> Right
        if((col < mMatrix[0].length -1) && (mMatrix[row][col + 1] > curVal)) {
            return calcMaxPath(mMatrix, (row), (col + 1), counter + 1);
        }

        //Side <- Left
        if((col > 0) && (mMatrix[row][col - 1] > curVal)) {
            return calcMaxPath(mMatrix, (row), (col - 1), counter + 1);
        }

        //Side v Down
        if((row < (mMatrix.length - 1)) && (mMatrix[row + 1][col] > curVal)) {
            return calcMaxPath(mMatrix, (row + 1), (col), counter + 1);
        }

        //Side ^ Up
        if((row > 0) && (mMatrix[row-1][col] > curVal)) {
            return calcMaxPath(mMatrix, (row-1), (col), counter + 1);
        }

        return counter;
    }
    
    private static void StringZigzagTester() {
       System.out.println("CoderByte Challenge 30 - Largest Row Column: " +
            StringZigzag(new String[] {"coderbyte", "3"})); 
    }
    
    /*
        String Zigzag
        Have the function StringZigzag(strArr) read the array of strings stored 
        in strArr, which will contain two elements, the first some sort of 
        string and the second element will be a number ranging from 1 to 6.
        The number represents how many rows to print the string on so that it 
        forms a zig-zag pattern. For example: if strArr is ["coderbyte", "3"] 
        then this word will look like the following if you print it in a zig-zag 
        pattern with 3 rows:
        Your program should return the word formed by combining the characters 
        as you iterate through each row, so for this example your program should 
        return the string creoebtdy.
    */
	
    private static String StringZigzag(String[] strArr) {
        //Seperate Array into 2 strings
        String mStringToPrint = strArr[0];
        int numRows = Integer.parseInt(strArr[1]);
        //form mNumRows number of arrays
        String[] mResHolder = new String[numRows];
        Arrays.fill(mResHolder, "");
        //Length of string
        int mStringToPrintLen = mStringToPrint.length();
        //Move char of strings into a char array
        char[] mStr = mStringToPrint.toCharArray();
        //If number of rows is 1 return the string as original
        if(numRows == 1) return mStringToPrint;
        int currentRow = 0;
        int writeDir = 1;
        for(int i = 0; i < mStringToPrintLen; i++) {
            mResHolder[currentRow] += mStr[i];
            if(currentRow == (numRows - 1)) {
                writeDir = 0;
            } else if(currentRow == 0) {
                writeDir = 1;
            }
            if(writeDir == 1) {
                currentRow++;
            } else {
                currentRow--;
            }
        }
        String mResHolderStr = "";
        for(int x = 0; x < numRows; x++) {
            mResHolderStr += mResHolder[x];
        }
        return mResHolderStr;
    }
  
    private static void ClosestEnemyIITester() {
        System.out.println("CoderByte Challenge 31 - Closest Enemy II: " +
            ClosestEnemyII(new String[] {"0000", "1000", "0002", "0002"}));
    }
    
    /*
	Closest Enemy II
	Have the function ClosestEnemyII(strArr) read the matrix of numbers 
        stored in strArr which will be a 2D matrix that contains only the 
        integers 1, 0, or 2. Then from the position in the matrix where a 1 is, 
        return the number of spaces either left, right, down, or up you must 
        move to reach an enemy which is represented by a 2. You are able to 
        wrap around one side of the matrix to the other as well. For example: 
        if strArr is ["0000", "1000", "0002", "0002"] then this looks like the 
        following:
	0 0 0 0
	1 0 0 0
	0 0 0 2
	0 0 0 2
	For this input your program should return 2 because the closest enemy 
        (2) is 2 spaces away from the 1 by moving left to wrap to the other side 
        and then moving down once. The array will contain any number of 0's and
        2's, but only a single 1. It may not contain any 2's at all as well, 
        where in that case your program should return a 0.
    */
    private static String ClosestEnemyII(String[] strArr) {
        // Generate the integer matrix from given string array 
        int mSizeOrigArray = strArr.length;
        int mSizeEachArray = strArr[0].length();
        int minNumMoves = Integer.MAX_VALUE;
        for(int row = 0; row < mSizeOrigArray; row++) {
            for(int col = 0; col < mSizeEachArray; col++) {
                if (strArr[row].charAt(col) == '1') {
                    minNumMoves = Math.min(minNumMoves, hopsClosestEnemy(strArr, row, col, mSizeOrigArray, mSizeEachArray));
                }
            }
        }
        return String.valueOf(minNumMoves);
    }

    private static int hopsClosestEnemy(String[] strArr, int row, int col, int mSizeOrigArray, int mSizeEachArray) {
        int minNumMoves = Integer.MAX_VALUE;
        for(int i = 0; i < mSizeOrigArray; i++) {
          for(int j = 0; j < mSizeEachArray; j++) {
            if (strArr[i].charAt(col) == '2') {
              int horizontalMoves = Math.min(Math.abs(row - i), Math.abs(mSizeOrigArray - Math.abs(row - i)));
              int verticalMoves = Math.min(Math.abs(col -j), Math.abs(mSizeEachArray - Math.abs(row - i)));
              minNumMoves = Math.min(minNumMoves, (horizontalMoves +verticalMoves));
            }
          }
        }
        return minNumMoves == Integer.MAX_VALUE ? 0 : minNumMoves;
    }

    private static void FibonacciCheckerTester() {
        System.out.println("CoderByte Challenge 32 - FibonacciChecker: " +
            FibonacciChecker(54));
    }
    
    /*
        Fibonacci Checker
        Have the function FibonacciChecker(num) return the string yes if the 
        number given is part of the Fibonacci sequence. This sequence is 
        defined by: Fn = Fn-1 + Fn-2, which means to find Fn you add the 
        previous two numbers up. The first two numbers are 0 and 1, then comes 
        1, 2, 3, 5 etc. If num is not in the Fibonacci sequence, return the 
        string no.
    */
    private static String FibonacciChecker(int num) {
        // Base Cases
        int fibo0 = 0;
        int fibo1 = 1;
        if(num == 0 || num == 1) {
            return "yes";
        }
        int fiboResult = fibo1 + fibo0;
        while(fiboResult <= num) {
            fibo0 = fibo1;
            fibo1 = fiboResult;
            fiboResult = fibo1 + fibo0;
            if(fiboResult == num) {
                return "yes";
            }
        }
        return "no";
    }
    
    private static void PalindromeTester() {
        System.out.println("CoderByte Challenge 33 - Palindrome: " + 
            Palindrome("never odd or even"));
    }
    
    private static String Palindrome(String str) {
        // code goes here  
        String reversedString = "";
        str = str.replace(" ", "");
        for(int i = (str.length() - 1); i >= 0 ; i--) {
          reversedString += String.valueOf(str.charAt(i));
        }
        if(reversedString.equals(str)) {
          return "true";
        }
        return "false";
    }
	
	private static void ReversePolishNotationTester() {
        System.out.println("Coderbyte Challenge 34 - Reverse Polish Notation = "
            + ReversePolishNotation("4 5 + 2 1 + *"));
    }
    
    /*
        Reverse Polish Notation
        Have the function ReversePolishNotation(str) read str which will be an 
        arithmetic expression composed of only integers and the operators: +,-,*
        and / and the input expression will be in postfix notation 
        (Reverse Polish notation), an example: (1 + 2) * 3 would be
        1 2 + 3 * in postfix notation. Your program should determine the answer 
        for the given postfix expression. For example: if str is 2 12 + 7 / 
        then your program should output 2.
    */
    private static String ReversePolishNotation(String str) {
        // code goes here
        String[] mStr = str.split(" ");
        int mResult = 0;  
        Stack<Integer> mStack = new Stack();     //Stack is LIFO
        for (String mStr1 : mStr) {
            if (mStr1.equals("+") || mStr1.equals("*") || 
                mStr1.equals("/") || mStr1.equals("-")) {
                int element1 = mStack.pop();
                int element2 = mStack.pop();
                switch (mStr1) {
                    case "+" -> mResult = element2 + element1;
                    case "*" -> mResult = element2 * element1;
                    case "/" -> mResult = element2 / element1;
                    case "-" -> mResult = element2 - element1;
                }
                mStack.push(mResult);
            } else {
                int mVal = Integer.parseInt(mStr1);
                mStack.push(mVal);
            }
        }
        return String.valueOf(mResult);
    }
	
	private static void PalindromicSubstringTester() {
        System.out.println("Coderbyte Challenge 35 - Palindromic Substring = "
            + PalindromicSubstring("aaabc"));
    }
	
    /*
        Palindromic Substring
        Have the function PalindromicSubstring(str) take the str parameter being
        passed and find the longest palindromic substring, which means the 
        longest substring which is read the same forwards as it is backwards. 
        For example: if str is "abracecars" then your program should return the 
        string racecar because it is the longest palindrome within the input 
        string. The input will only contain lowercase alphabetic characters. 
        The longest palindromic substring will always be unique, but if there 
        is none that is longer than 2 characters, return the string none.
    */
    private static String PalindromicSubstring(String str) {
        //Find all the possible substrings of a given string
        String longestPalindromeSubstring = "none";
        for(int i = 0; i < str.length(); i++) {
            for(int j = (i+1); j <= str.length(); j++) {
                String currentSubString = str.substring(i,j);
                //Check if this string is a palindrome
                if(isPalindrome(currentSubString) && 
                    currentSubString.length() > 2) 
                {
                    if(currentSubString.length() > longestPalindromeSubstring.length()) {
                        longestPalindromeSubstring = currentSubString;
                    }
                }
            }
        }
        return longestPalindromeSubstring;
    }
	
    private static boolean isPalindrome(String str) {
        // code goes here  
        String reversedString = "";
        str = str.replace(" ", "");
        for(int i = (str.length() - 1); i >= 0 ; i--) {
          reversedString += String.valueOf(str.charAt(i));
        }
        return reversedString.equals(str);
    }
	
    private static void MaxSubarrayTester() {
        int[] arr = new int[] {-4, -5, -6};
        System.out.println("Coderbyte Challenge 36 - Max Subarray = "
            + MaxSubarray(arr));
    }
	
    /*
        Max Subarray
        Have the function MaxSubarray(arr) take the array of numbers stored in 
        arr and determine the largest sum that can be formed by any contiguous 
        subarray in the array. For example, if arr is [-2, 5, -1, 7, -3] then 
        your program should return 11 because the sum is formed by the subarray 
        [5, -1, 7]. Adding any element before or after this subarray would make 
        the sum smaller.
    */
    private static int MaxSubarray(int[] arr) {
        //Find all the possible substrings of a given string
        int sumArray = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i; j <= arr.length; j++) {
                Integer mLocalSum = null;
                for(int k = i; k < j; k++) {
                    if(mLocalSum == null) {
                        mLocalSum = 0;
                    }
                    mLocalSum += arr[k];
                }
                if(mLocalSum != null) {
                    if(mLocalSum > sumArray) {
                        sumArray = mLocalSum;
                    }
                }
            }
        }
        return sumArray;
    }
    
    private static void ParallelSumsTester() {
        int[] arr = new int[] {16, 22, 35, 8, 20, 1, 21, 11};
        System.out.println("Coderbyte Challenge 37 - Parallel Sums = "
            + ParallelSums(arr));
    }
    
    /*
        Parallel Sums
        Have the function ParallelSums(arr) take the array of integers stored 
        in arr which will always contain an even amount of integers, and 
        determine how they can be split into two even sets of integers each so 
        that both sets add up to the same number. If this is impossible return 
        -1. If it's possible to split the array into two sets, then return a 
        string representation of the first set followed by the second set with 
        each integer separated by a comma and both sets sorted in ascending 
        order. The set that goes first is the set with the smallest first 
        integer.

        For example: if arr is [16, 22, 35, 8, 20, 1, 21, 11], then your 
        program should output 1,11,20,35,8,16,21,22
    */
    private static String ParallelSums(int[] arr) {
        // code goes here 
        String result = "";
        Arrays.sort(arr);
        List<Integer> mArr1 = new ArrayList<>();
        List<Integer> mArr2 = new ArrayList<>();
        int mTotalArr1 = 0;
        int mTotalArr2 = 0;
        int mTotalArr = 0;
        List<Integer> arrCopy = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            arrCopy.add(arr[i]);
        }
        
        for(int i = 0; i < arrCopy.size(); i++) {
            for(int j = (i + 1); j < arrCopy.size(); j++) {
                if(Objects.equals(arrCopy.get(j), arrCopy.get(i))) {
                    arrCopy.remove(i);
                }
            }
        }
        
        if((arrCopy.size() % 2) != 0) {
            result = "-1";
        }
        
        for(int i = 0; i < arrCopy.size(); i++) {
            mTotalArr += arrCopy.get(i);
        }
        
        for(int i = (arr.length - 1); i >= 0; i--) {
            int value = arr[i];
            if(mTotalArr1 <= mTotalArr2 && mTotalArr1 <= (mTotalArr/2)) {
                if(mArr1.size() < (arrCopy.size()/2)) {
                    mTotalArr1 += value;
                    mArr1.add(value); 
                }
            } else {
                if(mArr2.size() < (arrCopy.size()/2)) {
                    mTotalArr2 += value;
                    mArr2.add(value);
                }
            }
        }
        if(mTotalArr1 != mTotalArr2) {
            result = "-1"; 
        } else {
            Collections.sort(mArr1);
            Collections.sort(mArr2);
            result = "";
            if(mArr1.get(0) < mArr2.get(0)) {
                for(int i = 0; i < mArr1.size(); i++) {
                    result = result.concat(String.valueOf(mArr1.get(i)))
                        .concat(",");
                }
                for(int i = 0; i < mArr2.size(); i++) {
                    result = result.concat(String.valueOf(mArr2.get(i)))
                        .concat(",");
                }
            } else {
                for(int i = 0; i < mArr2.size(); i++) {
                    result = result.concat(String.valueOf(mArr2.get(i)))
                        .concat(",");
                }
                for(int i = 0; i < mArr1.size(); i++) {
                    result = result.concat(String.valueOf(mArr1.get(i)))
                        .concat(","); 
                }
            }
            result = result.substring(0, (result.length() - 1));
        }
        return result;
    }
	
	private static void MaximalSquareTester() {
        String[] arr = new String[] {"0111", "1111", "1111", "1111"};
        //String[] arr = new String[] {"10100", "10111", "11111", "10010"};
        System.out.println("Coderbyte Challenge 38 - Maximal Square = "
            + MaximalSquare(arr));
    }
    
    /*
        Maximal Square
        Have the function MaximalSquare(strArr) take the strArr parameter being 
        passed which will be a 2D matrix of 0 and 1's, and determine the area 
        of the largest square submatrix that contains all 1's. A square 
        submatrix is one of equal width and height, and your program should 
        return the area of the largest submatrix that contains only 1's. For 
        example: if strArr is ["10100", "10111", "11111", "10010"] then this 
        looks like the following matrix:
        1 0 1 0 0
        1 0 1 1 1
        1 1 1 1 1
        1 0 0 1 0
        For the input above, you can see the bolded 1's create the largest 
        square submatrix of size 2x2, so your program should return the area 
        which is 4. You can assume the input will not be empty.
    */
    private static int MaximalSquare(String[] strArr) {
        // Generate the integer matrix from given string array 
        int mRes = 0;
        int mSizeOrigArray = strArr.length;
        int mSizeEachArray = strArr[0].length();
        int[][] mMatrix = generateTheMatrix(strArr, mSizeOrigArray, mSizeEachArray);
        for(int i = 0; i < mSizeOrigArray; i++) {
            for(int j = 0; j < strArr[i].length(); j++) {
                //Given the computed Matrix, calculate retrieve the largest submatrix.
                if((i == 0 || j == 0)) {
                } else if(mMatrix[i][j] > 0) {
                    mMatrix[i][j] = 1 + (Math.min(Math.min(mMatrix[i][j-1], mMatrix[i-1][j]), mMatrix[i-1][j-1]));
                }
                if(mMatrix[i][j] > mRes) {
                    mRes = mMatrix[i][j];
                }
            }
        }
        return mRes*mRes;
    }
	
	private static void StringPeriodsTester() {
        String mStr = "abababababab";
        System.out.println("Coderbyte Challenge 25 - String Periods = "
            + StringPeriods(mStr));
    }
	
    /*
        String Periods
        Have the function StringPeriods(str) take the str parameter being passed
        and determine if there is some substring K that can be repeated N > 1 
        times to produce the input string exactly as it appears. Your program 
        should return the longest substring K, and if there is none it should 
        return the string -1.

        For example: if str is "abcababcababcab" then your program should return
        abcab because that is the longest substring that is repeated 3 times to 
        create the final string. Another example: if str is "abababababab" then 
        your program should return ababab because it is the longest substring. 
        If the input string contains only a single character, your program 
        should return the string -1.
    */
    private static String StringPeriods(String mStr) {
        // code goes here  
        String mResult = "-1";
        int resStringLen = 0;
        //Find all substrings of the main string
        for(int i = (mStr.length() - 1); i >= 0 ; i--) {
            for(int j = (mStr.length() - 1); j >= i; j--) {
                String mSubStr = mStr.substring(i, j);
                if(!mSubStr.isEmpty()) {
                    if(SubstringMainString(mSubStr, mStr)) {
                        if(mSubStr.length() > resStringLen) {
                            resStringLen = mSubStr.length();
                            mResult = mSubStr;
                        }
                    }
                }
            }
        }
        return mResult;
    }
    
    private static boolean SubstringMainString(String mSubStr, String mStr) {
        int mainStringLen = mStr.length();
        boolean result = false;
        String buildString = mSubStr;
        while(buildString.length() < mainStringLen) {
            buildString += mSubStr;
        }
        if(buildString.length() == mainStringLen) {
            if(buildString.equalsIgnoreCase(mStr)) {
                result = true;
            }
        } else {
            result = false;
        }
        return result;
    }
	
    private static void SymmetricTreeTester() {
        String[] strArr = new String[] {"10", "2", "2", "#", "1", "1", "#"};
        System.out.println("Coderbyte Challenge 39 - Symmetric Tree = "
            + SymmetricTree(strArr));
    }
	
    private static String SymmetricTree(String[] mStringArray) {
        // code goes here  
        Stack<String> mStack = new Stack<>();
        for (String mStr : mStringArray) {
            if (mStack.isEmpty()) {
              mStack.push(mStr);
            } else if (mStack.peek().equals(mStr)) {
              mStack.pop();
            } else {
              mStack.push(mStr);
            }
        }
        if(mStack.size() == 1 && mStack.peek().equals(mStringArray[0])) {
            return "true";
        } else {
            return "false";
        }
    }
    
    private static void TwoSumTester() {
        int[] arr = new int[] {100, 90, 90, 90, 90, 11};
        System.out.println("Coderbyte Challenge 40 - Two Sum = "
            + TwoSum(arr));
    }
    /*
        Two Sum
        Have the function TwoSum(arr) take the array of integers stored in arr, 
        and determine if any two numbers (excluding the first element) in the 
        array can sum up to the first element in the array. For example: if arr 
        is [7, 3, 5, 2, -4, 8, 11], then there are actually two pairs that sum 
        to the number 7: [5, 2] and [-4, 11]. Your program should return all 
        pairs, with the numbers separated by a comma, in the order the first 
        number appears in the array. Pairs should be separated by a space. 
        So for the example above, your program would return: 5,2 -4,11.

        If there are no two numbers that sum to the first element in the array, 
        return -1
    */
    private static String TwoSum(int[] arr) {
        // code goes here 
        int valueToSum = arr[0];
        String resReturn = "";
        int[] modArr = Arrays.copyOfRange(arr, 1, arr.length);
        for(int i = 0; i < modArr.length; i++) {
            for(int j = 0; j < modArr.length; j++) {
                if(i != j) {
                    int mSum = modArr[i] + modArr[j];
                    if(mSum == valueToSum) {
                        if(!(resReturn.contains(modArr[j] + "," + modArr[i]))) {
                            resReturn += modArr[i] + "," + modArr[j] + " ";
                        }
                    }
                }
            }
        }
        if(resReturn.equals("")) {
            return "-1";
        } else {
            resReturn = resReturn.substring(0, resReturn.length() - 1);
            return resReturn;
        }
    }
    
    private static void PreorderTraversalTester() {
        String[] mStrArr = new String[] {"5", "2", "6", "1", "9", "#", "8", "#", "#", "#", "#", "4", "#"};
        System.out.println("Coderbyte Challenge 41 - Preorder Traversal = "
            + PreorderTraversal(mStrArr));
    }
    
    /*
        Preorder Traversal
        Have the function PreorderTraversal(strArr) take the array of strings 
        stored in strArr, which will represent a binary tree with integer values
        in a format similar to how a binary heap is implemented with NULL nodes 
        at any level represented with a #. Your goal is to return the pre-order 
        traversal of the tree with the elements separated by a space. For 
        example: if strArr is ["5", "2", "6", "1", "9", "#", "8", "#", "#", "#",
        "#", "4", "#"] then this tree looks like the following tree:
    
        For the input above, your program should return the string 5 2 1 9 6 8 4
        because that is the pre-order traversal of the tree.
    */
    private static String PreorderTraversal(String[] strArr) {
        StringBuilder dfsTraversalString = new StringBuilder();
        int rootIndex = 0;
        depthFirstSearch(dfsTraversalString, strArr, rootIndex);
        String resReturn = dfsTraversalString.substring(0, dfsTraversalString.length() - 1);
        return resReturn;
    }

    private static void depthFirstSearch(StringBuilder dfsTraversalString, 
        String[] strArr, int mRootIdx) 
    {
        if(!(strArr[mRootIdx].equals("#"))) {
            dfsTraversalString.append(strArr[mRootIdx]).append(" ");
            int proceedLeft = 2*mRootIdx + 1;
            if(proceedLeft < strArr.length) {
                depthFirstSearch(dfsTraversalString, strArr, proceedLeft);
            }
            int proceedRight = 2*mRootIdx + 2;
            if(proceedRight < strArr.length) {
                depthFirstSearch(dfsTraversalString, strArr, proceedRight);
            }
        }
    }
    
    private static void EquivalentKeypressesTester() {
        String[] strArr = new String[] {"a,b,c,d", "a,b,c,d,-B,d,d,-B"};
        System.out.println("Coderbyte Challenge 42 - Equivalent Keypresses = "
            + EquivalentKeypresses(strArr));
    }
	
    /*
        Equivalent Keypresses
        Have the function EquivalentKeypresses(strArr) read the array of 
        strings stored in strArr which will contain 2 strings representing 
        two comma separated lists of keypresses. Your goal is to return the 
        string true if the keypresses produce the same printable string and 
        the string false if they do not. Keypress can be either a printable 
        character or a backspace represented by -B. You can produce a 
        printable string from such a string of keypresses by having 
        backspaces erase one preceding character.
    */
    private static String EquivalentKeypresses(String[] strArr) {
        // code goes here       
        String mFirstStr = strArr[0];
        mFirstStr = mFirstStr.replaceAll(",", "");
        String mSecondStr = strArr[1];
        mSecondStr = mSecondStr.replaceAll(",", "");
        Stack<String> mStackedFirstStr = new Stack<>();
        Stack<String> mStackedSecondStr = new Stack<>();
        for(int i = 0; i < mFirstStr.length(); i++) {
            if(mFirstStr.charAt(i) != '-') {
                if(mFirstStr.charAt(i) == 'B') {
                    if ((i != 0) && mFirstStr.charAt(i-1) != '-') {
                        mStackedFirstStr.push(String.valueOf(mFirstStr.charAt(i)));
                    }
                } else {
                    if(i != (mFirstStr.length() - 1)) {
                        if(mFirstStr.charAt(i+1) != '-') {
                            mStackedFirstStr.push(String.valueOf(mFirstStr.charAt(i)));
                        }
                    } else {
                        mStackedFirstStr.push(String.valueOf(mFirstStr.charAt(i)));
                    }
                }
            } 
        }
        
        for(int i = 0; i < mSecondStr.length(); i++) {
            if(mSecondStr.charAt(i) != '-') {
                if(mSecondStr.charAt(i) == 'B') {
                    if ((i != 0) && mSecondStr.charAt(i-1) != '-') {
                        mStackedSecondStr.push(String.valueOf(mSecondStr.charAt(i)));
                    }
                } else {
                    if(i != (mSecondStr.length() - 1)) {
                        if(mSecondStr.charAt(i+1) != '-') {
                            mStackedSecondStr.push(String.valueOf(mSecondStr.charAt(i)));
                        }
                    } else {
                        mStackedSecondStr.push(String.valueOf(mSecondStr.charAt(i)));
                    }
                }
            }
        }
        String mFirstResString = "";
        String mSecondResString = "";
        while(!mStackedFirstStr.isEmpty()) {
            mFirstResString += mStackedFirstStr.pop();
        }
        
        while(!mStackedSecondStr.isEmpty()) {
            mSecondResString += mStackedSecondStr.pop();
        }
        if(mFirstResString.equals(mSecondResString)) {
            return "true";
        }
        return "false";
    }
    
    private static void BitmapHolesTester() {
        //String[] strArr = new String[] {"10111", "10101", "11101", "11111"};
        String[] strArr = new String[] {"0011", "0010"};
        System.out.println("Coderbyte Challenge 43 - Bitmap Holes = "
            + BitmapHoles(strArr));
    }
    
    /* 
        Bitmap Holes
        Have the function BitmapHoles(strArr) take the array of strings stored 
        in strArr, which will be a 2D matrix of 0 and 1's, and determine how 
        many holes, or contiguous regions of 0's, exist in the matrix. A 
        contiguous region is one where there is a connected group of 0's going 
        in one or more of four directions: up, down, left, or right. For 
        example: if strArr is ["10111", "10101", "11101", "11111"], then this 
        looks like the following matrix:

        0 0 1 1
        0 0 1 0
    
        1 0 1 1 1
        1 0 1 0 1
        1 1 1 0 1
        1 1 1 1 1

        For the input above, your program should return 2 because there are two 
        separate contiguous regions of 0's, which create "holes" in the matrix.
        You can assume the input will not be empty.
    */
    private static int BitmapHoles(String[] strArr) {
        // Generate the integer matrix from given string array 
        int holeCount = 0;
        int mSizeOrigArray = strArr.length;
        int mSizeEachArray = strArr[0].length();
        int[][] mMatrix = generateTheMatrix(strArr, mSizeOrigArray, mSizeEachArray); 
        for(int i = 0; i < mSizeOrigArray; i++) {
            for(int j = 0; j < mSizeEachArray; j++) {
                int curVal = mMatrix[i][j];
                if(curVal == 0) {
                    if((j+1) < mSizeEachArray) {
                        int nextValRight = mMatrix[i][j+1];
                        if(nextValRight == 0) {
                            holeCount++;
                        }
                    }
                    if((j-1) >= 0) {
                        int nextValLeft = mMatrix[i][j-1];
                        if(nextValLeft == 0) {
                            holeCount++;
                        }
                    }
                    if((i+1) < mSizeOrigArray) {
                        int nextValAbove = mMatrix[i+1][j];
                        if(nextValAbove == 0) {
                            holeCount++;
                        }
                    } 
                    if((i-1) >= 0) {
                        int nextValBelow = mMatrix[i-1][j];
                        if(nextValBelow == 0) {
                            holeCount++;
                        }
                    }
                }
            }
        }
        return (holeCount/2);
    }
    
    private static void TrappingWaterTester() {
        int[] arr = new int[] {3, 0, 0, 2, 0, 4};
        System.out.println("Coderbyte Challenge 44 - Trapping Water = "
            + TrappingWater(arr)); 
    }
    
    /*
        Trapping Water
        Have the function TrappingWater(arr) take the array of non-negative 
        integers stored in arr, and determine the largest amount of water that 
        can be trapped. The numbers in the array represent the height of a 
        building (where the width of each building is 1) and if you imagine it 
        raining, water will be trapped between the two tallest buildings. 
        For example: if arr is [3, 0, 0, 2, 0, 4] then this array of building 
        heights looks like the following picture if we draw it out:
        Now if you imagine it rains and water gets trapped in this picture, then
        it'll look like the following (the x's represent water): This is the 
        most water that can be trapped in this picture, and if you calculate 
        the area you get 10, so your program should return 10.
    */
    private static int TrappingWater(int[] arr) {
        // code goes here  
        int n = arr.length;
        int areaWater = 0;
        int[] mForwardArray = new int [n];
        int[] mBackwardArray = new int [n];
        
        int maxForwardArrayValue = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] > maxForwardArrayValue) {
                maxForwardArrayValue = arr[i];
            }
            mForwardArray[i] = maxForwardArrayValue;
        }
        
        int maxBackwardArrayValue = 0;
        for(int i = (n-1); i >= 0; i--) {
            if(arr[i] > maxBackwardArrayValue) {
                maxBackwardArrayValue = arr[i];
            }
            mBackwardArray[i] = maxBackwardArrayValue;
        }
        
        for(int i = 0; i < n; i++) {
            areaWater += Math.min(mForwardArray[i], mBackwardArray[i]) - arr[i];
        }
        
        return areaWater;
    }
	
	private static void PlusMinusTester() {
        int mPlusMinus = 22;
        System.out.println("Coderbyte Challenge 45 - Plus Minus = "
            + PlusMinus(mPlusMinus));
    }
    
    /*
        Plus Minus
        Have the function PlusMinus(num) read the num parameter being passed 
        which will be a combination of 1 or more single digits, and determine 
        if it's possible to separate the digits with either a plus or minus 
        sign to get the final expression to equal zero. For example: if num is 
        35132 then it's possible to separate the digits the following way, 
        3 - 5 + 1 + 3 - 2, and this expression equals zero. Your program should
        return a string of the signs you used, so for this example your program 
        should return -++-. If it's not possible to get the digit expression to
        equal zero, return the string not possible.

        If there are multiple ways to get the final expression to equal zero, 
        choose the one that contains more minus characters. For example: if num 
        is 26712 your program should return -+-- and not +-+-.
    */
    private static String PlusMinus(int num) {
        // code goes here
        String numArr = String.valueOf(num);
        int result = Character.digit(numArr.charAt(0), 10);
        String resStr = "";
        for(int i = 1; i < numArr.length(); i++) {
            if(result > 0) {
                result -= Character.digit(numArr.charAt(i), 10);
                resStr += "-";
            } else {
                result += Character.digit(numArr.charAt(i), 10);
                resStr += "+";
            }
        }
        if(result == 0) {
            return resStr;
        } else {
            return "not possible";
        }
    }
	
	private static void FizzBuzzTester() {
        int num = 3;
        System.out.println("Coderbyte Challenge 46 - Fizz Buzz = "
            + FizzBuzz(num));
    }
	
    /*
        FizzBuzz
        Have the function FizzBuzz(num) take the num parameter being passed and 
        return all the numbers from 1 to num separated by spaces, but replace 
        every number that is divisible by 3 with the word "Fizz", replace 
        every number that is divisible by 5 with the word "Buzz", and every 
        number that is divisible by both 3 and 5 with the word "FizzBuzz". 
        For example: if num is 16, then your program should return the string 
        "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16". 
        The input will be within the range 1 - 50.
    */
    private static String FizzBuzz(int num) {
        // code goes here 
        String resStr = "";
        for(int i = 1; i <= num; i++) {
            if(((i % 3) == 0) && ((i % 5) == 0)) {
                resStr += "FizzBuzz ";
            } else if((i % 3) == 0) {
                resStr += "Fizz ";
            } else if((i % 5) == 0) {
                resStr += "Buzz ";
            } else {
                resStr += i + " ";
            }
        }
        return resStr.trim();
    }
    
    private static void HDistanceTester() {
        String[] strArr = new String[] {"abcdef", "defabc"};
        //Also called the Hamming Distance
        System.out.println("Coderbyte Challenge 47 - H Distance = "
            + HDistance(strArr));
    }
	
    /*
        H Distance - Also called the Hamming Distance
        Have the function HDistance(strArr) take the array of strings stored in 
        strArr, which will only contain two strings of equal length and return 
        the number of characters at each position that are different between 
        them. For example: if strArr is ["house", "hours"] then your program 
        should return 2. The string will always be of equal length and will 
        only contain lowercase characters from the alphabet and numbers.
    */
    private static int HDistance(String[] strArr) {
        // code goes here
        String mFirstStr = strArr[0];
        String mSecondStr = strArr[1];
        int n = mFirstStr.length();
        int counter = 0;
        for(int i = 0; i < n; i++) {
            if(mFirstStr.charAt(i) != mSecondStr.charAt(i)) {
                counter++;
            }
        }
        return counter;
    }
    
    private static void DifferentCasesTester() {
        String strArr = "a b c d-e-f%g";
        System.out.println("Coderbyte Challenge 48 - Different Cases = "
            + DifferentCases(strArr));
    }
    
    private static String DifferentCases(String str) {
        // code goes here 
        String result = "";
        str = str.toLowerCase();
        String[] mWords = str.split("[^A-Za-z0-9]+");
        for (String mWord : mWords) {
            result += mWord.substring(0, 1).toUpperCase() 
                + mWord.substring(1);
        }
        return result;
    }
    
    private static void RectangleAreaTester() {
        //String[] strArr = new String[] {"(1 1)","(1 3)","(3 1)","(3 3)"};
        //String[] strArr = new String[] {"(0 0)", "(3 0)", "(0 2)", "(3 2)"};
        String[] strArr = new String[] {"(0 0)","(1 0)","(1 1)","(0 1)"};
        System.out.println("Coderbyte Challenge 49 - Rectangle Area = "
            + RectangleArea(strArr));
    }
    
    /*
        Rectangle Area
        Have the function RectangleArea(strArr) take the array of strings stored
        in strArr, which will only contain 4 elements and be in the form (x y) 
        where x and y are both integers, and return the area of the rectangle 
        formed by the 4 points on a Cartesian grid. The 4 elements will be in 
        arbitrary order. For example: if strArr is ["(0 0)", "(3 0)", "(0 2)", 
        "(3 2)"] then your program should return 6 because the width of the 
        rectangle is 3 and the height is 2 and the area of a rectangle is equal 
        to the width * height.
    */
    private static int RectangleArea(String[] strArr) {
        // code goes here
        String firstCoord = strArr[0].replace("(", "").replace(")", "");
        String secondCoord = strArr[1].replace("(", "").replace(")", "");
        String thirdCoord = strArr[2].replace("(", "").replace(")", "");
        String fourthCoord = strArr[3].replace("(", "").replace(")", "");
        String[] mFirstCoord = firstCoord.split(" ");
        String[] mSecondCoord = secondCoord.split(" ");
        String[] mThirdCoord = thirdCoord.split(" ");
        String[] mFourthCoord = fourthCoord.split(" ");
        int x1 = Integer.parseInt(mFirstCoord[0]);
        int x2 = Integer.parseInt(mSecondCoord[0]);
        int x3 = Integer.parseInt(mThirdCoord[0]);
        int x4 = Integer.parseInt(mFourthCoord[0]);
        
        int y1 = Integer.parseInt(mFirstCoord[1]);
        int y2 = Integer.parseInt(mSecondCoord[1]);
        int y3 = Integer.parseInt(mThirdCoord[1]);
        int y4 = Integer.parseInt(mFourthCoord[1]);
        
        int xFirstCoord = Math.abs(x1 - x4);
        int yFirstCoord = Math.abs(y1 - y4);
        int xSecondCoord = Math.abs(x2 - x3);
        int ySecondCoord = Math.abs(y2 - y3);
        
        int mRectArea = Math.max((xFirstCoord*ySecondCoord), (xSecondCoord*yFirstCoord));
        return mRectArea;
    }
    
    private static void PrimeTimeTester() {
        int num = 110;
        System.out.println("Coderbyte Challenge 50 - Prime Time " + num + " =  "
            + PrimeTime(num));
    }
    
    /*
        Prime Time
        Have the function PrimeTime(num) take the num parameter being passed and
        return the string true if the parameter is a prime number, otherwise 
        return the string false. The range will be between 1 and 2^16.
    */
    private static String PrimeTime(int num) {
        // code goes here  
        int maxNum = 65536;
        String res = "false";
        List<Integer> mPrimesOnly = new ArrayList<>();
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
        if(mPrimesOnly.contains(num)) {
            res = "true";
        }
        return res;
    }
}