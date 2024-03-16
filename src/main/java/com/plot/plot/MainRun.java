package com.scalar.plot;

import java.util.Arrays;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MainRun {
    public static void main(String[] args) {



        String input = "abcdeabce";

        // Find the first non-repeating character using streams
        Character result = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);


        Character results =    input.chars().mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                        .entrySet().stream().filter(val -> val.getValue()==1)
                        .map(Map.Entry::getKey).findFirst().orElse(null);



        // Print the result
        System.out.println("First non-repeating character: " + result);






    }
}
