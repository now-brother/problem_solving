package java.programmers.level1.성격유형검사하기;

import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> scores = new HashMap<>();
        char[][] types = {{'R','T'}, {'C','F'}, {'J','M'}, {'A','N'}};

        for (int i = 0; i < survey.length; i++) {
            String s = survey[i];
            int choice = choices[i];

            if (choice < 4) {
                char type = s.charAt(0);
                scores.put(type, scores.getOrDefault(type, 0) + (4 - choice));
            } else if (choice > 4) {
                char type = s.charAt(1);
                scores.put(type, scores.getOrDefault(type, 0) + (choice - 4));
            }
        }
        StringBuilder result = new StringBuilder();
        for (char[] pair : types) {
            char first = pair[0];
            char second = pair[1];

            int firstScore = scores.getOrDefault(first, 0);
            int secondScore = scores.getOrDefault(second, 0);

            if (firstScore >= secondScore) {
                result.append(first);
            } else {
                result.append(second);
            }
        }

        return result.toString();
    }
}
