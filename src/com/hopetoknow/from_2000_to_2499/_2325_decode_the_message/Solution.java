package com.hopetoknow.from_2000_to_2499._2325_decode_the_message;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character, Character> table = new HashMap<>();
        char[] abc = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int index = 0;

        for (char ch : key.toCharArray()) {
            if (ch == ' ' || table.containsKey(ch)) {
                continue;
            }

            table.put(ch, abc[index++]);

            if (index == 26) {
                break;
            }
        }

        StringBuilder ans = new StringBuilder();

        for (char ch : message.toCharArray()) {
            ans.append(ch == ' ' ? ' ' : table.get(ch));
        }

        return ans.toString();
    }

    public String decodeMessage2(String key, String message) {
        char[] table = new char[128];
        table[' '] = ' ';

        for (int i = 0, abcIndex = 0; i < key.length(); i++) {
            char ch = key.charAt(i);

            if (table[ch] == 0) {
                table[ch] = (char)('a' + abcIndex++);
            }
        }

        char[] ans = message.toCharArray();

        for (int i = 0; i < ans.length; i++) {
            ans[i] = table[ans[i]];
        }

        return new String(ans);
    }
}
