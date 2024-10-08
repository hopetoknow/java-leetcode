package com.hopetoknow.from_0500_to_0999._0804_unique_morse_code_words;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        Map<Character, String> map = new HashMap<>();

        map.put('a', ".-");
        map.put('b', "-...");
        map.put('c', "-.-.");
        map.put('d', "-..");
        map.put('e', ".");
        map.put('f', "..-.");
        map.put('g', "--.");
        map.put('h', "....");
        map.put('i', "..");
        map.put('j', ".---");
        map.put('k', "-.-");
        map.put('l', ".-..");
        map.put('m', "--");
        map.put('n', "-.");
        map.put('o', "---");
        map.put('p', ".--.");
        map.put('q', "--.-");
        map.put('r', ".-.");
        map.put('s', "...");
        map.put('t', "-");
        map.put('u', "..-");
        map.put('v', "...-");
        map.put('w', ".--");
        map.put('x', "-..-");
        map.put('y', "-.--");
        map.put('z', "--..");

        Set<String> set = new HashSet<>();

        for (String word : words) {
            StringBuilder sb = new StringBuilder();

            for (char ch : word.toCharArray()) {
                sb.append(map.get(ch));
            }

            set.add(sb.toString());
        }

        return set.size();
    }

    public int uniqueMorseRepresentations2(String[] words) {
        String[] codes = new String[] {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",
                "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",
                "..-", "...-", ".--", "-..-", "-.--", "--.."};

        Set<String> set = new HashSet<>();

        for (String word : words) {
            StringBuilder sb = new StringBuilder();

            for (char ch : word.toCharArray()) {
                sb.append(codes[ch - 'a']);
            }

            set.add(sb.toString());
        }

        return set.size();
    }

    public int uniqueMorseRepresentations3(String[] words) {
        String[] codes = new String[] {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",
                "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",
                "..-", "...-", ".--", "-..-", "-.--", "--.."};

        return (int) Arrays.stream(words)
                .map(word -> word.chars()
                        .mapToObj(ch -> codes[ch - 'a'])
                        .collect(Collectors.joining()))
                .distinct()
                .count();
    }

    public int uniqueMorseRepresentations4(String[] words) {
        String[] codes = new String[] {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",
                "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",
                "..-", "...-", ".--", "-..-", "-.--", "--.."};

        return Arrays.stream(words)
                .map(word -> word.chars()
                        .mapToObj(ch -> codes[ch - 'a'])
                        .collect(Collectors.joining()))
                .collect(Collectors.toSet())
                .size();
    }
}
