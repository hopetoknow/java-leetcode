package com.hopetoknow._2942_find_words_containing_character;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != - 1) {
                answer.add(i);
            }
        }

        return answer;
    }

    public List<Integer> findWordsContaining2(String[] words, char x) {
        return IntStream.range(0, words.length)
                .filter(index -> words[index].indexOf(x) != -1)
                .boxed()
                .toList();
    }
}
