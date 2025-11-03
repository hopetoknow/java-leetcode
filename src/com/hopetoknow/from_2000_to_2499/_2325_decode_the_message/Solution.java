package com.hopetoknow.from_2000_to_2499._2325_decode_the_message;

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
}
