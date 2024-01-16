package org.codefinity.streamscollection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public StreamExample() {
    }

    public void anExample() {
        List<String> listOfStrings = Arrays.asList("Unlock", "Infinity", "with", "Codefinity");
        //Convert o a stream
        Stream<String> mStream = listOfStrings.stream();
        //Map over the stream
        List<String> list = mStream
                .filter(e -> e.length() > 8)
                .map(e -> e.toUpperCase()).toList();
        System.out.println(list);
    }

    public void anExampleTaskOne() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> mNumberStream = numbers.stream();
        List<Integer> list = mNumberStream.map(e -> e*e).toList();
        System.out.println(list);
    }

    public void anExampleTaskTwo() {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eva");
        Stream<String> mNames = names.stream();
        int  longestNamesLength = 0;
        List<Integer> listLengths = mNames.map(e -> e.length()).toList();
        for (Integer listLength : listLengths) {
            if (listLength > longestNamesLength) longestNamesLength = listLength;
        }
        System.out.println(longestNamesLength);
    }

    public void anExampleTaskThree() {
        List<String> sentences = Arrays.asList(
            "Java Stream API provides a fluent interface for processing sequences of elements.",
            "It supports functional-style operations on streams of elements, such as map-reduce transformations.",
            "In this exercise, you need to count the total number of words in all sentences."
        );
        Stream<String> mSentences = sentences.stream();
        long count = mSentences.flatMap(e -> Arrays.stream(e.split(" "))).distinct().count();
        System.out.println(count);
    }

    /*Use Stream API to find the concatenation of the first two words that have even lengths.*/
    public void anExampleTaskFour() {
        List<String> mWords = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        Stream<String> mWordsStream = mWords.stream();
        List<String> evenWords = mWordsStream.filter(e -> (e.length() % 2 == 0)).toList();
        String mResult = evenWords.stream().limit(2).collect(Collectors.joining());
        System.out.println(mResult);
    }

    /*Use Stream API to find the sum of the squares of even numbers in the list.*/
    public void anExampleTaskFive() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer mSum = numbers.stream().filter(e -> (e % 2 == 0)).toList().stream().mapToInt(e -> e*e).sum();
        System.out.println(mSum);
    }

    /*Use Stream API to group words by their lengths and collect the result into a Map.*/
    public void anExampleTaskSix() {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        Map mResult = words.stream().collect(Collectors.groupingBy(e -> e.length()));
        System.out.println(mResult);
    }
}
