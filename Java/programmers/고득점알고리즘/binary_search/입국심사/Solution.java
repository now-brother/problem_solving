package java.programmers.고득점알고리즘.binary_search.입국심사;

import java.util.*;

class Solution {
    public long solution(int n, int[] times) {
        Arrays.sort(times);
        
        long answer = 0;
        long left = 1;
        long right = (long)n * times[times.length - 1];
        answer = right;
        
        while(left <= right){
            long mid = (left + right) / 2;
            
            long l = 0;
            for(int i : times){
                l += mid / i;
                if(l >= n)
                    break;
            }
            
            if (l >= n) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
                
        return answer;
    }
}