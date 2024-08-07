package com.hopetoknow.from_1500_to_1999._1678_goal_parser_interpretation;

class Solution {
    public String interpret(String command) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G') {
                answer.append('G');
            }

            if (command.charAt(i) == '(') {
                if (command.charAt(i + 1) == ')') {
                    answer.append('o');
                    i++;
                } else {
                    answer.append("al");
                    i += 3;
                }
            }
        }

        return answer.toString();
    }

    public String interpret2(String command) {
        return command.replace("()", "o").replace("(al)", "al");
    }
}
