package java.programmers.level2.롤케이크자르기;

import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;

        HashMap<Integer, Integer> left = new HashMap<>();
        HashMap<Integer, Integer> right = new HashMap<>();

        for (int t : topping) {
            right.put(t, right.getOrDefault(t, 0) + 1);
        }

        for (int i = 0; i < topping.length; i++) {
            int t = topping[i];

            left.put(t, left.getOrDefault(t, 0) + 1);

            right.put(t, right.get(t) - 1);
            if (right.get(t) == 0) {
                right.remove(t);
            }

            if (left.size() == right.size()) {
                answer++;
            }
        }

        return answer;
    }
}

