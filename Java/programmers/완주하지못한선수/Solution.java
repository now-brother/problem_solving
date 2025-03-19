package Java.programmers.완주하지못한선수;

import java.util.*;

public class Solution {
    public String solution(String[] participant, String[] completion) {
        
        HashMap<String, Integer> hash = new HashMap<>();
        int n = 0;
        String answer = "";
        for(String str : completion){
            hash.put(str, hash.getOrDefault(str, 0) + 1);
        }
        for(String str : participant){
            if(hash.getOrDefault(str,0) == 0){
                answer = str;
                return answer;
            }
            hash.put(str, hash.get(str) - 1);
        }
        return answer;
    }
}
