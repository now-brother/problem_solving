package java.programmers.달리기경주;

import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        
        HashMap<String, Integer> hash1 = new HashMap<>();
        HashMap<Integer, String> hash2 = new HashMap<>();
        
        for(int i = 0; i < players.length; i++){
            hash1.put(players[i], i + 1);
            hash2.put(i + 1, players[i]);
        }
        
        for(String p1 : callings){
            int n = hash1.get(p1);
            String p2 = hash2.get(n - 1);
            
            hash1.put(p1, n - 1);
            hash1.put(p2, n);
            hash2.put(n, p2);
            hash2.put(n - 1, p1);
        }
        
        for(int i = 0; i < players.length; i++){
            answer[i] = hash2.get(i + 1);
        }
        
        return answer;
    }
}
