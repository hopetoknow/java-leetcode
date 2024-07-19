package com.hopetoknow._1598_crawler_log_folder;

import java.util.Arrays;
import java.util.Stack;

class Solution {
    public int minOperations(String[] logs) {
        int ans = 0;

        for (String log : logs) {
            if (log.equals("../")) {
                ans = Math.max(0, ans - 1);
            } else if (!log.equals("./")) {
                ans++;
            }
        }

        return ans;
    }

    public int minOperations2(String[] logs) {
        return Arrays.stream(logs)
                .mapToInt(log -> log.lastIndexOf("."))
                .reduce(0, (depth, index) -> Math.max(0, depth - index));
    }

    public int minOperations3(String[] logs) {
        Stack<String> stack = new Stack<>();

        for (String log : logs) {
            if (log.equals("../")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!log.equals("./")) {
                stack.push(log);
            }
        }

        return stack.size();
    }

    public int minOperations4(String[] logs) {
        int ans = 0;

        for (String log : logs) {
            switch (log) {
                case "../":
                    if (ans > 0) ans--;
                    break;
                case "./":
                    break;
                default:
                    ans++;
                    break;
            }
        }

        return ans;
    }

    public int minOperations5(String[] logs) {
        int ans = 0;

        for (String log : logs) {
            ans = switch (log) {
                case "../" -> ans > 0 ? ans - 1 : ans;
                case "./" -> ans;
                default -> ans + 1;
            };
        }

        return ans;
    }
}
