package com.hopetoknow._2942_find_words_containing_character;

import java.util.ArrayList;
import java.util.List;

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
}
