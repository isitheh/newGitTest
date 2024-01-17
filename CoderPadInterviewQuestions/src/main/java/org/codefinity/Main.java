package org.codefinity;

import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. Junior Java Developer Interview Questions");
        Animal[] mAnimalArr = new Animal[2];
        mAnimalArr[0] = new Dog();
        mAnimalArr[1] = new Cat();
        for(int i = 0; i < mAnimalArr.length; i++) {
            mAnimalArr[i].makeSound();
        }

        System.out.println(FixTheseFunctions.binarySearch(new int [] {1, 2 , 3, 4 ,5 , 6, 7}, 1));
        System.out.println("2. Intermediate Java Developer Interview Questions");
        FixTheseFunctions.addToHashSet();
        FixTheseFunctions.hashMapsVersusTreeMap();
        FixTheseFunctions.demonstrateEquals();
        System.out.println(FixTheseFunctions.isPalindrome("madam"));
    }
}

class Animal {
    public void makeSound() {
        System.out.println("Make a generic animal sound.");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow");
    }
}

class FixTheseFunctions {
    private static List<String> myList = new ArrayList<>();
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

    public static void sortStrings(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = (i+1); j < arr.length; j++) {
                if (arr[j-1].compareTo(arr[j]) > 0) {
                    String temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void addToHashSet() {
        //Will not work
        //Set<String> set = new Set<String>();
        //Will work
        Set<String> set = new HashSet<String>();
        set.add("apple");
        set.add("banana");
        set.add("orange");
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int result = 1;
        for (int i = n; i > 1; i--) {
            result *= i;
        }
        return n;
    }

    public static void hashMapsVersusTreeMap() {
        Map<Integer, String> mHmap = new HashMap<>();
        mHmap.put(35, "Baba");
        mHmap.put(34, "Mama");
        mHmap.put(5, "Unesu");
        mHmap.put(11, "Thabi");
        System.out.println("1.0 =================================");
        for(Map.Entry map: mHmap.entrySet()) {
            System.out.println(map.getKey() + " " + map.getValue());
        }
        Map<Integer, String> mTmap = new TreeMap<>();
        mTmap.put(35, "Baba");
        mTmap.put(34, "Mama");
        mTmap.put(5, "Unesu");
        mTmap.put(11, "Thabi");
        System.out.println("2.0 =================================");
        for(Map.Entry map: mTmap.entrySet()) {
            System.out.println(map.getKey() + " " + map.getValue());
        }
    }

    public static void demonstrateEquals() {
        String mStr1 = "Hello";
        String mStr2 = "Hello";
        String mStr3 = new String("Hello");

        //Will return true because the object mStr1 and mStr2 refer to the same object in memory.
        System.out.println(mStr1 == mStr2);

        //Will return true because the value of mStr1 and mStr2 is the same value.
        System.out.println(mStr1.equals(mStr2));

        //Will return false because the object mStr1 and mStr3 do not refer to the same object in memory.
        System.out.println(mStr1 == mStr3);

        //Will return true because the value of mStr1 and mStr3 is the same value.
        System.out.println(mStr1.equals(mStr3));
    }

    public static boolean isPalindrome(String s) {
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed = reversed.concat(String.valueOf(s.charAt(i)));
        }
        return s.equals(reversed);
    }

    public static void addListToMyList(List<String> list) {
        myList.addAll(list);
    }

    public static void removeElement(String element) {
        Iterator<String> mIterator = myList.iterator();
        while (mIterator.hasNext()) {
            String str = mIterator.next();
            if (str.equals(element)) {
                myList.remove(str);
            }
        }
    }
}