package com.hopetoknow.from_2000_to_2499._2000_reverse_prefix_of_word;

class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        int n = word.length();

        for (int i = 0; i < n; i++) {
            char letter = word.charAt(i);
            sb.append(letter);

            if (letter == ch) {
                sb.reverse();
                sb.append(word, i + 1, n);
                break;
            }
        }

        return sb.toString();
    }

    public String reversePrefix2(String word, char ch) {
        int i = word.indexOf(ch);

        if (i == -1) {
            return word;
        }

        return new StringBuilder(word.substring(0, i + 1)).reverse() + word.substring(i + 1);
    }

    public String reversePrefix3(String word, char ch) {
        int index = word.indexOf(ch);

        if (index == -1) {
            return word;
        }

        char[] arr = word.toCharArray();

        for (int i = 0; i < index; i++, index--) {
            char temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        return new String(arr);
    }
}
