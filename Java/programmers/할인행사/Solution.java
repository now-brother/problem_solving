package Java.programmers.할인행사;

import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int n1 = number.length;
        HashMap<String, Integer> hash = new HashMap<>();
        
        for(int i = 0; i < n1; i++){
            String str = want[i];
            hash.put(str, 0);
        }
        int n2 = discount.length - 9;
        for(int i = 0; i < n2; i++){
            for(int j = i; j < i + 10; j++){
                if(hash.containsKey(discount[j])){
                    hash.put(discount[j], hash.get(discount[j]) + 1);
                }
            }
            boolean flag = true;
            for(int j = 0; j < n1; j++){
                if(hash.get(want[j]) != number[j]){
                    flag = false;
                    break;
                }
            }
            if(flag == true)
                answer++;
            
            for(int j = 0; j < n1; j++){
                hash.put(want[j], 0);
            }
            
        }
        
        
        return answer;
    }
}