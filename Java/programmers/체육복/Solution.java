package java.programmers.체육복;

import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        Set<Integer> reserveSet = new HashSet<>();
        Set<Integer> lostSet = new HashSet<>();

        for (int r : reserve) reserveSet.add(r);
        for (int l : lost) {
            if (reserveSet.contains(l)) {
                reserveSet.remove(l);
            } else {
                lostSet.add(l);
            }
        }

        for (int l : lostSet) {
            if (reserveSet.contains(l - 1)) {
                reserveSet.remove(l - 1);
            } else if (reserveSet.contains(l + 1)) {
                reserveSet.remove(l + 1);
            } else {
                answer--; 
            }
        }

        return answer;
    }
}
