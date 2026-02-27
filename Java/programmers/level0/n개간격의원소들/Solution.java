package java.programmers.level0.n개간격의원소들;

import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer;
        if(num_list.length % n == 0) answer = new int[num_list.length / n];
        else answer = new int[num_list.length / n + 1];
        
        int temp = 0;
        for(int i = 0; i < num_list.length; i += n){
            answer[temp] = num_list[i];
            temp++;
        }
        
        return answer;
    }
}