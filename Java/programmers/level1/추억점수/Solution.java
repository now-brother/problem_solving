package java.programmers.level1.추억점수;

import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        HashMap<String, Integer> hash = new HashMap<>();
        
        for(int i = 0; i < name.length; i++){
            hash.put(name[i], yearning[i]);
        }
        
        for(int i = 0; i < photo.length; i++){
            String[] photos = photo[i];
            int score = 0;
            for(int j = 0; j < photos.length; j++){
                score = score + hash.getOrDefault(photos[j], 0);
            }
            answer[i] = score;
        }
        
        return answer;
    }
}