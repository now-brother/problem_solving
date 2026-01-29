package java.programmers.영어끝말잇기;

import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        ArrayList<String> used = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            if (used.contains(word)) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                break;
            }

            if (i > 0) {
                String prev = words[i - 1];
                if (prev.charAt(prev.length() - 1) != word.charAt(0)) {
                    answer[0] = (i % n) + 1;
                    answer[1] = (i / n) + 1;
                    break;
                }
            }

            used.add(word);
        }

        return answer;
    }
}