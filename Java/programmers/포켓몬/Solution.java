package java.programmers.포켓몬;

import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int p : nums){
            if(!arr.contains(p)){
                arr.add(p);
                answer++;
                if(answer == nums.length/2){
                    break;
                }
            }
        }
        
        return answer;
    }
}