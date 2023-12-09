
package hackerrankchallenges;

import java.io.*;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * @author Sithembiso SamaJobe
 */
public class HackerRankChallenges {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        initSockMerchant(); //Challenge 1
        initCountingValleys(); //Challenge 2
        initJumpingOnClouds(); //Challenge 3
    }
    
    private static void initSockMerchant() {
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
    
    private static void initCountingValleys() {
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
    
    private static void initJumpingOnClouds() {
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
}