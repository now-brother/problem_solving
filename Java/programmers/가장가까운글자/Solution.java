package java.programmers.가장가까운글자;

import java.util.*;

class Solution {
    public int[] solution(String s) {
        int n = s.length();    
        int[] answer = new int[n];
        HashMap<Character, Integer> hash = new HashMap<>();
        
        for(int i = 0; i < n; i++){
            char c = s.charAt(i);
            if(hash.containsKey(c)){
                answer[i] = i - hash.get(c);
                hash.put(c, i);
            }else{
                hash.put(c, i);
                answer[i] = -1;
            }
        }
        
        return answer;
    }
}
