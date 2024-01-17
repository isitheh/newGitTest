package org.codefinity.junior;

import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.*;

public class JuniorLevelQuestions {
    /*
    *   Question 1:
    *   What is a NullPointerException in Java, and how do you prevent it? Write an example code snippet that could
    *   result in a NullPointerException and modify it to prevent the exception from occurring.
    *
    *   Answer:
    *   NullPointerException occurs when a variable that is expected to contain an object reference is null, and we try
    *   to perform an operation on it. To prevent a NullPointerException one needs to check if the variable is null,
    *   before trying to perform an operation on it.
    */

    public void ensureNoNullPointerException() {
        String mString = null;

        //This will result in a NullPointerException
        System.out.println(mString);

        //To prevent a NullPointerException one needs to check if the mString is null before usage
        if(mString != null) {
            System.out.println(mString);
        }
    }

    /*
    *   Question 2:
    *   What is the difference between an interface and an abstract class in Java? Write an example code snippet that
    *   uses both an interface and an abstract class to demonstrate their differences.
    *
    *   Answer:
    *   An interface provides a contract that the subclass must implement. Whereas an abstract class provides a
    *   partially implemented class which cannot be instantiated that the subclass can extend.
    *
    *   See classes: Vehicle/Car/Shape/Circle
    */

    /*
     *   Question 3:
     *   What is the purpose of the finally block in a try-catch-finally statement in Java? Write an example code
     *   snippet that demonstrates the use of a finally block.
     *
     *   Answer:
     *   Finally block represents the code that is meant to run whether the exception was thrown or not.
     */
    public void demonstrateFinally() {
        try {
            //Some code that may thrown an exception.
        } catch (Exception e) {
            //Code that handles the exception.
        } finally {
            //Code that will run regardless of whether the exception was thrown.
        }
    }

    /*
     *   Question 4:
     *   Explain the difference between the == operator and the equals() method in Java. Write an example code snippet
     *   that demonstrates the use of both.
     *
     *   Answer:
     *   The == tests for object equality. The equals() tests for value equality.
     */
    public void demonstrateEquals() {
        java.lang.String mStr1 = "Hello";
        java.lang.String mStr2 = "Hello";
        java.lang.String mStr3 = new java.lang.String("Hello");

        //Will return true because the object mStr1 and mStr2 refer to the same object in memory.
        System.out.println(mStr1 == mStr2);

        //Will return true because the value of mStr1 and mStr2 is the same value.
        System.out.println(mStr1.equals(mStr2));

        //Will return false because the object mStr1 and mStr3 do not refer to the same object in memory.
        System.out.println(mStr1 == mStr3);

        //Will return true because the value of mStr1 and mStr3 is the same value.
        System.out.println(mStr1.equals(mStr3));
    }

    /*
     *   Question 5:
     *   Question: What is a Java package, and why is it useful? Write an example code snippet that demonstrates the use
     *   of a package.
     *
     *   Answer:
     *   A package provides a way of grouping together related classes, interfaces and sub packages in a way that avoids
     *   code naming conflict and promotes code reuse.
     *
     *   Example: Our JuniorLevelQuestions class belongs to the package org.codefinity.junior.
     */


    /*
     *   Question 6:
     *   What is the difference between a checked and an unchecked exception in Java? Write an example code snippet that
     *   throws both types of exceptions.
     *
     *   Answer: A checked exception is the type that needs to be caught or declared in the method signature. Unchecked
     *   exception is the type of exception that does not have to be checked or declared.
     */
    /*public void demonstrateCheckedException(int a, int b) throws IOException {
        BufferedReader mBufferedReader = new BufferedReader(new FileReader("File.txt"));
        if(a == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        int result = b / a;
    }*/

    /*
     *   Question 7:
     *   What is the difference between a static method and an instance method in Java? Write an example code snippet
     *   that uses both types of methods.
     *
     *   Answer:
     *   Static method belongs to the class itself and is called by referencing the class itself without creating an
     *   instance of the class first. An instance class requires the instance of the class to be created first before
     *   the code can be able to call this class type.
     */
     public static void staticMethod() {
         //This is how we call a static method - this method.
         JuniorLevelQuestions.staticMethod();
     }

     public void instanceMethod() {
         //This is how we call an instance method - this method.
         JuniorLevelQuestions mJuniorLevelQuestions = new JuniorLevelQuestions();
         mJuniorLevelQuestions.instanceMethod();
     }

    /*
     *   Question 8:
     *   What is the purpose of the super keyword in Java? Write an example code snippet that uses the super keyword.
     *
     *   Answer:
     *   The super keyword is used to call a method or constructor in the super class.
     *
     *   Example: See Main.java
     */

    /*
     *   Question 9:
     *   What is the difference between public, protected, default and private access modifiers in Java? Write an example
     *   code snippet that uses all three access modifiers.
     *
     *   Answer:
     *   public: var can be accessed from any class within the project
     *   protected: var can be accessed from within the package and by sub classes
     *   default: var can be accessed from within the same package only
     *   private: var can only be accessed from the class itself
     *
     *   Example:
     *   See demoaccess and demoaccessmore packages.
     */

    /*
     *   Question 10:
     *   What is polymorphism in Java? Write an example code snippet that demonstrates polymorphism.
     *
     *   Answer:
     *   Talks about method overloading: which occurs when the method shares the same name with another but  a different
     *   set of input parameters (or arguments in type or number) and/or return type.
     *   Also talks about method overriding: which is the act of the subclass to implement the logic of a method that
     *   it inherits from the super class and provide its native functionality.
     */

    /*
     *   Question 11:
     *   Fix the following code to properly implement a binary search algorithm:
     *   public static int binarySearch(int[] arr, int target) {
            int low = 0;
            int high = arr.length;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (arr[mid] < target) {
                    low = mid + 1;
                } else if (arr[mid] > target) {
                    high = mid - 1;
                } else {
                    return mid;
                }
            }
            return -1;
        }
     */
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] < target) {
                low = mid + 1;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    /*
     *   Question 12:
     *   Fix the following code to correctly add elements to a HashSet:
     *   Set<String> set = new Set<String>();
     *
     *   Answer:
     *   Set is an interface and cannot be directly instantiated. Have to use the equivalent class HashSet on the right.
     *   Set<String> set = new HashSet<String>();
     */
    public void addToHashSet() {
        //Will throw a compile error "'Set' is abstract; cannot be instantiated"
        //Set<String> set = new Set<String>();
        //Will work
        Set<String> set = new HashSet<String>();
        set.add("apple");
        set.add("banana");
        set.add("orange");
    }
    /*
     *   Question 13:
     *   What is the difference between a HashMap and a TreeMap in Java?
     *
     *   Answer:
     *   HashMap and TreeMap are both implementations of the Map interface. HashMap creates an unordered collection of
     *   key-value pairs. TreeMap creates an ordered collection of key-value pairs based on the natural ordering of the
     *   keys. HashMap accepts null keys and values. TreeMap does not allow null keys and values. HashMap operates at
     *   constant time complexity. TreeMap operates at logarithmic time complexity.
     */

    /*
     *   Question 14:
     *   What is the difference between a stack and a queue in Java?
     *
     *   Answer:
     *   Stack is a Last In First Out (LIFO) data structure in which data elements are added and removed from the same
     *   end. Stack is implemented using the Stack/Deque classes using push() and pop() methods to add and retrieve data
     *   elements respectively.
     *
     *   Queue is a First In First Out (FIFO) data structure in which data elements are added at the back and removed
     *   from the front. Queue is implemented using Queue/LinkedList classes using offer() and poll() methods to add and
     *   retrieve data elements respectively.
     */

    /*
     *   Question 15:
     *   What is the difference between an ArrayList and a LinkedList in Java?
     *
     *   Answer:
     *   Both the ArrayList and the LinkedList data structures are implementations of the List interface. Arraylist is
     *   a dynamic array which grows programmatically as data elements are added to it. LinkedList is a doubly-linked
     *   data structure which has reference to both the next and previous adjacent data elements.
     */

    /*
     *   Question 16:
     *   Fix the following code to correctly check if a string is a palindrome:
     *
     *   Answer:
     *   See Main.Java isPalindrome() function.
     *
     */

    /*
     *   Question 17:
     *   What is the difference between a HashSet and a TreeSet in Java?
     *
     *   Answer:
     *   Both HashSet and TreeSet are implementations of the Set interface. HashSet uses the hash table to store its
     *   data elements and does not guarantee the order of its data elements. TreeSet uses the red-black binary search
     *   tree to store its data elements and guarantees the order of its data elements.
     */
}
