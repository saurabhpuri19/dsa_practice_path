package org.practice;

import java.util.*;

public class groupAnagram {
    public static void main(String[] args) {
        String[] str = {"act", "pots", "tops", "cat", "stop", "hat"};
        List<List<String>> result = isGroupAnagram(str);
        System.out.println("result ::::: " + result);
    }

    public static List<List<String>> isGroupAnagram(String[] str) {
        Map<String, List<String>> map = new HashMap<>();
        for (String word : str) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);
            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }
            map.get(sortedWord).add(word);
        }
        return new ArrayList<>(map.values());
    }

}
