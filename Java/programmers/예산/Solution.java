package Java.programmers.예산;

import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        Arrays.sort(d);
        for(int c : d){
            if(c > budget)
                break;
            answer++;
            budget -= c;
        }
        
        return answer;
    }
}