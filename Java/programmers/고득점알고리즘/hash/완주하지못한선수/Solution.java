package java.programmers.고득점알고리즘.hash.완주하지못한선수;

import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {        
        String answer = "";
        
        HashMap<String, Integer> hash = new HashMap<>();
        
        for(String s : completion){
            hash.put(s, hash.getOrDefault(s,0) + 1);
        }

        for(String s : participant){
            if(hash.getOrDefault(s,0) - 1 < 0){
                answer = s;
                break;
            }else{
                hash.put(s, hash.get(s) - 1);
            }
        }
        
        return answer;
    }
}